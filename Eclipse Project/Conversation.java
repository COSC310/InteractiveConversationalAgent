

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;

public class Conversation{
	public static final int WIDTH = 1300, HEIGHT = 730;
	public String msg = "Hello";
	private ConversationFrame frame = new ConversationFrame(this, "COSC 310", WIDTH, HEIGHT);
	private BDialog dialog = new BDialog(frame);
	
	public Conversation(){
		frame.setLocationRelativeTo(null);
		dialog.setLocationRelativeTo(frame);
		dialog.setSize(WIDTH-10, 100);
		dialog.setLocation(frame.getX()+5, frame.getY() + HEIGHT - 105);
		frame.setVisible(true);
	}
	
	//used to print and set an input
	public String response(String msg){
		this.msg=msg;
		frame.repaint();
		String response = dialog.showInputDialog(msg);  
		return (response==null || response.length()==0)? "" : response.trim();
	}
	
	//used to set background and write in speech bubble
	public void paint(Graphics2D g2){
		frame.repaint();
		//writing in box, potentially add if text is to long moves text up and takes a new line
		g2.setColor(Color.black);
		Font font = new Font("Arial", Font.BOLD, 28);
		g2.setFont(font);
		FontMetrics metrics = g2.getFontMetrics(font);
		int txtWidth = metrics.stringWidth(msg);
		g2.drawString(msg, 317-txtWidth/2, 210);
	}
}
