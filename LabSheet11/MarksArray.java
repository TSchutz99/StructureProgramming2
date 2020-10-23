package LabSheet11;
// Java Program MarksArray
/* By: Faun Schutz
 * start: 1/04/2020
 * finish: 1/04/2020
 *
 * This program reads in a list of students exam marks and determins and displays the average
 * mark. It then uses this to list all marks above the average.
 */

import javax.swing.JOptionPane;

public class MarksArray{
	public static void main(String args[])
	{
		int marks[] = new int[10]; 
		int total = 0, i; 
		String text, markAsString;
		double average; 
			
		for(i = 0; i < marks.length; i++)
		{
			markAsString = JOptionPane.showInputDialog("Enter mark for student " + (i+1));
			marks[i] = Integer.parseInt(markAsString);
			total += marks[i];
		}
		
		average = (double)total/marks.length;
		
		JOptionPane.showMessageDialog(null, "The average mark is: " + String.format("%.2f", average),
										    "Average Mark", JOptionPane.INFORMATION_MESSAGE);
		
		text = "List of marks above the average is: \n\n";
		
		for(i = 0; i < marks.length; i++)
		{
			if(marks[i] > average)
				text += marks[i] + " ";
		}
		
		JOptionPane.showMessageDialog(null, text, "Marks Above Average", JOptionPane.INFORMATION_MESSAGE);
	}
}