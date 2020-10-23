package LabSheet11;
// Java Program Exercise5
/* By: Faun Schutz
 * start: 1/04/2020
 * finish: 1/04/2020
 *
 * 
 */

import java.util.Scanner;

public class Exercise5{
	public static void main(String args[])
	{
		int numbers[] = new int[10];
		int numbersAsInt, largest = 0, smallest = 0;
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < numbers.length; i++)
		{
			System.out.print("Please enter an integer: ");
			numbersAsInt = input.nextInt(); 
			numbers[i] = numbersAsInt;
				
			if(i == 0)
			{
				largest = numbers[i];
				smallest = numbers[i];
			}else
			{
				if(numbers[i] > largest)
					largest = numbers[i];
					
				if(numbers[i] < smallest)
					smallest = numbers[i];
			}
		}
		
		System.out.print("\n\n\nThe first value in the array is " + numbers[0] +
						 "\n\nThe 5th number in the array is " + numbers[4] +
						 "\n\nThe largest number in the array is " + largest +
						 "\n\nThe smallest number in the array is " + smallest);
	}
}