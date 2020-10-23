package PastCAs_Exams.CA_2;
// Java Program PreviousCA2_GrY
/* By: Faun Schutz
 * Start: 02/04/2020
 * Finish: 02/04/2020
 *
 *
 */
 
import javax.swing.JOptionPane;

public class PreviousCA2_GrY{
	public static void main(String args[])
	{
		String dateOfBirth = "";
		String dayAsString, monthAsString, yearAsString, validDOB = "", validSummerDOB = "";
		int day, month, year;
		boolean valid;
		
		while(!dateOfBirth.equals("x"))
		{
			dateOfBirth = JOptionPane.showInputDialog("Please enter the date of birth in the from DD/MM/YY");
			
			if(dateOfBirth.equals("x"))
				break;
			
			valid = false;
			
			while(!valid)
			{
				if(dateOfBirth.length() != 8)
					JOptionPane.showInputDialog("Invalid! Date of birth must have exactaly 8 characters - Please re-enter");
					
				else
				{
					dayAsString = dateOfBirth.substring(0, 2);
					day = Integer.parseInt(dayAsString);
					
					if(!(day >= 01 && day <= 31))
						 //if(!(Character.isDigit(dateOfBirth.charAt(0)) && Character.isDigit(dateOfBirth.charAt(1))))
							JOptionPane.showInputDialog("Invalid! Day section must be a digit <= 31 - Please re-enter");
						
					else
					{
						if(dateOfBirth.charAt(2) != '/')
							JOptionPane.showInputDialog("Invalid! The third character must be a dash - Please re-enter");
							
						else
						{
							monthAsString = dateOfBirth.substring(3, 5);
							month = Integer.parseInt(monthAsString);
							
							if(!(month >= 01 && month <= 12))
								//if(!(Character.isDigit(dateOfBirth.charAt(3)) && Character.isDigit(dateOfBirth.charAt(4))))
									JOptionPane.showInputDialog("Invalid! month section must be a digit <= 12 - Please re-enter");
								
							else
							{
								if(dateOfBirth.charAt(5) != '/')
									JOptionPane.showInputDialog("Invalid! The fifth character must be a dash - Please re-enter");
									
								else
								{
									yearAsString = dateOfBirth.substring(6);
									year = Integer.parseInt(yearAsString);
									
									if(!(year >= 00 && year <= 99))
										//if(!(Character.isDigit(dateOfBirth.charAt(6)) && Character.isDigit(dateOfBirth.charAt(7))))
											JOptionPane.showInputDialog("Invalid! year section must be a digit <= 99 - Please re-enter");
											
									else
									{
										if((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day <= 31 ||
										   (month == 4 || month == 6 || month == 9 || month == 11) && day <= 30 ||
										    month == 2 && day <= 28)
										      valid = true;
										      	
										else
										{
											JOptionPane.showInputDialog("Date is Invalid! - Please re-enter");
										}
									}
									
								}
							}
						}
					}
				}
			}
			validDOB += dateOfBirth + "   ";
											
			if(month >= 5 && month <= 7)
				validSummerDOB += dateOfBirth + "   ";
				
			dateOfBirth = JOptionPane.showInputDialog("Please enter the date of birth in the from DD/MM/YY");
		}
		
		JOptionPane.showMessageDialog(null, "All valid Date of births are: " + validDOB +
											"All valid Summer Date of births are: " + validSummerDOB);
		
		System.exit(0);
	}
}