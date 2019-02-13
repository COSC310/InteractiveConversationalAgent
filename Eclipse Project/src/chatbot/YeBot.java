import java.util.*;



public class YeBot {

	static Conversation conversation;			
	
	private Scanner client = new Scanner(System.in); //change input type if needed
	/*
	public void start() {
		//change to end when gui is closed
		while(true) {
			talk();
		}
	}*/
	
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
					//(Arrays.asList("bad").stream().anyMatch(input::contains))
					if(input != null)
						input = input.toLowerCase();
					
					if(i==0 || input==null || input==""){
						//start the conversation
						input = conversation.response("Hello");
					//Greetings	
					}else if((Arrays.asList("hello", "hi", "hey", "good morning", "good evening", "good afternoon")).stream().anyMatch(input::contains)) {
						input=conversation.response("How are you?");
					}else if((Arrays.asList("good. how are you?", "bad", "swell", "good", "meh").stream().anyMatch(input::contains))) {
						input=conversation.response("Good");
					}else if((Arrays.asList("what is your name?", "your name", "are you kanye").stream().anyMatch(input::contains))) {
						input=conversation.response("The being formally known as Kanye West I am Ye  Who are you?");
					}else if((Arrays.asList("my name is").stream().anyMatch(input::contains))) {
						input=conversation.response("Nice to meet you");
					}else if((Arrays.asList("where are you from", "where do you live", "location", "you live", "your home").stream().anyMatch(input::contains))) {
						input=conversation.response("Calabasas and Hidden Hills");
					}else if((Arrays.asList("how old are you", "what is your age", "your age").stream().anyMatch(input::contains))) {
						input=conversation.response("41  I miss the old Kanye");
					}else if((Arrays.asList("whats your favourite sport", "favourite sport", "favorite sport").stream().anyMatch(input::contains))) {
						input=conversation.response("Basketball  I wanna make uniforms for my high school team through brand Yeezy");
					}else if((Arrays.asList("Should I have all this power?").stream().anyMatch(input::contains))) {
						input=conversation.response("The clock's ticking,   I just count the hours  stop trippin, im trippin off the power");
					}else if((Arrays.asList("are you married?", "you married", "is kim your wife").stream().anyMatch(input::contains))) {
						input=conversation.response("@KimKardashian   our love stoty is like a love story for all the ages when we first got together it was like Romeo and Juiliet kind of thing where its like shes a reality star and im a rapper  who do you love");
					}else if((Arrays.asList("i love no one", "i love").stream().anyMatch(input::contains))) {
						input=conversation.response("Love everyone  Start the year clean  Just be   All love");
					}else if((Arrays.asList("do you have kids?", "do yo have kids", "how many kids", "are your kids names", "").stream().anyMatch(input::contains))) {
						input=conversation.response("I have three, North, Saint, and Chicago  I would like to have seven");
					}else if((Arrays.asList("what do you think about religion", "religion").stream().anyMatch(input::contains))) {
						input=conversation.response("Trust god bro  God sees all Stop the act  Cut the program");
					}else if((Arrays.asList("if she aint a gold digger what is she doing?", "gold digger").stream().anyMatch(input::contains))) {
						input=conversation.response("She aint messing with no broke broke");
					}else if((Arrays.asList("what is your favourite kind of kicks?", "shoes", "kicks").stream().anyMatch(input::contains))) {
						input=conversation.response("Yeezus liked yeezys");
					}else if((Arrays.asList("what is your stance on bill cosby?", "bill cosby").stream().anyMatch(input::contains))) {
						input=conversation.response("BILL COSBT INNOCENT !!!!!!!!!!");
					}else if((Arrays.asList("what is your favourite movie?", "favourite movie", "favorite movie").stream().anyMatch(input::contains))) {
						input=conversation.response("I'M SO HYPE RIGHT NOW EEVERYTHING HAS CHANGED .... HAVE Y'ALL EVER SEEN TRON?? THE END OF THE TRON WHERE EVERYTHING LIGHT UP");
					}else if((Arrays.asList("what do you think about ninjas", "ninja's", "ninja").stream().anyMatch(input::contains))) {
						input=conversation.response("... ninjas are kind of cool ... I just don't know any personally");
					}else if((Arrays.asList("are you happy", "how do you feel").stream().anyMatch(input::contains))) {
						input=conversation.response("You have to see and feel how happy I am and how strong my family is. We are even stronger because of this through the love and grace of god   are you happy");
					}else if((Arrays.asList("i'm happy?", "happy").stream().anyMatch(input::contains))) {
						input=conversation.response("we super happy");
					}else if((Arrays.asList("why are your tweets so strange", "tweets", "twitter").stream().anyMatch(input::contains))) {
						input=conversation.response("Tweeting is legal and also therapeutic");
					}else if((Arrays.asList("where do you stand politcally", "politics", "politically", "trump", "obama", "president").stream().anyMatch(input::contains))) {
						input=conversation.response("Trump all day");
					}else if((Arrays.asList("where did you go to school", " your post-secondary", "  your education", "your university").stream().anyMatch(input::contains))) {
						input=conversation.response("Yo school of Art Intitute of Chicago  where did you go?");
					}else if((Arrays.asList("university", "i didn't", "college").stream().anyMatch(input::contains))) {
						input=conversation.response("You may be talented, but you're not Ye");
					}else if((Arrays.asList("what is dragon energy", "dragon energy").stream().anyMatch(input::contains))) {
						input=conversation.response("Dragon energy is what we find in great leaders with great foresight, Trump and I share dragon energy");
					}else if((Arrays.asList("who is your favourite artist", "favourite artist", "favorite artist").stream().anyMatch(input::contains))) {
						input=conversation.response("I'm my favourite rapper");
					}else if((Arrays.asList("tell me a joke", "joke").stream().anyMatch(input::contains))) {
						input=conversation.response("I could never do stand up cause I tell jokes better when I'm sitting");
					}else if((Arrays.asList("tell me about your plans for the iplane one", "iplane one").stream().anyMatch(input::contains))) {
						input=conversation.response("Hydrogen powered planes are the future. Trumps the president, if he dont look good, we dont look good");
					}else if((Arrays.asList("i heard you were running for president in 2020", "2020").stream().anyMatch(input::contains))) {
						input=conversation.response("It's gonna be 2024 now, but when I decide to do it it will be done");
					}else if((Arrays.asList("what upsets you", "upsets you", "you sad", "you mad").stream().anyMatch(input::contains))) {
						input=conversation.response("Sometimes I get emotional over fonts");
					}else if((Arrays.asList("who programmed you", "who created you", "are you a bot").stream().anyMatch(input::contains))) {
						input=conversation.response("They will not program me");
					}else if((Arrays.asList("goodbye", "bye", "goodnight", "ttyl").stream().anyMatch(input::contains))) {
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
