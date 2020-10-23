package LabSheet11;
// Java Program Exercise4
/* By: Faun Schutz
 * start: 1/04/2020
 * finish: 1/04/2020
 *
 * This program reads in a list of students exam marks and determins and displays the average
 * mark. It then uses this to list all marks above the average.
 */

import javax.swing.JOptionPane;

public class Exercise4{
	public static void main(String args[])
	{
		int marks[] = new int[10]; 
		String studentNames[] = new String[10];
		int total = 0, i; 
		String text, markAsString;
		double average; 
			
		for(i = 0; i < marks.length; i++)
		{
			studentNames[i] = JOptionPane.showInputDialog("Enter Name of student " + (i+1));
			
			markAsString = JOptionPane.showInputDialog("Enter mark for student " + (i+1));
			marks[i] = Integer.parseInt(markAsString);
			total += marks[i];
		}
		
		average = (double)total/marks.length;
		
		JOptionPane.showMessageDialog(null, "The average mark is: " + String.format("%.2f", average),
										    "Average Mark", JOptionPane.INFORMATION_MESSAGE);
		
		text = "The following students have marks above the average: \n\n";
		
		for(i = 0; i < marks.length; i++)
		{
			if(marks[i] > average)
				text += studentNames[i] + ", ";
		}
		
		JOptionPane.showMessageDialog(null, text, "Above Average Students", JOptionPane.INFORMATION_MESSAGE);
	}
}