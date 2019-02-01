package chatbot;

public class YeBot {
	
	private java.util.Scanner client = new java.util.Scanner(System.in); //change input type if needed
	
	public void start() {
		//change to end when gui is closed
		while(true) {
			talk();
		}
	}
	
	public void talk() {
		String input = client.nextLine();
		System.out.println("I am YE   bow down to you you mortal peasants");
	}
}
