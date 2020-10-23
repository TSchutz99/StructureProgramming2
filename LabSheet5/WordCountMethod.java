package LabSheet5;
/* Java Program WordCountMethod
 * by: Faun Schutz
 * Start: 05/02/2020
 * Finish: 05/01/2020
 *
 * This program uses-defined method called wordCount() to determine number of words in a 
 * user-supplied string.
 */
 
import javax.swing.JOptionPane;

public class WordCountMethod{
	public static void main(String args[])
	{
		String text; 
			
		text = JOptionPane.showInputDialog("Please enter a piece of text");
		
		JOptionPane.showMessageDialog(null, "\n\nThe number of words in the text you entered is " + 
									  wordCount(text), "Word Count Results", JOptionPane.PLAIN_MESSAGE);
									  
		System.exit(0);
	}
	
	public static int wordCount(String txt)
	{
		int words = 0;
		
		for (int i=0; i<txt.length(); i++)
		{
			if(txt.charAt(i)==' ')
				words++;
		}
		
		return words+1;
	} 
} 