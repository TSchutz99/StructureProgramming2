package LabSheet10;
// Java Program Exercise3
/* By: Faun Schutz
 * start: 19/03/2020
 * finish: 19/03/2020
 *
 * 
 */
 
import java.util.Scanner;

public class Exercise3{
	public static void main(String ags[])
	{
		String letter;
		boolean validLetter;
		int vowels = 0, consonants = 0;
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++)
		{
			System.out.print("Please enter letter " + (i+1) + ": ");
			letter = input.nextLine();
			
			validLetter = isValidLowercase(letter); 
				
			if(validLetter == false)
			{
				while(validLetter == false)
				{				
					System.out.print("Invalid! Please re-enter letter " + (i+1) + ": ");
					letter = input.nextLine();
					
					validLetter = isValidLowercase(letter); 
				}
			}
			
			if(letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u"))
				vowels++;
				
			if(!(letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")))
				consonants++;
		}
			
		System.out.println("\n\nThe number of vowels is " + vowels + 
						   "\nThe number of consonants is " + consonants);
						   
		System.exit(0);
	}
	
	public static boolean isValidLowercase(String letter)
	{
		boolean valid = false;
		
		if(letter.length() == 1){
			if(letter.charAt(0) >= 'a' && letter.charAt(0) <= 'z')
				valid = true;
		}
		
		return valid;
	}
}