package LabSheet3;
/* Java Program JTextAreaFormatting
 * by: Faun Schutz
 * Start: 27/01/2020
 * Finish: 27/01/2020
 *
 * 
 */

import javax.swing.JOptionPane; 
import javax.swing.JTextArea;
import java.awt.Font;

public class JTextAreaFormatting{
	public static void main(String args[])
	{
		int i=1;
		double squareRoot, cubedRoot;
		
		JTextArea textArea = new JTextArea(14, 30);
		
		Font textAreaFont = new Font("monospaced", Font.PLAIN, 12);
		textArea.setFont(textAreaFont);
		
		while(i <= 100)
		{
			squareRoot = Math.sqrt(i);
			cubedRoot = Math.cbrt(i);
			
			textArea.append(String.format("%-10d%-10.3f%-10.3f\n", i, squareRoot, cubedRoot));
			
			if(i % 10 ==0)
			{
				if(i < 100)
				{
					textArea.append("\nPlease hit return to continue ....");
				}
				else
				{
					textArea.append("\nFinished .... hit return to exit");	
				}
				
				JOptionPane.showMessageDialog(null, textArea, "JTextArea Formatting Demo", JOptionPane.PLAIN_MESSAGE);
				
				textArea.setText(String.format("%-10s%-10s%-10s\n", "Number", "Sq Root", "Cb Root"));
			}
		    i++;
		}
		System.exit(0);
	}
}