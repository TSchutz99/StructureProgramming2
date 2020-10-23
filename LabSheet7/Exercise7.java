package LabSheet7;
/* Java Program Exercise7
 * By: Faun Schutz
 * start: 12/02/2020
 * finish: 12/02/2020
 *
 *  
 */
 
import java.util.Scanner;

public class Exercise7{
	public static void main(String args[])
	{
		String text;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a piece of text: ");
		text = input.nextLine();
		
		if(text.length() < 3)
			System.out.println("\nInvaid! What you entered contains fewer than 3 characters");
		else
			System.out.println("\nThe last 3 characters of text are: " + last3Characters(text));		
	}
	
	public static String last3Characters(String text)
	{
		 int num3 = text.length();
		 String last3;
		 	
		 last3 = text.substring(num3-3,num3);
		 
		 return last3;
	}
}
 