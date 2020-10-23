package LabSheet5;
/* Java Program Exercise2
 * by: Faun Schutz
 * Start: 07/02/2020
 * Finish: 07/01/2020
 *
 * This program uses a user-deffined method called containsCharacter() to determine whether a 
 * string contains a given character.
 */
 
import javax.swing.JOptionPane;

public class ContainsCharacterMethod{
	public static void main(String args[])
	{
		String text, characterAsString="";
		char character;
		
		text = JOptionPane.showInputDialog("Please enter a peice of text");
		
		characterAsString = JOptionPane.showInputDialog("Please enter a keyboard character");
		character = characterAsString.charAt(0);
		
		if(containsCharacter(text, character))
			JOptionPane.showMessageDialog(null, "The text you entered contained the character " + character,
										 "Character Tester", JOptionPane.INFORMATION_MESSAGE);
		else
			JOptionPane.showMessageDialog(null, "The text you entered does not contain the character " + character,
										  "Character Tester", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}
	
	public static boolean containsCharacter(String s, char c)
	{
		boolean result = false; 
			
		for(int i=0; i<s.length(); i++)
			if(s.charAt(i)==c)
			{
				result = true;
				break;
			}
			
		return result;
	}
}