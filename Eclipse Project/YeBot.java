import java.util.*;
import org.alicebot.ab.*;
import java.io.File;

public class YeBot {

	static Conversation conversation;			
	
		public static void main(String[] args) {
			//initialize
			String dir = new File(".").getAbsolutePath();
			System.out.println(dir.substring(0,dir.length()-2)+File.separator+"res");
			MagicBooleans.trace_mode = false;
			Bot yebot = new Bot("YeBot",dir.substring(0,dir.length()-2)+File.separator+"res");
			yebot.writeAIMLFiles();
			System.exit(0);
			String ans;
			do{								
			//Reset the conversation
				Chat session = new Chat(yebot);
				conversation = new Conversation();
				
				String input = null;
				 
				while(true){
					if(input==""||input==null||input.length()<1) {
						//start conversation
						input = conversation.response("Hello");
					}
					else if(input=="!quit") {
						break;
					}
					else {
						//regular response
						input = conversation.response(session.multisentenceRespond(input));
					}
				}	
			
				//Do you want to start the conversation over? make sure you get valid input (Done)
				ans = conversation.response("Do you want to start our conversation over? (Y/N)"); 
			while(ans != null && !ans.toUpperCase().equals("Y") && !ans.toUpperCase().equals("N"))
				ans = conversation.response("Invalid input. Do you want to start our conversation over? (Y/N)");
			}while(ans.toUpperCase().equals("Y"));	//start over if answer is "Y" or "y"

			System.exit(1); 	//This statement terminates the program	
		}
		
		
	}
