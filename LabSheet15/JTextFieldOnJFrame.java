package LabSheet15;
// Java Program JTextFieldOnJFrame
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

public class JTextFieldOnJFrame{
	JTextField jTextField;
	
	public JTextFieldOnJFrame()
	{
		JFrame jFrameWindow = new JFrame("Adding a JTextField JFrame");
		
		FlowLayout flowLayout = new FlowLayout();
		
		jFrameWindow.setLayout(flowLayout);
		jFrameWindow.setSize(350, 100);
		jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel jLabel = new JLabel("Please enter your name:");
		
		jFrameWindow.add(jLabel);
		
		jTextField = new JTextField(15);
		
		jFrameWindow.add(jTextField);
		
		TextFieldEventHandler handler = new TextFieldEventHandler();
		
		jTextField.addActionListener(handler);
		
		jFrameWindow.setVisible(true);
	}
	
	public static void main(String args[])
	{
		JTextFieldOnJFrame guiApp = new JTextFieldOnJFrame();
	}
	
	private class TextFieldEventHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String name = jTextField.getText();
			JOptionPane.showMessageDialog(null, "Your name is " + name, "", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}