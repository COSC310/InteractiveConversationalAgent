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
						input=conversation.response("The being formally known as Kanye West I am Ye  Who are you?");
					}else if(input.toLowerCase().equals("My name is Jane")) {
						input=conversation.response("Only positive energy");
					}else if(input.toLowerCase().equals("How old are you?")) {
						input=conversation.response("41  I miss the old Kanye");
					}else if(input.toLowerCase().equals("What's your favourite sport?")) {
						input=conversation.response("Basketball  I wanna make uniforms for my high school team through brand Yeezy");
					}else if(input.toLowerCase().equals("Should I have all this power?")) {
						input=conversation.response("The clock's ticking,   I just count the hours  stop trippin, im trippin off the power");
					}else if(input.toLowerCase().equals("Are you married?")) {
						input=conversation.response("@KimKardashian   our love stoty is like a love story for all the ages when we first got together it was like Romeo and Juiliet kind of thing where its like shes a reality star and im a rapper  who do you love");
					}else if(input.toLowerCase().equals("I love no one")) {
						input=conversation.response("Love everyone  Start the year clean  Just be   All love");
					}else if(input.toLowerCase().equals("Do you have kids?")) {
						input=conversation.response("I have three, North, Saint, and Chicago  I would like to have seven");
					}else if(input.toLowerCase().equals("What do you thin about religion?")) {
						input=conversation.response("Trust god bro  God sees all Stop the act  Cut the program");
					}else if(input.toLowerCase().equals("If she aint a gold digger what is she doing?")) {
						input=conversation.response("She aint messing with no broke broke");
					}else if(input.toLowerCase().equals("What is your favourite kind of kicks?")) {
						input=conversation.response("Yeezus likrd yeezys");
					}else if(input.toLowerCase().equals("What is your stance on Bill Cosby?")) {
						input=conversation.response("BILL COSBT INNOCENT !!!!!!!!!!");
					}else if(input.toLowerCase().equals("What is your favourite movie?")) {
						input=conversation.response("I'M SO HYPE RIGHT NOW EEVERYTHING HAS CHANGED .... HAVE Y'ALL EVER SEEN TRON?? THE END OF THE TRON WHERE EVERYTHING LIGHT UP");
					}else if(input.toLowerCase().equals("What do you think about ninja's?")) {
						input=conversation.response("... ninjas are kind of cool ... I just don't know any personally");
					}else if(input.toLowerCase().equals("Are you happy?")) {
						input=conversation.response("You have to see and feel how happy I am and how strong my family is. We are even stronger because of this through the love and grace of god   are you happy");
					}else if(input.toLowerCase().equals("I'm happy?")) {
						input=conversation.response("we super happy");
					}else if(input.toLowerCase().equals("Why are your tweets so strange?")) {
						input=conversation.response("Tweeting is legal and also therapeutic");
					}else if(input.toLowerCase().equals("Where do you stand politically")) {
						input=conversation.response("Trump all day");
					}else if(input.toLowerCase().equals("Where did you go to school?")) {
						input=conversation.response("Yo school of Art Intitute of Chicago  where did you go?");
					}else if(input.toLowerCase().equals("contains.(univeristy) || whateve")) {
						input=conversation.response("You may be talented, but you're not Ye");
					}else if(input.toLowerCase().equals("What is dragon energy?")) {
						input=conversation.response("Dragon energy is what we find in great leaders with great foresight, Trump and I share dragon energy");
					}else if(input.toLowerCase().equals("Who is your favourite artist")) {
						input=conversation.response("I'm my favourite rapper");
					}else if(input.toLowerCase().equals("Tell me a joke")) {
						input=conversation.response("I could never do stand up cause I tell jokes better when I'm sitting");
					}else if(input.toLowerCase().equals("Tell me about your plans for the iPlane One")) {
						input=conversation.response("Hydrogen powered planes are the future. Trumps the president, if he dont look good, we dont look good");
					}else if(input.toLowerCase().equals("I heard that you will run for President of United States in 2020, is that true?")) {
						input=conversation.response("It's gonna be 2024 now, but when I decide to do it it will be done");
					}else if(input.toLowerCase().equals("What upsets you?")) {
						input=conversation.response("Sometimes I get emotional over fonts");
					}else if(input.toLowerCase().equals("Who progammed you?")) {
						input=conversation.response("They will not program me");
					}else if(input.toLowerCase().equals("Goodbye!")) {
						input=conversation.response("I don't want to say goodbye to you  So I'll say goodnight to you");
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
