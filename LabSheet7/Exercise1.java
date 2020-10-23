package LabSheet7;
/* Java Program Exercise1
 * By: Faun Schutz
 * start: 11/02/2020
 * finish: 11/02/2020
 *
 */
 
import java.util.Scanner;

public class Exercise1{
	public static void main(String args[])
	{
		double length, period; 
			
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter length of the pendulum: ");
		length = input.nextFloat();
		
		period = periodCalculator(length);
		
		System.out.println("The period of the pendulum is " + String.format("%.2f", period) + " seconds");
	}
	
	public static double periodCalculator(double length)
	{
		final double ACCERLERGRAV = 9.8f;
		double result;
		
		result = 2 * Math.PI * Math.sqrt(length / ACCERLERGRAV);
		
		return result;
	}
} 