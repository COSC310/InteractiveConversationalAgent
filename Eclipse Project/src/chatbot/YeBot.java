package chatbot;

public class YeBot {
	
	private java.util.Scanner client = new java.util.Scanner(System.in); //change to match proper input if needed
	
	public void start() {
		//change to end when gui is closed
		while(true) {
			talk();
		}
	}
	
	private void talk() {
		String input = client.nextLine();
		
		System.out.println("I am YE   bow before me you mere peasants");
	}
}
