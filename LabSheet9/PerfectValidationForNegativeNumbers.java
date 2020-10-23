package LabSheet9;
// Java Program PerfectValidationForNegativeNumbers
/* By: Faun Schutz
 * start: 28/02/2020
 * finish: 28/02/2020
 *
 * 
 */
 
import javax.swing.JOptionPane;

public class PerfectValidationForNegativeNumbers{
	public static void main(String args[])
	{
		float number, sum = 0;
		String numberAsString;
		int j, numberOfDots = 0;
		boolean valid;
		double numberAsDouble = 0;
		
		for(int i = 1; i <= 5; i++)
		{
			numberAsString = JOptionPane.showInputDialog("Iteration " + i + " - please enter a number");
			
			valid = false;
			
			while(!valid)
			{
				if(!numberAsString.equals("") && (Character.isDigit(numberAsString.charAt(0))) || 
					numberAsString.charAt(0) == '-' || numberAsString.charAt(0) == '.')
				{
					if(numberAsString.charAt(0) == '.')
						numberOfDots++;
						
						for(j = 1; j < numberAsString.length(); j++)
						{
							if((!Character.isDigit(numberAsString.charAt(j))) && 
								numberAsString.charAt(j) != '.' || numberOfDots > 1)
								break;
							else if(numberAsString.charAt(j) == '.')
								numberOfDots++;
						}
						
						if(j == numberAsString.length() && numberOfDots <= 1 && !numberAsString.equals("-") &&
							!numberAsString.equals(".") && !numberAsString.equals("-."))
						{
							numberAsDouble = Double.parseDouble(numberAsString);
							
							if(numberAsDouble >=  -Float.MAX_VALUE && numberAsDouble <= Float.MAX_VALUE)
								valid = true;
							else
								numberAsString = JOptionPane.showInputDialog("Iteration " + i +  
												 " - Invalid! Please re-enter a number");
						}else{
							numberAsString = JOptionPane.showInputDialog("Iteration " + i +  
												 " - Invalid! Please re-enter a number");
							
						numberOfDots = 0;
						}			
				}else{
					numberAsString = JOptionPane.showInputDialog("Iteration " + i +  
												 " - Invalid! Please re-enter a number");
				} 
			}
			number = (float)numberAsDouble;
			sum += number;
		}
		
		JOptionPane.showMessageDialog(null, "The sum of the numbers entered is " + sum, "Sum of Numbers", 
									  JOptionPane.INFORMATION_MESSAGE);
									  
		System.exit(0);
	}
}