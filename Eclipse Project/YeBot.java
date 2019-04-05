import java.util.*;
import org.alicebot.ab.*;
import java.io.File;
import rita.*;
/**
 * YeBot is the main class where the conversation is held.
 */
public class YeBot {

	static Conversation conversation;			

	public static void main(String[] args) {
		//initialize
		//RiTa is my api for WordNet
		//WordNet is required to be install in this directory
		RiWordNet rw = new RiWordNet("C://Program Files (x86)//WordNet//2.1//dict");//directory for wordnet 2.1
		rw.randomizeResults(false); //do not randomize rita results
		
		String dir = new File(".").getAbsolutePath();
		System.out.println(dir.substring(0,dir.length()-2));
		MagicBooleans.trace_mode = false;
		Bot yebot = new Bot("YeBot",dir.substring(0,dir.length()-2));
		yebot.writeAIMLFiles();
		
		Boolean bk; //break boolean -- if true break out of both loops
		
		//arraylist of unknown responses
		ArrayList<String> negative = new ArrayList<String>();
		negative.add("wish i could help   i dont know what that means");
		negative.add("you got good vibes   but i dont know what to say to that");
		negative.add("yo man you gotta slow down   maybe try saying that a different way");
		
		
		Chat session = new Chat(yebot);
		conversation = new Conversation();

		String input = "test";
		String output;
		int i = 1;
			
		while(!conversation.isContained(input)){
			String noun = "";
			input = null;
			input = conversation.recieveInput();
			//System.out.println(input);
			bk = false;
			if (input!=""&&input!=null&&input.length()>1||i==1) {
				if(input==""||input==null||input.length()<1) {
					//start conversation
					output = conversation.response("Ye is in the BUILDING!");
					i=0;	
				}
				else if(conversation.isContained(input)) {
					//user calls for exiting the conversation
					try {
						Thread.sleep(500);
						output = conversation.response(session.multisentenceRespond(input));
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					break;
				}
				else {
					
					//regular response
					//output = conversation.response(session.multisentenceRespond(input));
					output = session.multisentenceRespond(input);
					//System.out.println(output);
					if (!negative.contains(output)){ //if is a known phrase continue as normal 						
					output = conversation.response(session.multisentenceRespond(input));
					}
					else { //check for synonyms
						String[] s = input.split(" ");
						//TODO: get pos tagging to work
						for (int x = 0; x < s.length; x++){
							String[] pos = rw.getPos(s[x]);
							for (int y = 0; y < pos.length; y++){
								if (pos[y].equals("n"))
									noun = s[x];
							}
						}
						for (int j = 0; j<s.length; j++){
							String temp = s[j];
							String[] syn = rw.getAllSynonyms(s[j],"n");//get all synonyms for word in s at index j sentence
							for (int k = 0; k<syn.length; k++){ //cycle through list of synonyms and try to find a good response
								s[j] = syn[k];
								String inputTest = String.join(" ", s);
								output = session.multisentenceRespond(inputTest);
								System.out.println(output);
								
								if (!negative.contains(output)){
									System.out.println("test");
									bk = true;
									output = conversation.response(session.multisentenceRespond(inputTest));
									break;
									
								}
								//System.out.println(inputTest);
							}
							if(bk)
								break;
							s[j] = temp;
						}
						if (!bk && !(noun.length()==0)){
							output = conversation.response("i dun' like "+noun+"'s");
						}
						else if (!bk)
							output = conversation.response(session.multisentenceRespond(input));
					}
				}
			}	
		}
		System.exit(1); 	//This statement terminates the program	
		
			//Do you want to start the conversation over? make sure you get valid input (Done)
//			ans = conversation.response("Do you want to start our conversation over? (Y/N)"); 
//			while(ans != null && !ans.toUpperCase().equals("Y") && !ans.toUpperCase().equals("N"))
//				ans = conversation.response("Invalid input. Do you want to start our conversation over? (Y/N)");
		//while(ans.toUpperCase().equals("Y"));	//start over if answer is "Y" or "y"

	}
}
