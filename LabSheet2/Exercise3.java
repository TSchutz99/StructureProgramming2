package LabSheet2;
/* Java Program Exercise3
 * by: Faun Schutz
 * Start: 24/01/2020
 * Finish: 24/01/2020
 *
 * This program that gets the user to enter a number and determine whether or not it is perfect. 
 * A perfect number is a positive whole number whose positive factors (excluding the number itself) 
 * add up to that number. 
 */

 
import java.util.Scanner; 
public class Exercise3{
	public static void main(String args[])
	{
		int number, counter = 1, addOfDev = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		number = input.nextInt();
		
		while(counter <= number/2)
		{
			if(number%counter == 0)
				addOfDev = addOfDev + counter;
			
			counter++;
		}
		
		if(addOfDev == number)
			System.out.println("\nThis is a perfect number");
		else
			System.out.println("\nThis is not a perfect number");
	}
}