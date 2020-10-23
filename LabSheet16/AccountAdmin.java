package LabSheet16;
// Java Program AccountAdmin
/* By: Faun Schutz
 * Start: 03/05/2020
 * Finish: 03/05/2020
 *
 * This program mimics the actions of an account administrator, allowing the administrator to create 
 * new accounts, view the details of a specific account and remove an account (to be completed by you). 
 * It makes use of the linear search algorithm when searching for a specific account and the JPasswordField 
 * component when creating accounts. It stores the account details in 2 parallel arrays, one for the username and
 * one for the password. It also has some validation to ensure usernames can't be duplicated.
 */
 
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class AccountAdmin{

	JTextField usernameField;
	JPasswordField passwordField;
	JButton newAccountButton, viewAccountButton, generateAccountButton;
	String usernames[] = new String[100];
	String passwords[] = new String[100];
	JFrame jFrameWindow;
	
	public static void main(String args[])
	{	 		
		 AccountAdmin guiApp = new AccountAdmin();
	}
	
	public AccountAdmin()
	{	 
		 jFrameWindow = new JFrame("Account Administrator");
			 			 			 
		 FlowLayout flowLayout = new FlowLayout();
	     jFrameWindow.setLayout(flowLayout);		     	     		 
		 jFrameWindow.setSize(500, 150);
		 jFrameWindow.setLocation(250, 250);
		 jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 
		 JLabel promptLabel = new JLabel("Welcome administrator, which action would you like to perform?");
		 jFrameWindow.add(promptLabel);
 				 
 		 newAccountButton = new JButton("Create New Account");
 		 jFrameWindow.add(newAccountButton);
 			 	 
		 viewAccountButton = new JButton("View Specific Account");
		 jFrameWindow.add(viewAccountButton);
			 
		 JButton removeAccountButton = new JButton("Remove Account");
		 jFrameWindow.add(removeAccountButton);	 

		 ButtonEventHandler buttonHandler = new ButtonEventHandler();
		 newAccountButton.addActionListener(buttonHandler);
		 viewAccountButton.addActionListener(buttonHandler);
		 removeAccountButton.addActionListener(buttonHandler);		 
			 	 			 	 	 
		 jFrameWindow.setVisible(true);
	}	
	
	private class ButtonEventHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == newAccountButton)
			{
				JFrame accountDetailsWindow = new JFrame("Account Deatails");
				
				FlowLayout flowLayout = new FlowLayout();
				accountDetailsWindow.setLayout(flowLayout);
				accountDetailsWindow.setSize(350, 100);
				
				JLabel usernameLabel = new JLabel("Username:");
				accountDetailsWindow.add(usernameLabel);
				
				usernameField = new JTextField(8);
				accountDetailsWindow.add(usernameField);
				
				JLabel passwordLabel = new JLabel("Password:");
				accountDetailsWindow.add(passwordLabel);
				
				passwordField = new JPasswordField(8);
				accountDetailsWindow.add(passwordField);
				
				generateAccountButton = new JButton("Generate New Account");
				accountDetailsWindow.add(generateAccountButton);
				
				generateAccountButton.addActionListener(this);
				
				accountDetailsWindow.setLocation(200, 200);
				accountDetailsWindow.setVisible(true);
			}
			else if(e.getSource() == generateAccountButton)
			{
				String username = usernameField.getText();
				char[] password = passwordField.getPassword();
				
				for(int i = 0; i < usernames.length; i++)
				{
					if(usernames[i] != null && username.equals(usernames[i]))
					{
						JOptionPane.showMessageDialog(null, "This username is already taken!!!", "Error!",
														JOptionPane.ERROR_MESSAGE);
						break;
					}
					else if(usernames[i] == null) // This marks the end of the list of usernames entered so far
					{
						usernames[i] = username;
						passwords[i] = new String(password);
						
						JOptionPane.showMessageDialog(null, "New account created successfully!!!", "Success!",
														JOptionPane.INFORMATION_MESSAGE);
						break;
					}
				}
			}
			else if(e.getSource() == viewAccountButton)
			{
				String username = JOptionPane.showInputDialog("Please enter the username of the account you seek");
				int subscriptUsername = linearSearch(usernames, username);
				
				if(subscriptUsername != -1)
					JOptionPane.showMessageDialog(null, "The detials for this account are as Follows:" +
														"\n\nUsername: " + usernames[subscriptUsername] +
														"\nPassword: " + passwords[subscriptUsername], 
													"Account Details", JOptionPane.INFORMATION_MESSAGE);
				else
					JOptionPane.showMessageDialog(null,"The details for this account could not be found!!",
													"Error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
    	
    private static int linearSearch(String usernames[], String username)
    {
    	for (int i = 0; i < usernames.length; i++)
    	{
			if(usernames[i] != null && usernames[i].equals(username))
				return i;
		}
				
		return -1;
	}		
}	 	 			 