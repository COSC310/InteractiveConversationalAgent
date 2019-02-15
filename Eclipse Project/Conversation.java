

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class Conversation{
	public String msg = "";
	private static BDialog dialog = new BDialog();
	private ArrayList<String> aList = new ArrayList<String>();	
	public Conversation(){
		dialog.yeBot.setVisible(true);
		aList.add("quit");
		aList.add("goodbye");
		aList.add("see you");
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
	
	public boolean isContained(String input) {
		if(input != null)
			return this.aList.contains(input.toLowerCase());
		return false;
		
	}
}
