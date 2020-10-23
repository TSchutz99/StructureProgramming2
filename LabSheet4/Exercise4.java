package LabSheet4;
/* Java Program JOptionPaneInput
 * by: Faun Schutz
 * Start: 29/01/2020
 * Finish: 29/01/2020
 *
 * 
 */
 
import javax.swing.JOptionPane;

public class Exercise4{
	public static void main(String args[])
	{
		String username, password;
		
		username = JOptionPane.showInputDialog("Please enter your username");
		password = JOptionPane.showInputDialog("Please enter you password");
		
		if(username.equalsIgnoreCase("Joe Bloggs") && password.equals("t123456"))
			JOptionPane.showMessageDialog(null, "Welcome to the System", "Authentication", JOptionPane.PLAIN_MESSAGE);
		else
			JOptionPane.showMessageDialog(null, "Invalid username and/or password", "Authentication", JOptionPane.PLAIN_MESSAGE);
	}
}