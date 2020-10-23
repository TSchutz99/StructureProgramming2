package LabSheet1;
/* Java Program Exercise6
 * by: Faun Schutz
 * Start: 20/01/2020
 * Finish: 22/01/2020
 *
 * This program asks the user to enter a word containing exactly 9 characters. If the number 
 * of characters in the word entered by the user is not 9, then put out a warning message and 
 * terminate the program immediately. If it is 9, then check to see whether the word entered 
 * constitutes a palindrome. This is a word that spells the same backwards and forwards.
 */

 
import java.util.Scanner; 
public class Exercise6{
	public static void main(String args[])
	{
        String word;
        
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a word 9 characters long: ");
		word = input.nextLine();
		
		if(word.length() == 9){
			if(word.charAt(0) == word.charAt(8) && word.charAt(1) == word.charAt(7) && word.charAt(2) == word.charAt(6) && word.charAt(3) == word.charAt(5))
				System.out.println("\nThe word you entered is a palindrome");
			else
				System.out.println("\nThe word you entered is not a palindrome");
		}else{
			System.out.println("\nInvalid word! Quitting program now...");
		}	
	}
}