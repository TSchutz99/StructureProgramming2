package LabSheet5;
/* Java Program LottoDrawImproved
 * by: Faun Schutz
 * Start: 05/02/2020
 * Finish: 05/01/2020
 *
 * This program uses a user-defined method called minimum() that takes 2 user-supplied 
 * float values as arguments and returns the smaller of the 2 to main(). The main() method 
 * should then output the smaller value. If the numbers turn out to be equal, it just 
 * returns either number. 
 */
 
import java.util.Scanner;

public class Exercise1{
	public static void main(String args[])
	{
		float number1, number2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the first number: ");
		number1 = input.nextFloat();
		
		System.out.print("Please enter the second number: ");
		number2 = input.nextFloat();
		
		System.out.println("\n\nThe smaller of the 2 numbers you entered is " + minimun(number1,number2));
	}
	
	public static float minimun(float a, float b)
	{
		float minimun;
		
		if(a < b)
			minimun = a;
		else
			minimun = b;
		
		return minimun;
	}
}