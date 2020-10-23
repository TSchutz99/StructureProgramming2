package LabSheet7;
/* Java Program Exercise2
 * By: Faun Schutz
 * start: 11/02/2020
 * finish: 11/02/2020
 *
 */

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Exercise2{
	public static void main(String args[])
	{
		String monthAsString;
		int month;
		String monthDays;
		
		monthAsString = JOptionPane.showInputDialog("Please enter the number of a month (1-12)");
		month = Integer.parseInt(monthAsString);
		
		Scanner input = new Scanner(System.in);
		System.out.print(month);
		
		monthDays = numberDaysIn(month);
		
		JOptionPane.showMessageDialog(null, monthDays, "Message", JOptionPane.PLAIN_MESSAGE);
		
		System.exit(0);
	}
	
	public static String numberDaysIn(int month)
	{
		String days = "";
		
		switch(month){
		
			case 1:
			case 3:
			case 5:
			case 7:				
			case 8:
			case 10:
			case 12:
				days = "There are 31 days in this month";
				break;	
			
			case 2:
				days = "there are 28 days in this month";
				break;
			
			case 4:
			case 6:
			case 9:
			case 11:
				days = "There are 30 days in this month";
				break;
				
			default: 
				JOptionPane.showMessageDialog(null, "Invalid - you must enter a month number between 1 and 12!", 
											  "Message", JOptionPane.PLAIN_MESSAGE);
				System.exit(0);
		}
		
		return days;
	}
}
