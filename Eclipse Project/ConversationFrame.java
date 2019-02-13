

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ConversationFrame extends JFrame{
	private Conversation conversation;
	public ConversationFrame(Conversation conversation, String title, int width, int height) {
		this.conversation = conversation;
		//attributes
		setSize(width, height);
		setTitle(title);
		setUndecorated(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//create and add objects
		add(new ConversationPanel());
	}
	
	private class ConversationPanel extends JPanel{
		BufferedImage myImage;
		public ConversationPanel() {
			//setBackground(Color.BLACK);
			try {
				myImage = ImageIO.read(new File("res/Kanye.jpg")); //Current mistake is here 
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		public void paint(Graphics g) {
			super.paint(g);
			g.drawImage(myImage, 0, 0, this);
			conversation.paint((Graphics2D)g);
		}
	}

}
