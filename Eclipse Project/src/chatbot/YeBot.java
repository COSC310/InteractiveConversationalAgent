import java.awt.EventQueue;
import java.util.*;



public class YeBot {

	static BDialog chatYe;			
	
	private Scanner client = new Scanner(System.in); //change input type if needed
	/*
	public void start() {
		//change to end when gui is closed
		while(true) {
			talk();
		}
	}*/
	
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						chatGUI window = new chatGUI();
						window.frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			String ans;
			do{								
			//Reset the conversation
				chatYe = new BDialog();			
				
				String input = null;
		
				//	set a default max number of response to 5 currently
				int maxResponses=5;	
				//cycle through a conversation with max responses 
				for(int i=0;i<maxResponses;i++){	
					//write code to handle user input
					//just a default for testing user interface
					if(i==0 || input==null || input==""){
						//start the conversation
						input = BDialog.response("Hello");
					}else if(input.toLowerCase().equals("hi")) {
						input=BDialog.response("How are you?");
					}else if(input.toLowerCase().equals("good. how are you?")) {
						input=BDialog.response("Good");
					}else if(input.toLowerCase().equals("what is your name?")) {
						input=BDialog.response("The being formally known as Kanye West I am Ye  Who are you?");
					}else if(input.toLowerCase().equals("My name is Jane")) {
						input=BDialog.response("Only positive energy");
					}else if(input.toLowerCase().equals("How old are you?")) {
						input=BDialog.response("41  I miss the old Kanye");
					}else if(input.toLowerCase().equals("What's your favourite sport?")) {
						input=BDialog.response("Basketball  I wanna make uniforms for my high school team through brand Yeezy");
					}else if(input.toLowerCase().equals("Should I have all this power?")) {
						input=BDialog.response("The clock's ticking,   I just count the hours  stop trippin, im trippin off the power");
					}else if(input.toLowerCase().equals("Are you married?")) {
						input=BDialog.response("@KimKardashian   our love stoty is like a love story for all the ages when we first got together it was like Romeo and Juiliet kind of thing where its like shes a reality star and im a rapper  who do you love");
					}else if(input.toLowerCase().equals("I love no one")) {
						input=BDialog.response("Love everyone  Start the year clean  Just be   All love");
					}else if(input.toLowerCase().equals("Do you have kids?")) {
						input=BDialog.response("I have three, North, Saint, and Chicago  I would like to have seven");
					}else if(input.toLowerCase().equals("What do you thin about religion?")) {
						input=BDialog.response("Trust god bro  God sees all Stop the act  Cut the program");
					}else if(input.toLowerCase().equals("If she aint a gold digger what is she doing?")) {
						input=BDialog.response("She aint messing with no broke broke");
					}else if(input.toLowerCase().equals("What is your favourite kind of kicks?")) {
						input=BDialog.response("Yeezus likrd yeezys");
					}else if(input.toLowerCase().equals("What is your stance on Bill Cosby?")) {
						input=BDialog.response("BILL COSBT INNOCENT !!!!!!!!!!");
					}else if(input.toLowerCase().equals("What is your favourite movie?")) {
						input=BDialog.response("I'M SO HYPE RIGHT NOW EEVERYTHING HAS CHANGED .... HAVE Y'ALL EVER SEEN TRON?? THE END OF THE TRON WHERE EVERYTHING LIGHT UP");
					}else if(input.toLowerCase().equals("What do you think about ninja's?")) {
						input=BDialog.response("... ninjas are kind of cool ... I just don't know any personally");
					}else if(input.toLowerCase().equals("Are you happy?")) {
						input=BDialog.response("You have to see and feel how happy I am and how strong my family is. We are even stronger because of this through the love and grace of god   are you happy");
					}else if(input.toLowerCase().equals("I'm happy?")) {
						input=BDialog.response("we super happy");
					}else if(input.toLowerCase().equals("Why are your tweets so strange?")) {
						input=BDialog.response("Tweeting is legal and also therapeutic");
					}else if(input.toLowerCase().equals("Where do you stand politically")) {
						input=BDialog.response("Trump all day");
					}else if(input.toLowerCase().equals("Where did you go to school?")) {
						input=BDialog.response("Yo school of Art Intitute of Chicago  where did you go?");
					}else if(input.toLowerCase().equals("contains.(univeristy) || whateve")) {
						input=BDialog.response("You may be talented, but you're not Ye");
					}else if(input.toLowerCase().equals("What is dragon energy?")) {
						input=BDialog.response("Dragon energy is what we find in great leaders with great foresight, Trump and I share dragon energy");
					}else if(input.toLowerCase().equals("Who is your favourite artist")) {
						input=BDialog.response("I'm my favourite rapper");
					}else if(input.toLowerCase().equals("Tell me a joke")) {
						input=BDialog.response("I could never do stand up cause I tell jokes better when I'm sitting");
					}else if(input.toLowerCase().equals("Tell me about your plans for the iPlane One")) {
						input=BDialog.response("Hydrogen powered planes are the future. Trumps the president, if he dont look good, we dont look good");
					}else if(input.toLowerCase().equals("I heard that you will run for President of United States in 2020, is that true?")) {
						input=BDialog.response("It's gonna be 2024 now, but when I decide to do it it will be done");
					}else if(input.toLowerCase().equals("What upsets you?")) {
						input=BDialog.response("Sometimes I get emotional over fonts");
					}else if(input.toLowerCase().equals("Who progammed you?")) {
						input=BDialog.response("They will not program me");
					}else if(input.toLowerCase().equals("Goodbye!")) {
						input=BDialog.response("I don't want to say goodbye to you  So I'll say goodnight to you");
					}else {
						input=BDialog.response("You said \"" + input + "\" very intereting");
					}
				}	
			
				//Do you want to start the conversation over? make sure you get valid input (Done)
				ans = BDialog.response("Do you want to start our conversation over? (Y/N)"); 
			while(ans != null && !ans.toUpperCase().equals("Y") && !ans.toUpperCase().equals("N"))
				ans = BDialog.response("Invalid input. Do you want to start our conversation over? (Y/N)");
			}while(true);	//start over if answer is "Y" or "y"

			//System.exit(1); 	//This statement terminates the program	
		}
		
		
	}
