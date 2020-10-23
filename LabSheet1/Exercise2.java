package LabSheet1;
/* Java Program Exercise2
 * by: Faun Schutz
 * Start: 20/01/2020
 * Finish: 20/01/2020
 *
 */
 
import java.util.Scanner; 
public class Exercise2{
	public static void main(String args[])
	{
		String investType1, investType2;
		int sharesPur1, sharesPur2;
		float sharesPri1, sharesPri2;
		
		Scanner input = new Scanner(System.in);
		
		// First Investment
		System.out.print("Please enter the type of the first investment: ");
		investType1 = input.nextLine();
		
		System.out.print("Please enter the number of the shares puchased: ");
		sharesPur1 = input.nextInt();
		
		System.out.print("Please enter the share price: ");
		sharesPri1 = input.nextFloat();
		
		// Second Investment
		System.out.print("\n\nPlease enter the type of the second investment: ");
		investType2 = input.nextLine();
		investType2 = input.nextLine();
		
		System.out.print("Please enter the number of the shares puchased: ");
		sharesPur2 = input.nextInt();
		
		System.out.print("Please enter the share price: ");
		sharesPri2 = input.nextFloat();
		
		System.out.println("\n\n\t==================================\n\t\tInvestment Details\n\t==================================" + 
						   "\n" + String.format("%-30s%-15s%-15s\n%-30s%-15s%-15s\n%-30s%-15d%-15.4f\n%-30s%-15d%-15.4f",
						   "Investtment Type","# Shares","Shares Price","---------------","--------","------------", 
						   investType1,sharesPur1,sharesPri1,investType2,sharesPur2,sharesPri2));
	}
}