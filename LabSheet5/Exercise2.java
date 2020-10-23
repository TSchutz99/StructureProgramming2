package LabSheet5;
/* Java Program Exercise2
 * by: Faun Schutz
 * Start: 05/02/2020
 * Finish: 05/01/2020
 *
 * This program takes an input and then outputs it back to you but writen in reverse.
 */
 
import javax.swing.JOptionPane;

public class Exercise2{
	public static void main(String args[])
	{
		String text; 
			
		text = JOptionPane.showInputDialog("Please enter a piece of text");
		
		JOptionPane.showMessageDialog(null, "\n\nThe text reversed is " + 
									  reverse(text), "String Reversed", JOptionPane.PLAIN_MESSAGE);
									  
		System.exit(0);
	}
	
	public static String reverse(String txt)
	{
		String reverse="";
		
		for(int i=txt.length()-1; i>=0;)
		{
			reverse +=  txt.charAt(i);    // reverse = reverse + txt.charAt(i);				
			
			System.out.println(reverse);
				
			i--;
		}
		
		return reverse;
	} 
} 