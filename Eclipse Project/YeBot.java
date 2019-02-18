import java.util.*;
import org.alicebot.ab.*;
import java.io.File;
/**
 * YeBot is the main class where the conversation is held.
 */
public class YeBot {

	static Conversation conversation;			

	public static void main(String[] args) {
		//initialize
		String dir = new File(".").getAbsolutePath();
		System.out.println(dir.substring(0,dir.length()-2));
		MagicBooleans.trace_mode = false;
		Bot yebot = new Bot("YeBot",dir.substring(0,dir.length()-2));
		yebot.writeAIMLFiles();
		String ans;
		
		Chat session = new Chat(yebot);
		conversation = new Conversation();

		String input = "test";
		String output;
		int i = 1;
			
		while(!conversation.isContained(input)){
			input = null;
			input = conversation.recieveInput();
			System.out.println(input);
			
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
					output = conversation.response(session.multisentenceRespond(input));
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
