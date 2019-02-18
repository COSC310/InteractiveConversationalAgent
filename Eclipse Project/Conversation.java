

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.util.ArrayList;
/**
 * The Conversation Class takes user input from the GUI
 * 		and form a conversation with the Chatbot. 
 * 
 * The main purpose of the Conversation Class is to communicate
 * 		human with the Chatbot primitively, and validate if the conversation is closed.
 * 
 */
public class Conversation{
	public String msg = "";
	private static BDialog dialog = new BDialog();
	private ArrayList<String> aList = new ArrayList<String>();
	public Conversation(){
		dialog.yeBot.setVisible(true);
		aList.add("quit");
		aList.add("see you");
		aList.add("goodbye");
	}
	
	//used to print and set an input
	public String response(String msg){
		this.msg=msg;
		String result = null;
		String response = dialog.showInputDialog(msg);  
		result = dialog.recieveInput();
		return result;
	}

	public String recieveInput() {
		String result = dialog.recieveInput();
		return result;
	}
	//verify if the user input contains a exit prompt
	public boolean isContained(String input) {
		return (input != null) ? aList.contains(input.toLowerCase()) : false;
	}
	
	
}
