package LabSheet10;
// Java Program Exercise4Modify
/* By: Faun Schutz
 * start: 20/03/2020
 * finish: 20/03/2020
 *
 * 
 */
 
import javax.swing.JOptionPane;

public class Exercise4Modify{
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
					
				validDateOfBirth = isValidDateOfBirth(dateOfBirth);//added by JB, this is vital code here
			}
			
			if(!dateOfBirth.equals("x") && dateOfBirth.charAt(8) == '6') //JB added some logic here
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
									//if(month.charAt(i) >= '0' && month.charAt(i) <= '9') //as before
									  if(year.charAt(i) >= '0' && year.charAt(i) <= '9') //replaced month with year
										{
											//some code added by JB
										}
										else
											//valid = true; //commented out by JB
											return false;
								}
								if(day.charAt(1)=='0' && month.charAt(1)=='1' || 
								   day.charAt(1)=='1' && (month.charAt(1)=='0' || month.charAt(1)=='2')) //takes care of November, October and December to make sure you can't have 31st November for example
								                                                                         //see if you can add similar logic for the other months in the other if-elses you have written to make                                                                      //sure February can only have 28 days max and the other months can only have 30 or 31 days as appropriate
								    valid = true; //added by JB
							}
						}
						else
						{
							if(month.charAt(1) >= '1' && month.charAt(1) <= '9') //JB changed from '0' to '1' here
							{
								for(int i = 0; i < 4; i++) // Month Part
								{
									//if(month.charAt(i) >= '0' && month.charAt(i) <= '9') //as before
									  if(year.charAt(i) >= '0' && year.charAt(i) <= '9') //replaced month with year
										{
											//some code added by JB
										}
										else
											//valid = true; //commented out by JB
											return false;
								}
								if(day.charAt(1)=='1' && (month.charAt(1)=='1' || month.charAt(1)=='3' || month.charAt(1)=='5' || month.charAt(1)=='7' || month.charAt(1)=='8') ||
								   day.charAt(1)=='0' && (month.charAt(1)=='4' || month.charAt(1)=='6' || month.charAt(1)=='9') ||
								   day.charAt(1)=='8' && month.charAt(1)=='2')
								    valid = true; //added by JB
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
									if(year.charAt(i) >= '0' && year.charAt(i) <= '9')
									{
										//some code added by JB
									}
									else
										//valid = true; //commented out by JB
										return false;
								}
								if(day.charAt(1)=='0' && month.charAt(1)=='1' || 
								   day.charAt(1)=='1' && (month.charAt(1)=='0' || month.charAt(1)=='2'))                                                                      //sure February can only have 28 days max and the other months can only have 30 or 31 days as appropriate
								    valid = true; //added by JB
							}
						}
						else
						{
							if(month.charAt(1) >= '1' && month.charAt(1) <= '9')
							{
								System.out.println("Got here!");
								for(int i = 0; i < 4; i++) // Month Part
								{
									if(year.charAt(i) >= '0' && year.charAt(i) <= '9')
									{
										//some code added by JB
									}
									else
										//valid = true; //commented out by JB
										return false;
								}
								if(day.charAt(1)=='1' && (month.charAt(1)=='1' || month.charAt(1)=='3' || month.charAt(1)=='5' || month.charAt(1)=='7' || month.charAt(1)=='8') ||
								   day.charAt(1)=='0' && (month.charAt(1)=='4' || month.charAt(1)=='6' || month.charAt(1)=='9') ||
								   day.charAt(1)=='8' && month.charAt(1)=='2')
								    valid = true; //added by JB
							}
						}
					}
				}
			}
		}
		return valid;
	}
}