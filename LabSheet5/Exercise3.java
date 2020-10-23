package LabSheet5;
/* Java Program Exercise3
 * by: Faun Schutz
 * Start: 07/02/2020
 * Finish: 07/01/2020
 *
 * 
 */
 
import javax.swing.JOptionPane;

public class Exercise3{
	public static void main(String args[])
	{
		String text; 
			
		text = JOptionPane.showInputDialog("Please enter a piece of text");
		
		if(isWholeNumber(text))
			JOptionPane.showMessageDialog(null, "The text you entered constitutes a whole number",
										  "Number Tester", JOptionPane.INFORMATION_MESSAGE);
		else
			JOptionPane.showMessageDialog(null, "The The text you entered does not constitute a whole number",
										   "Number Tester", JOptionPane.INFORMATION_MESSAGE);
										   
		System.exit(0);
	}
	
	public static boolean isWholeNumber(String txt)
	{
		boolean result = true;
		char digit;
		
		if(txt.charAt(0) == '-' || Character.isDigit(txt.charAt(0)))
		{
			for(int i=1; i<txt.length(); i++)
				if(!(Character.isDigit(txt.charAt(i))))
				{
					result = false;
					break;
				}
		}else{
			result = false;
		}	
	
			
		return result;
	}
}