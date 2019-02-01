import java.util.*;

package src.chatbot;

public class YeBot {
	
	private Scanner client = new Scanner(System.in); //change input type if needed
	
	public void start() {
		//change to end when gui is closed
		while(true) {
			talk();
		}
	}
	
	public void talk() {
		static Conversation conversation;			
		
		public static void main(String[] args) {
			String ans;
			do{								
			//Reset the conversation
				conversation = new Conversation();			
				
				String input = null;
		
				//	set a default max number of response to 5 currently
				int maxResponses=5;	
				//cycle through a conversation with max responses 
				for(int i=0;i<maxResponses;i++){	
					//write code to handle user input
					//just a default for testing user interface
					if(i==0 || input==null || input==""){
						//start the conversation
						input = conversation.response("Hello");
					}else if(input.toLowerCase().equals("hi")) {
						input=conversation.response("How are you?");
					}else if(input.toLowerCase().equals("good. how are you?")) {
						input=conversation.response("Good");
					}else if(input.toLowerCase().equals("what is your name?")) {
						input=conversation.response("Kanye! What is your name?");
					}else {
						input=conversation.response("You said \"" + input + "\" very intereting");
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
}
