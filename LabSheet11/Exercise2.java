package LabSheet11;
// Java Program Exercise2
/* By: Faun Schutz
 * start: 1/04/2020
 * finish: 1/04/2020
 *
 * 
 */

import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextArea;

public class Exercise2{
	public static void main(String args[])
	{
		float heights[] = new float[10];
		String arraysInputAsString, text;
		int heightsUnder1_6m = 0, heightsOver1_8m = 0; 
			
		Font textAreaFont = new Font("monospaced", Font.PLAIN, 12);
		JTextArea textArea = new JTextArea(4, 40);
		
		textArea.setFont(textAreaFont);
		
		for(int i = 0; i < heights.length; i++)
		{
			arraysInputAsString = JOptionPane.showInputDialog("Please enter the height of person " + (i+1));
			heights[i] = Float.parseFloat(arraysInputAsString);
			
			if(heights[i] < 1.6)
				heightsUnder1_6m++;
				
			if(heights[i] > 1.8)
				heightsOver1_8m++;	
		}
		
		text = String.format("%-35s%d\n\n%-35s%d", "The total number of people over 1.8m is ", heightsOver1_8m,
							 "The total number of people under 1.6m is ", heightsUnder1_6m);
							 
		textArea.append(text);
		
		JOptionPane.showMessageDialog(null, textArea, "Height Stats", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}
}