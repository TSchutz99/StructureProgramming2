package LabSheet10;
// Java Program Exercise1
/* By: Faun Schutz
 * start: 11/03/2020
 * finish: 11/03/2020
 *
 * Validator for time inputs.
 */

import javax.swing.JOptionPane;

public class Exercise1{
	public static void main(String args[])
	{
		String time, validTime = "";
		boolean valid;
		int i, j;
			
		for(i = 1; i < 5; i++)
		{
			time = JOptionPane.showInputDialog("Iteration " + i + " - Please enter a time in the form of HH:MM");
			
			valid = false;
			while(!valid)
			{
				if((time.length() == 5))
				{	
					for(j = 0; j < time.length(); j++)
					{
						if(!Character.isDigit(time.charAt(j))&& (time.charAt(2) != ':'))
							{System.out.print(time.charAt(j));
							break;}
					}
					
					if(j == time.length())
					{
						if((time.charAt(0) >= '0' && time.charAt(0) <= '2') && (time.charAt(1) >= '0' && time.charAt(1) <= '9') &&
						   (time.charAt(3) >= '0' && time.charAt(3) <= '5') && (time.charAt(4) >= '0' && time.charAt(4) <= '9'))
							valid = true;
						else
							time = JOptionPane.showInputDialog("Iteration " + i + " - A. Invalid! Please enter a time in the form HH:MM");	
					}
					else
						time = JOptionPane.showInputDialog("Iteration " + i + " - B. Invalid! Please enter a time in the form HH:MM");		
				}
				else
					time = JOptionPane.showInputDialog("Iteration " + i + " - C. Invalid! Please enter a time in the form HH:MM");	
			}
			
		JOptionPane.showMessageDialog(null, "Good Afternoon!", "Time Validator", JOptionPane.INFORMATION_MESSAGE);
		
		}
	}
}