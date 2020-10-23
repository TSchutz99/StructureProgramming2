package LabSheet2;
/* Java Program Exercise1
 * by: Faun Schutz
 * Start: 22/01/2020
 * Finish: 22/01/2020
 *
 * This Java program that reads in an arbitrary amount of positive whole numbers (-1 to exit). 
 * The program should keep track of the number of values entered and determine the average of 
 * the numbers entered to the nearest whole number. It should also keep track of the number of 
 * odd values entered along with the number of values entered that exceeded 100.
 */

 
import java.util.Scanner; 
public class Exercise1{
	public static void main(String args[])
	{
		int counter = 0, number, total =0, noOddNum = 0, noVall100 = 0, average;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a first +ve whole number (-1 to exit): ");
		number = input.nextInt();
		
		while(number != -1)
		{
			if(number == -1)
				System.exit(0);
			
			counter++;
			
			total = total + number;
			
			if((number%2) != 0)
				 noOddNum++;
				 
			if(number > 100)
				noVall100++;
			
			System.out.print("Please enter the next +ve whole number (-1 to exit): ");
			number = input.nextInt();
		}
		
		average = total / counter;
		
		System.out.println("\n\n========Results========" +
						   "\n\nNumber of values entered: " + counter +
						   "\nNumber of odd values entered: " + noOddNum +
						   "\nNumber of values > 100 entered: " + noVall100 +
						   "\nAverage of the values entered: " + average);
	}
}