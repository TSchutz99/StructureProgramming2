package LabSheet9;
// Java Program PerfectValidationForChoice
/* By: Faun Schutz
 * start: 24/02/2020
 * finish: 24/02/2020
 *
 * This program validates the users choice for a menu-based program.
 */
 
import java.util.Scanner;

public class PerfectValidationForChoice{
	public static void main(String args[])
	{
		String choice; 
		Scanner input = new Scanner(System.in);
		
		do{
			displayMenu();
			System.out.print("\n\n\nEnter your choice: ");
			choice = input.nextLine().toUpperCase();
			
			while(!choice.equals("A") && !choice.equals("B") && !choice.equals("C"))
			{
				System.out.print("\nInvalid! Please re-enter your choice (A-C): ");
				choice = input.nextLine().toUpperCase();
			}
			
			switch(choice)
			{
				case "A":
					cylinderVolume();
					break;
					
				case "B":
					semicircleArea();
					break;
					
				case "C":
					break;
			}	
		}while(!choice.equals("C"));
		
		System.out.println("\n\nThanks for using the system - goodbye!\n\n");
	}
	
	public static void displayMenu()
	{
		System.out.print("\n\n\n\tA. Find volume of cylinder");
		System.out.print("\n\tB. Find area of semi-circle");
		System.out.print("\n\tC. Quit \n\n\n\n");
	}
	
	public static void cylinderVolume()
	{
		float radius, height;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the radius of the cylinder: ");
		radius = input.nextFloat();
		System.out.print("Please enter the height of the cylinder: ");
		height = input.nextFloat();
		System.out.print("Volume of cylinder is " + String.format("%.2f m3", 3.14*Math.pow(radius, 2)*height));
		
		System.out.println("\n\nPlease hit return to continue ...... ");
		input.nextLine(); // consumes the \n ignored by nextFloat()
		input.nextLine(); // consumes the <CR> entered by the user
		System.out.println("\n\n\n\n");
	}
	
	public static void semicircleArea()
	{
		float radius;
		Scanner input = new Scanner(System.in);
		System.out.print("\n\nPlease enter the radius of the semi-circle): ");
		radius = input.nextFloat();
		System.out.print("\nArea of semi-circle is " + String.format("%2f m2", 2.14*Math.pow(radius, 2)/2));
		
		System.out.println("\n\nPlease hit return to continue ...... ");
		input.nextLine(); // consumes the \n ignored by nextFloat()
		input.nextLine(); // consumes the <CR> entered by the user
		System.out.println("\n\n\n\n");
	}
}