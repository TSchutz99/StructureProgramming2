package LabSheet12;
// Java Program Exercise2
/* By: Faun Schutz
 * Start: 10/04/2020
 * Finish: 10/04/2020
 *
 */

import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextArea;

public class Exercise2{
	public static void main(String args[])
	{
		int studentIDs[] = new int[5], searchID, subscript;
		float height[] = new float[5];
		String averageGrade[] = new String[5], searchIDAsString;
		
		populateArray(studentIDs, height, averageGrade);
		
		displayTable(studentIDs, height, averageGrade);
		
		searchIDAsString = JOptionPane.showInputDialog("Please enter the id number of the student you seek");
		searchID = Integer.parseInt(searchIDAsString);
		
		subscript = linearSearch(studentIDs, searchID);
		
		if(subscript != -1)
		{
			JOptionPane.showMessageDialog(null, "The details of the student are as follows: " + 
												"\nID number .......... " + studentIDs[subscript] +
												"\nHeight .......... " + height[subscript] +
												"\nAverage Grade .......... " + averageGrade[subscript],
											"Student Details", JOptionPane.INFORMATION_MESSAGE);
		}
		
		else
		{
			JOptionPane.showMessageDialog(null, "The student you seek " + subscript + "can not be found",
											"Student Details", JOptionPane.INFORMATION_MESSAGE);
		}
		
		System.exit(0);
	}
	
	public static void populateArray(int studentIDs[], float height[], String averageGrade[])
	{
		String studentIDsAsString, heightAsString;
		
		JOptionPane.showMessageDialog(null, "Please enter the student ID numbers, height and Average Grade " + 
											"for " + studentIDs.length + " students",
										"Message about Input", JOptionPane.INFORMATION_MESSAGE);
		
		for(int i = 0; i < studentIDs.length; i++)
		{
			studentIDsAsString = JOptionPane.showInputDialog("Please input student " + (i+1) + "'s ID number");
			studentIDs[i] = Integer.parseInt(studentIDsAsString);
			
			heightAsString = JOptionPane.showInputDialog("Please input student " + (i+1) + "'s height");
			height[i] = Float.parseFloat(heightAsString);
			
			averageGrade[i] = JOptionPane.showInputDialog("Please input student " + (i+1) + "'s Average Grade");
		}
	}
	
	public static void displayTable(int studentIDs[], float height[], String averageGrade[])
	{
		Font textAreaFont = new Font("monospaced", Font.PLAIN, 12);
		JTextArea textArea = new JTextArea(14, 20);
		
		textArea.setFont(textAreaFont);
		
		String text = String.format("%-14s%-10s%-17s\n%-14s%-10s%-17s", "Student ID", "Height", "Average Grade", 
																		"----------", "------", "-------------");
		for(int i = 0; i < studentIDs.length; i++)
		{
			text += String.format("\n%-14d%-10.2f%-17s", studentIDs[i], height[i], averageGrade[i]);
		}
		
		textArea.append(text);
		
		JOptionPane.showMessageDialog(null, textArea, "All Student Detials", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static int linearSearch(int studentIDs[], int searchID)
	{
		for(int i = 0; i < studentIDs.length; i++)
		{
			if(studentIDs[i] == searchID)
				return i;
		}
		
		return -1;
	}
}