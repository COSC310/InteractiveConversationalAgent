

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class BDialog extends JDialog {
	//
    private JButton btnAnswer = new JButton("Talk");
    private JButton btnExit = new JButton("Exit");
    private JTextField txtTalk = new JTextField(60);
    private JLabel txtResponse = new JLabel("This is a message");
    private String result;
    public BDialog(JFrame frame) {
        super(frame, true);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        setLayout(new GridLayout(2, 1));
        getContentPane().setBackground(Color.black);
        
        //set font and color
        Font font = new Font("Arial", Font.BOLD, 20);
        txtResponse.setFont(font);
        txtResponse.setForeground(Color.WHITE);
        txtTalk.setFont(font);
        btnAnswer.setFont(font);
        btnExit.setFont(font);
        
        JPanel tmpPanel = new JPanel();
        //tmpPanel.setBackground(Color.black);
        //if you want reply above text box change "" to txtResponse
        tmpPanel.setOpaque(false);
        tmpPanel.add(txtResponse);
        add(tmpPanel);
        tmpPanel = new JPanel();
        //tmpPanel.setBackground(Color.black);
        tmpPanel.setOpaque(false);
        tmpPanel.add(txtTalk);
        tmpPanel.add(btnAnswer);
        tmpPanel.add(btnExit);
        add(tmpPanel);

        //Adds listener to buttons in panel pack();
        MyHandler handler = new MyHandler();
        btnAnswer.addActionListener(handler);
        txtTalk.addActionListener(handler);
        btnExit.addActionListener(handler);
    }
    public String showInputDialog(String msg){
    	txtResponse.setText(msg);
    	setVisible(true);
    	return result;
    }
    public void showMessageDialog(String msg){
    	txtResponse.setText(msg);
    	setVisible(true);
    }
    //confirmation that you want to quit (Done)
    private class MyHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnExit){
				if(JOptionPane.showConfirmDialog(null, "Really want to exit?","Confirmation", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
					System.exit(0);
			}else{
				result = txtTalk.getText();
				txtTalk.setText("");
				setVisible(false);
			}
		}
    }
}