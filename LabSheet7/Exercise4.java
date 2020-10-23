package LabSheet7;
/* Java Program Exercise4
 * By: Faun Schutz
 * start: 12/02/2020
 * finish: 12/02/2020
 *
 */
 
import javax.swing.JOptionPane;

public class Exercise4{
	public static void main(String args[])
	{
		String numberAsString = " ";
		int number;
		
		numberAsString = JOptionPane.showInputDialog("Please enter an integer (hit return to exit)");
		
		while(!numberAsString.equals(""))
		{
			//if(numberAsString.equals(""))
			//	break;
		
			number = Integer.parseInt(numberAsString);
		
			if(isEven(number))
				JOptionPane.showMessageDialog(null, "You entered an even number", "Even Test", JOptionPane.INFORMATION_MESSAGE);
			else
				JOptionPane.showMessageDialog(null, "You entered an odd number", "Even Test", JOptionPane.INFORMATION_MESSAGE);
				
			numberAsString = JOptionPane.showInputDialog("Please enter an integer (hit return to exit)");
		}
			
		System.exit(0);
	}
	
	public static boolean isEven(int number)
	{
		boolean result; 
			
		if(number % 2 == 0)
			result = true;
		else
			result = false;
			
		return result;
	}
}