package LabSheet10;
// Java Program Exercise4
/* By: Faun Schutz
 * start: 20/03/2020
 * finish: 20/03/2020
 *
 *
 */

import javax.swing.JOptionPane;

public class Exercise4{
	public static void main(String args[])
	{
		String dateOfBirth = "", list60sBirths = "";
		boolean validDateOfBirth;
		
		while(!dateOfBirth.equals("x"))
		{
			dateOfBirth = JOptionPane.showInputDialog("Please enter a date of birth in the form of DD-MM-YYYY (x to exit)");
			System.out.print("\n" + dateOfBirth);  // For testing purposes
			
			if(dateOfBirth.equals("x"))
				break;
				
			validDateOfBirth = isValidDateOfBirth(dateOfBirth);
			
			while(validDateOfBirth == false)
			{
				dateOfBirth = JOptionPane.showInputDialog("Invalid! Please re-enter a date of birth in the form of DD-MM-YYYY (x to exit)");
				System.out.print("\n" + dateOfBirth);  // For testing purposes
				
				if(dateOfBirth.equals("x"))
					break;
			}
			
			if(dateOfBirth.charAt(8) == 6)
				list60sBirths += ("\n" + dateOfBirth);
		}
		
		JOptionPane.showMessageDialog(null, "The dates in the 1960s are: " + list60sBirths,
										"1960s Dates", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}
	
	public static Boolean isValidDateOfBirth(String dateOfBirth)
	{
		String day, month, year;
		boolean valid = false;
		
		day = dateOfBirth.substring(0,2);
		System.out.print("\n" + day); // For testing purposes
		month = dateOfBirth.substring(3,5);
		System.out.print("\n" + month); // For testing purposes
		year = dateOfBirth.substring(6);
		System.out.print("\n" + year); // For testing purposes
		
		if(day.charAt(0) >= '0' && day.charAt(0) <= '3')
		{
			if(day.charAt(0) == '3')
			{
				if(day.charAt(1) >= '0' && day.charAt(1) <= '1')
				{
					if(month.charAt(0) >= '0' && month.charAt(0) <= '1')
					{
						if(month.charAt(0) == '1')
						{
							if(month.charAt(1) >= '0' && month.charAt(1) <= '2')
							{
								for(int i = 0; i < 4; i++) // Month Part
								{
									if(month.charAt(i) >= '0' && month.charAt(i) <= '9')
										valid = true;
								}
							}
						}
						else
						{
							if(month.charAt(1) >= '0' && month.charAt(1) <= '9')
							{
								for(int i = 0; i < 4; i++) // Month Part
								{
									if(month.charAt(i) >= '0' && month.charAt(i) <= '9')
										valid = true;
								}
							}
						}
					}
				}
			}
			else
			{
				if(day.charAt(1) >= '0' && day.charAt(1) <= '9')
				{
					if(month.charAt(0) >= '0' && month.charAt(0) <= '1')
					{
						if(month.charAt(0) == '1')
						{
							if(month.charAt(1) >= '0' && month.charAt(1) <= '2')
							{
								for(int i = 0; i < 4; i++) // Month Part
								{
									if(month.charAt(i) >= '0' && month.charAt(i) <= '9')
										valid = true;
								}
							}
						}
						else
						{
							if(month.charAt(1) >= '0' && month.charAt(1) <= '9')
							{
								for(int i = 0; i < 4; i++) // Month Part
								{
									if(month.charAt(i) >= '0' && month.charAt(i) <= '9')
										valid = true;
								}
							}
						}
					}
				}
			}
		}
		return valid;
	}
}