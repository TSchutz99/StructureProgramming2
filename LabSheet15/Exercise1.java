package LabSheet15;
// Java Program Exercise1
/* By: Faun Schutz
 * Start: 29/04/2020
 * Finish: 29/04/2020
 *
 * This program shows how a JTextField object can be created and used as means of retrieving user input. This
 * program also introduces event-handling.
 */
 
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Exercise1{
	JTextField jTextField;
	
	public static void main(String args[])
	{
		Exercise1 guiApp = new Exercise1();
	}
	
	public Exercise1()
	{
		JFrame jFrameWindow = new JFrame("Adding a JTextField JFrame");
		
		FlowLayout flowLayout = new FlowLayout();
		
		jFrameWindow.setLayout(flowLayout);
		jFrameWindow.setSize(350, 100);
		jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel jLabel = new JLabel("Please enter your address:"); 
		
		jFrameWindow.add(jLabel);
		
		jTextField = new JTextField(15);
		
		jTextField.setForeground(Color.GREEN);   
		jFrameWindow.add(jTextField);		
		
		TextFieldEventHandler handler = new TextFieldEventHandler();
		
		jTextField.addActionListener(handler);
		jFrameWindow.setVisible(true);
	}
	
	private class TextFieldEventHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String address = jTextField.getText();
			JOptionPane.showMessageDialog(null, "Your address is " + address, "", 
											JOptionPane.INFORMATION_MESSAGE);		
		}
	}
}