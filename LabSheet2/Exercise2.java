package LabSheet2;
/* Java Program Exercise2
 * by: Faun Schutz
 * Start: 24/01/2020
 * Finish: 24/01/2020
 *
 * The program reads in the t-number of a student. A t-number should have exactly 10 characters in 
 * it and should begin with a lowercase or uppercase �t�. The program will then  determine whether or 
 * not the t-number entered by the user is valid and report the appropriate message.
 */

 
import java.util.Scanner; 
public class Exercise2{
	public static void main(String args[])
	{
		String tNum;
		int counter = 1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the students T-number: ");
		tNum = input.nextLine().toLowerCase();
		
		if(tNum.length() == 10)
		{
			if(tNum.charAt(0) != 't'){
				System.out.println("\nInvalid! The t-number entered does not begin with a 't' or 'T'");
				System.exit(0);
			}
			
			while(counter != 10)
			{
				if(!(tNum.charAt(counter) >= '0' && tNum.charAt(counter) <= '9')){
					System.out.println("\nInvalid! Some of the characters after the first one are not digits");
					System.exit(0);		
				}//else
				//	System.out.println("\nThe t-number entered is valid");
					
				counter++;	
			}
		}else{
			System.out.println("\nInvalid! The t-number entered does not contain 10 characters");
			System.exit(0);
		}
		
		System.out.println("\nThe t-number entered is valid");
	}
}