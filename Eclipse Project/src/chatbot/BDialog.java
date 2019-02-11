

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
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
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.ScrollPaneConstants;

@SuppressWarnings("serial")
public class BDialog {

	private static JFrame frame;
	private String result;
	private JTextArea input;
	private JButton btnSend;
	private JScrollPane scrollView;
	private GroupLayout groupLayout;
	private static JTextArea chatBox;
	private String txtResponse;


	public BDialog() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		//scroll view for our messages
		scrollView = new JScrollPane();
		scrollView.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollView.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		//sets info for send button
		btnSend = new JButton("Send");
		btnSend.setBackground(Color.GRAY);
		btnSend.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 19));

		//sets text input box
		input = new JTextArea();
		input.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 19));
		groupLayout = new GroupLayout(frame.getContentPane());

		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollView, GroupLayout.DEFAULT_SIZE, 837, Short.MAX_VALUE)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
						.addComponent(input, GroupLayout.PREFERRED_SIZE, 680, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnSend, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))
				);
		groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addComponent(scrollView, GroupLayout.PREFERRED_SIZE, 503, GroupLayout.PREFERRED_SIZE)
						.addGap(1)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(btnSend, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
								.addComponent(input))
						.addContainerGap())
				);

		chatBox = new JTextArea();
		chatBox.setBackground(Color.LIGHT_GRAY);
		chatBox.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 19));
		chatBox.setEditable(false);
		scrollView.setViewportView(chatBox);

		//action for send button
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!input.getText().equals("")){
					result = input.getText();
					input.setText("");
					chatBox.setText(chatBox.getText().concat("You: "+result)+"\n\n");
				}
				else {
					//just for testing purposes... could display error here if need be
					//input.setText("test");
				}
			}
		});

		frame.getContentPane().setLayout(groupLayout);
		frame.setBounds(100, 100, 861, 665);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static String response(String msg){
		chatBox.setText(chatBox.getText().concat("Kanye: "+msg)+"\n\n");
		return msg;
	}
}