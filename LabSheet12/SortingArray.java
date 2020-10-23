package LabSheet12;
// Java Program SortingArray
/* By: Faun Schutz
 * Start: 20/04/2020
 * Finish: 20/04/2020
 *
 * In this program a aort in ascending order of an array is performed using the pre-defined method sort()
 * of the Arrays class. Also, a binary search is performed on the same array to determine whether or not 
 * a user-supplied value exits within the array. This is performed by the method binarysearch(), also 
 * within the arrays class.
 */
 
import java.util.Arrays;
import java.util.Scanner;

public class SortingArray{
	public static void main(String args[])
	{
		String names[] = new String[5], searchName;
		int subscript;
		
		Scanner input = new Scanner(System.in);
		
		populateArray(names);
		
		System.out.println("\n\nOrginal contents of array is:\n\n " + Arrays.toString(names));
		
		Arrays.sort(names);
		
		System.out.println("\n\nAfter sort(), contents of array is\n\n " + Arrays.toString(names));
		
		System.out.print("\n\nEnter the name you seek: ");
		searchName = input.nextLine();
		
		subscript = Arrays.binarySearch(names, searchName);
		
		if(subscript >= 0)
			System.out.println("\n\nThe name you are searching for, " + names[subscript] + ", has been found");
		
		else 
			System.out.println("\n\nSorry - the name you are searhing for, " + searchName + " has not been found");
	}
	
	public static void populateArray(String names[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the " + names.length + " names\n");
		
		for(int i = 0; i < names.length; i++)
		{
			System.out.print("\nPlease enter the name of person " + (i+1) + ": ");
			names[i] = input.nextLine();
		}
	}	
} 