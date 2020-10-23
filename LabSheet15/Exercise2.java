package LabSheet15;
// Java Program Exercise2
/* By: Faun Schutz
 * Start: 30/04/2020
 * Finish: 30/04/2020
 *
 * This program shows how a JTextField object can be created and used as means of retrieving user input. This
 * program also introduces event-handling.
 */
 
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercise2{
	JTextField usernameField;
	JPasswordField jPasswordField;
	
	public static void main(String args[])
	{
		Exercise2 guiApp = new Exercise2();
	}
	
	public Exercise2()
	{
		JFrame jFrameWindow = new JFrame("Authentication");
		
		FlowLayout flowLayout = new FlowLayout();
		jFrameWindow.setLayout(flowLayout);
		jFrameWindow.setSize(400, 100);
		jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel username = new JLabel("Username:"); 
		jFrameWindow.add(username);

		usernameField = new JTextField(10);  
		jFrameWindow.add(usernameField);	
			
		moveCursor handler1 = new moveCursor();
		usernameField.addActionListener(handler1);
			
		JLabel password = new JLabel("Password:"); 	
		jFrameWindow.add(password);
		
		jPasswordField = new JPasswordField(10);  
		jFrameWindow.add(jPasswordField);	
		
		authenticator handler2 = new authenticator();
		jPasswordField.addActionListener(handler2);
		jFrameWindow.setVisible(true);
	}
	
	private class moveCursor implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			jPasswordField.requestFocus();
		}
	}
	
	private class authenticator implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String username = usernameField.getText();
			String password = String.valueOf(jPasswordField.getPassword());
			
		    if(username.equals("Faun Schutz") && password.equals("Password"))
		    {
		    	JOptionPane.showMessageDialog(null, "Welcome to the system " + username, "Authenticated",
		    									JOptionPane.INFORMATION_MESSAGE);
		    }
		    else
		    {
		    	JOptionPane.showMessageDialog(null, "Invalid username/password combination", "Not authenticated",
		    									JOptionPane.INFORMATION_MESSAGE);
		    }
		}
	}
}