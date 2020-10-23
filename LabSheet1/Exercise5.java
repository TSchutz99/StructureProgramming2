package LabSheet1;
/* Java Program Exercise5
 * by: Faun Schutz
 * Start: 20/01/2020
 * Finish: 22/01/2020
 *
 * This program firstly asks the user to enter their height in meters and their weight in kilos. If 
 * both the weight and height data supplied are valid then the program should calculate the BMI value 
 * for the individual and use the table given above to generate an appropriate message to the user.
 */

 
import java.util.Scanner; 
public class Exercise5{
	public static void main(String args[])
	{
		float weight, height;
		
		Scanner input = new Scanner(System.in);
		
		// weight in Kiolgrams
		System.out.print("Please enter your weight: ");
		weight = input.nextFloat();
		
		if(weight < 0)
		{
			System.out.println("\nInvalid weight! Quitting program now...");
			System.exit(0);
		} 
		
		// height in meters
		System.out.print("Please enter your height: ");
		height = input.nextFloat();
		
		if(height < 0)
		{
			System.out.println("\nInvalid height! Quitting program now...");
			System.exit(0);
		} 
			
		double BMI = weight / Math.pow(height, 2);
		
		if(BMI < 18.5){
			System.out.println("\nYour BMI is " +  String.format("%.6f", BMI) + " so you are underweight");
		}else if(BMI >= 18.5 && BMI <= 24.99){
			System.out.println("\nYour BMI is " +  String.format("%.6f", BMI) + " so you are normal");
		}else if(BMI >= 25 && BMI <= 29.99){
			System.out.println("\nYour BMI is " +  String.format("%.6f", BMI) + " so you are overweight"); 
		}else if(BMI >= 30){
			System.out.println("\nYour BMI is " +  String.format("%.6f", BMI) + " so you are obese");
		}			
	}
}