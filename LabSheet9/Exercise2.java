package LabSheet9;
// Java Program PerfectValidationForNegativeNumbers
/* By: Faun Schutz
 * start: 28/02/2020
 * finish: 28/02/2020
 *
 * 
 */
 
import javax.swing.JOptionPane;

public class Exercise2{
	public static void main(String args[])
	{
		float number = 0, totalNumbers = 0, largestNumber = 0, smallestNumber = 0, averageNumber = 0,
			  perNegNum = 0, per1000Num = 0;
		String numberAsString = "";
		int noNegNum = 0, noNum1000 = 0, noEvenNum = 0, num = 0;
		
		while(!numberAsString.equals("x"))
		{
			numberAsString = JOptionPane.showInputDialog("Please input a number");
			if(numberAsString.equals("x")){
				if(num == 0)
					System.exit(0);
				break;
			}
			number = numberValidationTest(numberAsString);	
				
			totalNumbers += number;	
			
			if(largestNumber <= number)
				largestNumber = number;
				
			if(smallestNumber >= number)
				smallestNumber = number;
			
			if(numberAsString.charAt(0) == '-')
				noNegNum++;	
					
			if(number > 1000)
				noNum1000++;
				
			if((number % 2) == 0)
				noEvenNum++;
				
			num++;		
		}
		
		averageNumber = totalNumbers / num;
		perNegNum = noNegNum * 100 / num;
		per1000Num = noNum1000 * 100 / num;
		
		JOptionPane.showMessageDialog(null, "The average of the numbers entered is: " + String.format("%.2f", averageNumber) +
											"\nThe largest of the numbers entered is: " + largestNumber +
											"\nThe smallest of the numbers entered is: " + smallestNumber +
											"\nThe percentage of the numbers entered that were negative: " + String.format("%.2f", perNegNum) + 
											"\nThe percentage of the numbers entered that exceeded 1000: " + String.format("%.2f", per1000Num) +
											"\nThe number of even values: " + noEvenNum, 
											"Results", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}
	
	public static float numberValidationTest(String numberAsString)
	{
		int i, numberOfDots = 0;
		double numberAsDouble = 0;
		float number;
		boolean valid;
		
		valid = false;
		
		while(!valid)
			{
				if(!numberAsString.equals("") && (Character.isDigit(numberAsString.charAt(0))) || 
					numberAsString.charAt(0) == '-' || numberAsString.charAt(0) == '.')
				{
					if(numberAsString.charAt(0) == '.')
						numberOfDots++;
						
						for(i = 1; i < numberAsString.length(); i++)
						{
							if((!Character.isDigit(numberAsString.charAt(i))) && 
								numberAsString.charAt(i) != '.' || numberOfDots > 1)
								break;
							else if(numberAsString.charAt(i) == '.')
								numberOfDots++;
						}
						
						if(i == numberAsString.length() && numberOfDots <= 1 && !numberAsString.equals("-") &&
							!numberAsString.equals(".") && !numberAsString.equals("-."))
						{
							numberAsDouble = Double.parseDouble(numberAsString);
							
							if(numberAsDouble >=  -Float.MAX_VALUE && numberAsDouble <= Float.MAX_VALUE)
								valid = true;
							else
								numberAsString = JOptionPane.showInputDialog("Invalid! Please input a number");
						}else{
							numberAsString = JOptionPane.showInputDialog("Invalid! Please input a number");
							
						numberOfDots = 0;
						}			
				}else{
					numberAsString = JOptionPane.showInputDialog("Invalid! Please input a number");
				} 
			}
			number = (float)numberAsDouble;
			
			return number;
	}
}