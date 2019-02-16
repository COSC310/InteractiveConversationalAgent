

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.ScrollPane;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.TitledBorder;

import com.sun.glass.events.KeyEvent;
import java.awt.event.KeyAdapter;
@SuppressWarnings("serial")
public class BDialog extends JDialog {
	//
	//    private JButton btnAnswer = new JButton("Talk");
	//    private JButton btnExit = new JButton("Exit");
	//    private JTextField txtTalk = new JTextField(60);
	//    private JLabel txtResponse = new JLabel("This is a message");
	//    private String result;
	JFrame yeBot;
	private String result;
	private JTextField input;
	private JButton btnSend;
	private JScrollPane scrollView;
	private GroupLayout groupLayout;
	private JTextArea chatBox;
	private String test;
	public BDialog(JFrame frame) {

	}

	/**
	 * Create the application.
	 * 
	 * this GUI is very simple
	 * 
	 * you can enter text in the field at the bottom
	 * 
	 * either pressing enter or clicking the 'send' button will send the input to the bot
	 * 		and display both the user input and the bots reply in the text area above (chatBox)
	 * 
	 * The chatBox is in a scrollpane but it is force scrolled to the bottom and the old messages disappear at the top with the
	 * 		newest messages being displayed at the bottom
	 * 
	 * nothing will happen if the user presses send (or the 'enter' key) but have typed nothing in the input box
	 * 
	 * to quit the program simply press the X botton at the top right or type "quit"
	 */
	public BDialog() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		yeBot = new JFrame();
		yeBot.setResizable(false);
		yeBot.setAlwaysOnTop(true);
		yeBot.setTitle("yeBot");
		yeBot.getContentPane().setBackground(Color.LIGHT_GRAY);
		//scroll view for our messages
		scrollView = new JScrollPane();
		//stop the user from scrolling up (scroll bar ugly don't need to)
		scrollView.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollView.setViewportBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		//ya never need to scroll sideways
		scrollView.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		//forces the scrollpane (scrollView) to the bottom (always see the newest input and outputs at bottom of chatbox)
		scrollView.getVerticalScrollBar().addAdjustmentListener(new AdjustmentListener() {  
	        public void adjustmentValueChanged(AdjustmentEvent e) {  
	            e.getAdjustable().setValue(e.getAdjustable().getMaximum());  
	        }
	    });
		//sets info for send button
		btnSend = new JButton("Send");
		btnSend.setBackground(Color.GRAY);
		btnSend.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 19));

		//sets text input box (user input)
		input = new JTextField();
		//this keyListener will send an input if 'enter' is pressed (just like clicking the send button)
		input.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(java.awt.event.KeyEvent evt) {
				if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
					if (!input.getText().equals("")){
						result = input.getText();
						String displayResult = input.getText();
						input.setText("");
						chatBox.setText(chatBox.getText().concat("You: "+displayResult)+"\n\n");
					}
				   }
			}
		});
		

		
		input.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 19));
		
		groupLayout = new GroupLayout(yeBot.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(input, GroupLayout.PREFERRED_SIZE, 680, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnSend, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE))
						.addComponent(scrollView, GroupLayout.DEFAULT_SIZE, 856, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(8)
					.addComponent(scrollView, GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
					.addGap(1)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnSend, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
						.addComponent(input, GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)))
		);
		//the chatBox is where our chat occurs
		chatBox = new JTextArea();
		chatBox.setWrapStyleWord(true);
		chatBox.setBackground(Color.LIGHT_GRAY);
		chatBox.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 19));
		chatBox.setEditable(false);
		scrollView.setViewportView(chatBox);

		//action for send button
				btnSend.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						if (!input.getText().equals("")){
							result = input.getText();
							String displayResult = input.getText();
							input.setText("");
							chatBox.setText(chatBox.getText().concat("You: "+displayResult)+"\n\n");
						}
					}
				});
		yeBot.getContentPane().setLayout(groupLayout);
		yeBot.setBounds(100, 100, 861, 665);
		yeBot.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//displays kanyes reply in chatBox
	public String showInputDialog(String msg){
		chatBox.setText(chatBox.getText().concat("Kanye: "+msg)+"\n\n");
		setVisible(true);
		return msg;
	}
	//tells our program what the user entered so it can respond accordingly
	public String recieveInput() { //nice spelling
		String input = result;
		result = null;
		try {
			Thread.sleep(750);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return input;
	}
}