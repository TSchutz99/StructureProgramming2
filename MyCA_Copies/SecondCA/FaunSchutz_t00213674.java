package MyCA_Copies.SecondCA;
// Java Program FaunSchutz_t00213674
/* By: Faun Schutz
 * Start: 02/04/2020
 * Finish: 02/04/2020
 *
 */
 
import javax.swing.JOptionPane;

public class FaunSchutz_t00213674{
	public static void main(String args[])
	{
		String ISBN = " ", validISBNList = "", ISBN865, ISBN865List = "";
		boolean valid, check1, goldenCheck;
		int total = 0, digit, remainder = 0, lastChar, run = 0;
		
		while(!(ISBN.equals("")))
		{
			ISBN = JOptionPane.showInputDialog("Please enter an ISBN (return to exit)");
			
			if(ISBN.equals(""))
				break;
			
			valid = false;
			
			while(!valid)
			{	
				if(ISBN.length() == 10)
				{		
					check1 = false;
					
					for(int i = 0; i <= 9; i++)
					{
						if(Character.isDigit(ISBN.charAt(i)))
							check1 = true;
						else{			
							check1 = false;
							break;
						}
					}
					
					if(check1 = true)
					{
						if(Character.isDigit(ISBN.charAt(9)) || ISBN.charAt(9) == 'x' || ISBN.charAt(9) == 'X')
						{
							// Couldn't get the dolden rule check to work - ISBN 0140124993 
							
							goldenCheck = false;
							
							for(int i = 0; i <= 9; i++)
							{
								digit = Character.getNumericValue(ISBN.charAt(i));
								
								total += (digit * (10-i));
								
								remainder = total%11;
							}
							
							if(ISBN.charAt(9) == 'x' || ISBN.charAt(9) == 'X')
								lastChar = 10;
							else
								lastChar = Character.getNumericValue(ISBN.charAt(9));
								
							if(remainder == lastChar)
								valid = true;
							
							else
								ISBN = JOptionPane.showInputDialog("Invalid! ISBN fails the golden rule. Please re-enter");
						}
						
						else
							ISBN = JOptionPane.showInputDialog("Invalid! Last character must be digit or an 'X' or 'x'. Please re-enter");
					}
					
					else
						ISBN = JOptionPane.showInputDialog("Invalid! First 9 characters must be digits. Please re-enter");
				}
				
				else
					ISBN = JOptionPane.showInputDialog("Invalid! ISBN must have exactly 10 characters. Please re-enter");
			}
			run++;
			
			validISBNList += ISBN + "   ";
			
			if(run == 1)
			{
				ISBN865 = ISBN.substring(0, 4);
			
				if(ISBN865.equals("865"))
					ISBN865List += ISBN + "   ";
			}
			
			ISBN = JOptionPane.showInputDialog("Please enter an ISBN (return to exit)");
		}
		
		JOptionPane.showInputDialog(null, "List of valid ISBNs: " + validISBNList +
										  "List of valid ISBNs starting with 865" + ISBN865List,
								    	"List of valid ISBNs", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}
}