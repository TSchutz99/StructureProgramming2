package LabSheet7;
/* Java Program Exercise8
 * By: Faun Schutz
 * start: 12/02/2020
 * finish: 13/02/2020
 *
 *  
 */

import java.util.Random; 
import java.util.Scanner;

public class Exercise8{
	public static void main(String args[])
	{
		int noTosses, heads = 0, tails = 0;
		String face = "", toss = "";
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the number of coin tosses you want: ");
		noTosses = input.nextInt();
		
		for(int i = 0; i < noTosses; i++)
		{
			face = coinToss(toss);
			
			System.out.print("\nCoin toss " + (i+1) + ": " + face);
			
			if(face.equals("heads"))
				heads++;
			if(face.equals("tails"))
				tails++;
		}
		
		System.out.println("\n\n\n==========Overall Result==========" + 
						   "\nPercentage of heads: " + (heads * 100 / noTosses) + "%" +  
						   "\nPercentage of tails: " + (tails * 100 / noTosses) + "%");
	}
	
	public static String coinToss(String face)
	{
		int chance;
		
		Random toss = new Random();
		chance = toss.nextInt(2);
		
		if(chance == 1)
			return"tails";
		else
			return"heads";
	}
}