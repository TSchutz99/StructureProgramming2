package LabSheet6;
/* Java Program Exercise
 * by: Faun Schutz
 * Start: 10/02/2020
 * Finish: 10/01/2020
 *
 * This Program uses many methods - some read in custumers bank account details and another method to check
 * if the customers credit limit is exceeded.
 */
 
import javax.swing.JOptionPane;

public class Exercise2{
	public static void main(String args[])
	{
		String accountNumber;
		float balance, debits, credits, creditLimit;
		
		accountNumber = getCustumerAccuntNumber();
		
		while(!accountNumber.equals(""))
		{
			balance = getCustomerBalance();
			debits = getCustomerDebits();
			credits = getCustomerCredits();
			creditLimit = getCustomerCreditLimit();
			
			displayResults(accountNumber, balance, debits, credits, creditLimit);
			
			accountNumber = getCustumerAccuntNumber();
		}
		
		JOptionPane.showMessageDialog(null, "Thanks for using the system - Goodbye!", "Exiting System ...", 
									  JOptionPane.PLAIN_MESSAGE);
		
		System.exit(0);
	}
	
	public static String getCustumerAccuntNumber()
	{
		String accountNumber;
		accountNumber = JOptionPane.showInputDialog("Enter account Number (<CR> to exit) ");
		return accountNumber;
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
	
	public static boolean checkCreditLimit(float balance, float debits, float credits, float creditLimit)
	{
			
		boolean result;
		float newBalance;
			
		newBalance = balance - debits + credits;
			
		if(newBalance < -creditLimit)
			result = true;
		else
			result = false;
			
		return result;
	}	
			
	public static void displayResults(String accountNumber, float balance, float debits, float credits, float creditLimit)
	{
		float newBalance;
		newBalance = balance - debits + credits;
		
		String text = "\nAccount Number  ==> " + accountNumber + "\nCredit limit      " +
						  "     ==> " + String.format("�%.2f",creditLimit) + "\nNew Balance       ==> " +
						  String.format("�%.2f",newBalance);
						  
		if(checkCreditLimit(balance, debits, credits, creditLimit))
			text += "\nSorry - Credit limit has been exceeded";
		else
			text += "\nCredit limit has not been exeeded";
			
		JOptionPane.showMessageDialog(null, text, "Accounts Details", JOptionPane.PLAIN_MESSAGE);
	}
}