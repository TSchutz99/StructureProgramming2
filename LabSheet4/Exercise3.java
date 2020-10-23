package LabSheet4;
/* Java Program JOptionPaneInput
 * by: Faun Schutz
 * Start: 29/01/2020
 * Finish: 29/01/2020
 *
 * This program uses the Character.isDigit to determin if a character is a digit or not.
 */
 
import javax.swing.JOptionPane;

public class Exercise3{
	public static void main(String args[])
	{
		String character;
		
		character = JOptionPane.showInputDialog("Please enter any character");
		
		if(Character.isDigit(character.charAt(0)))
			JOptionPane.showMessageDialog(null, "You entered a digit", "Digit Test", JOptionPane.PLAIN_MESSAGE);
		else
			JOptionPane.showMessageDialog(null, "You did not enter a digit", "Digit Test", JOptionPane.PLAIN_MESSAGE);		
	}
}