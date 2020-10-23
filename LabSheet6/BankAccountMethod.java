package LabSheet6;
/* Java Program BankAccountMethod
 * by: Faun Schutz
 * Start: 10/02/2020
 * Finish: 10/01/2020
 *
 * This Program uses many methods - some read in custumers bank account details and another method to check
 * if the customers credit limit is exceeded.
 */
 
import javax.swing.JOptionPane;

public class BankAccountMethod{
	public static void main(String args[])
	{
		String accountNumber;
		float balance, debits, credits, creditLimit;
		
		accountNumber = JOptionPane.showInputDialog("Enter account Number (<CR> to exit) ");
		
		while(!accountNumber.equals(""))
		{
			balance = getCustomerBalance();
			debits = getCustomerDebits();
			credits = getCustomerCredits();
			creditLimit = getCustomerCreditLimit();
			
			checkCreditLimit(accountNumber, balance, debits, credits, creditLimit);
			
			accountNumber = JOptionPane.showInputDialog("Enter account number (<CR> to exit) ");
		}
		
		JOptionPane.showMessageDialog(null, "Thanks for using the system - Goodbye!", "Exiting System ...", 
									  JOptionPane.PLAIN_MESSAGE);
		
		System.exit(0);
	}
	
	public static float getCustomerBalance()
	{
		float balance;
		String BalanceAsString;
		BalanceAsString = JOptionPane.showInputDialog("Enter account balance");
		balance = Float.parseFloat(BalanceAsString);
		return balance;
	}
	
	public static float getCustomerDebits()
	{
		float debits;
		String debitsAsString;
		debitsAsString = JOptionPane.showInputDialog("Enter total debits");
		debits = Float.parseFloat(debitsAsString);
		return debits;
	}
	
	public static float getCustomerCredits()
	{
		float credits;
		String creditsAsString;
		creditsAsString = JOptionPane.showInputDialog("Enter total credits");
		credits = Float.parseFloat(creditsAsString);
		return credits;
	}
	
	public static float getCustomerCreditLimit()
	{
		float creditLimit;
		String creditLimitAsString;
		creditLimitAsString = JOptionPane.showInputDialog("Enter credits limit");
		creditLimit = Float.parseFloat(creditLimitAsString);
		return creditLimit;
	}
	
	public static void checkCreditLimit(String accountNumber, float balance, float debits, 
		float credits, float creditLimit)
		{
			float newBalance;
			
			newBalance = balance - debits + credits;
			
			String text = "\nAccount Number ==> " + accountNumber + "\nCredit limit      " +
						  "    ==> " + String.format("�%.2f",creditLimit) + "\nNew Balance      ==> " +
						  String.format("�%.2f",newBalance);
						  
			if(newBalance < -creditLimit)
				text += "\nSorry - Credit limit has been exceeded";
			else
				text += "\nCredit limit has not been exeeded";
			
			JOptionPane.showMessageDialog(null, text, "Accounts Details", JOptionPane.PLAIN_MESSAGE);
		}	
}