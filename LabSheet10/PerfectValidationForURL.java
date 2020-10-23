package LabSheet10;
// Java Program PerfectValidationForURL
/* By: Faun Schutz
 * start: 09/02/2020
 * finish: 09/02/2020
 *
 * This program validates an arbitrary number of user-supplied URLs to make sure they conform to the 
 * style www.******.com where the asterisks represent at least 1 alphanumeric character.
 */
 
import javax.swing.JOptionPane;

public class PerfectValidationForURL{
	public static void main(String args[])
	{
		String URL, validURLs = "";
		boolean valid;
		int i;
		
		URL = JOptionPane.showInputDialog("Please enter a URL (x to exit)");
		
		while(!URL.equals("x"))
		{
			valid = false;
			while(!valid)
			{
				if(URL.startsWith("www.") && URL.endsWith(".com"))
				{
					for(i = 4; i < URL.length() -4; i++)
					{
						if(!Character.isDigit(URL.charAt(i)) && !Character.isLetter(URL.charAt(i)))
							break;
					}		
					
					if(i == URL.length() -4 && i != 4)
						valid = true;
					else
						URL = JOptionPane.showInputDialog("Invalid! Please enter a URL (x to exit)");
					
					
				}else if(URL.equals("x"))
					break;
				else
					URL = JOptionPane.showInputDialog("Invalid! Please enter a URL (x to exit)");
			}
			
			if(!URL.equals("x"))
			{
				validURLs += URL + "\n";
				URL = JOptionPane.showInputDialog("Please enter another URL (x to exit)");
			}
		}
		
		if(!validURLs.equals(""))
			JOptionPane.showMessageDialog(null, "The list of valid URLs entered is: \n\n" + validURLs, 
										"Valid URLs", JOptionPane.INFORMATION_MESSAGE);
		else
			JOptionPane.showMessageDialog(null, "You entered no valid URls", 
										"Valid URLs", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}
}