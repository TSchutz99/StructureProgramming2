package LabSheet12;
// Java Program ArrayMethods
/* By: Faun Schutz
 * Start: 09/04/2020
 * Finish: 09/04/2020
 *
 * This program processes an array using methods.
 */
 
import java.util.Scanner;

public class ArrayMethods{
	public static void main(String args[])
	{
		int marks[] = new int[10];
		
		readArray(marks);
		
		displayArray(marks);
	}
	
	public static void readArray(int marks[])
	{
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < marks.length; i++)
		{
			System.out.print("Enter mark for student " + (i+1) + ": ");
			marks[i] = input.nextInt();
		}
	}
	
	public static void displayArray(int marks[])
	{
		System.out.print("\n\nThe contects of the array is:\n");
		
		for(int i = 0; i < marks.length; i++)
		{
			System.out.print(marks[i] + " ");
		}
	}
}