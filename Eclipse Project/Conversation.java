

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;

public class Conversation{
	public String msg = "";
	private static BDialog dialog = new BDialog();
	
	public Conversation(){
		dialog.yeBot.setVisible(true);
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
}
