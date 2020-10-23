package LabSheet7;
/* Java Program Exercise3
 * By: Faun Schutz
 * start: 12/02/2020
 * finish: 12/02/2020
 *
 */
 
import javax.swing.JOptionPane;

public class Exercise3{
	public static void main(String args[])
	{
		String character;
		
		character = JOptionPane.showInputDialog("Please enter a keyboard character");
		character.charAt(0);
		
		if(myIsDigit(character))
			JOptionPane.showMessageDialog(null, "You entered a digit", "Digit Test", JOptionPane.INFORMATION_MESSAGE);
		else
			JOptionPane.showMessageDialog(null, "You did not enter a digit", "Digit Test", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
  	}
  	
  	public static boolean myIsDigit(String character)
  	{
  		boolean result;
  		
  		if(character.equals("0") || character.equals("1") || character.equals("2") || character.equals("3") ||
  		   character.equals("4") || character.equals("5") || character.equals("6") || character.equals("7") ||
  		   character.equals("8") || character.equals("9")) 
  		   	result = true;
  		else
  			result = false;
  			
  		return result;
  	}
}