package LabSheet2;
/* Java Program Exercise4
 * by: Faun Schutz
 * Start: 25/01/2020
 * Finish: 25/01/2020
 *
 * 
 */

import java.util.Scanner; 
public class Exercise4{
	public static void main(String args[])
	{
		String option;
		float balance = 1000, deposit, withdrawal;
		
		Scanner input = new Scanner(System.in);
		
		do{
			System.out.print("****************ITT ATM****************" + 
							 "\n\n\nPlease choose from the following transaction types: " +
							 "\n\n'D' is deposit" +
							 "\n'W' is withdrawal" +
							 "\n'X' is Exit the system" + 
							 "\n\nPlease enter your choice: ");
			option = input.nextLine().toUpperCase();
			
			switch(option){
				
				case "D":
					System.out.print("\n\nPlease enter the amount your wish to deposit: ");
					deposit = input.nextFloat();
					
					balance = balance + deposit;
					
					System.out.println("\n\n\nYour balance is now " + String.format("%.2f",balance) + 
									 "\nPlease hit return to continue .....");
									 input.nextLine();
					break;
					
				case "W":
					System.out.print("\n\nPlease enter the amount your wish to withdrawal: ");
					withdrawal = input.nextFloat();
					
					balance = balance - withdrawal;
					
					System.out.println("\n\n\nYour balance is now " + String.format("%.2f",balance) + 
									 "\nPlease hit return to continue .....");
									 input.nextLine();
					break;
					
				/*case "X":
					System.out.println("\n\nThanks for using the system ... goodbye");
					System.exit(0);
					break;*/
			}
			input.nextLine();
		}while(!(option.equals("X")));
		System.out.println("\nThanks for using the system ... goodbye");
	}
}