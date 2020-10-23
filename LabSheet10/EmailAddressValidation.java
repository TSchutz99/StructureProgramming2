package LabSheet10;
// Java Program EmailAddressValidation
/* By: Faun Schutz
 * start: 12/03/2020
 * finish: 12/03/2020
 *
 * This program reads in exactly 5 user-supplied email address and validates it based on a set of rules.
 * It does the validation in a user-defined method.
 */

import javax.swing.JOptionPane;

public class EmailAddressValidation{
	public static void main(String args[])
	{
		String email, validEmails = "";
		
		for(int i = 1; i <= 5; i++)
		{
			email = JOptionPane.showInputDialog("Please enter email address " + i);
			
			while(!isValidEmail(email))
			{
				email = JOptionPane.showInputDialog("Invalid! Please re-enter email address " + i);
			}
			
			validEmails += email + "\n";
		}
		
		JOptionPane.showMessageDialog(null, "The list of valid email address is:\n\n" + validEmails,
											"Valid Emails", JOptionPane.INFORMATION_MESSAGE); 
	}
	
	public static boolean isValidEmail(String email)
	{
		String firstName, lastName, firstNameAndLastName;
		int dotPosition, j;
		boolean valid = false; 
			
		if(email.endsWith("@ittralee.ie"))
		{
			firstNameAndLastName = email.substring(0, email.length() -12);
			
			dotPosition = firstNameAndLastName.indexOf('.');
			
			if(dotPosition != -1)
			{
				firstName = firstNameAndLastName.substring(0, dotPosition);
				lastName = firstNameAndLastName.substring(dotPosition + 1, email.length() -12);
				
				if(!firstName.equals("") && Character.isUpperCase(firstName.charAt(0)))
				{
					for(j = 1; j < firstName.length(); j++)
					{
						if(!Character.isLowerCase(firstName.charAt(j)))
							break;
					}
					
					if(j == firstName.length() && !lastName.equals("") &&
						Character.isUpperCase(lastName.charAt(0)))
					{
						for(j = 1; j < lastName.length(); j++)
						{
							if(!Character.isLowerCase(lastName.charAt(j)))
								break;
						}
						
						if(j == lastName.length())
							valid = true;
					}
				}
			}
		}
		
		return valid;
	}
}