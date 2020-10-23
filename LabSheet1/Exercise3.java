package LabSheet1;
/* Java Program Exercise3
 * by: Faun Schutz
 * Start: 20/01/2020
 * Finish: 20/01/2020
 *
 */
 
import java.util.Scanner; 
public class Exercise3{
	public static void main(String args[])
	{
		int inches;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the total number of inches: ");
		inches = input.nextInt();
		
		
		int feet = inches/12, remainder = inches%12;
		
		System.out.println(inches + " is equivalent to " + feet + "'" + remainder);
	}
}