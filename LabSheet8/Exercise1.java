package LabSheet8;
// Java Program Exercise1
/* By: Faun Schutz
 * start: 24/02/2020
 * finish: 24/02/2020
 *
 * 
 */
 
import javax.swing.JOptionPane;

public class Exercise1{
	public static void main(String args[])
	{
		String tNumber = " ", display = "";
		int counter = 0, validTNo = 0; 
		boolean check;
		
		while(!tNumber.equals(""))
		{
			tNumber = JOptionPane.showInputDialog("Please enter a t-number (return to exit)");
			tNumber = tNumber.toLowerCase();
			
			if(counter == 0 && tNumber.equals("")){
			
				JOptionPane.showMessageDialog(null, "You entered no valid t-numbers!", "Valid t-numbers!", 
											  JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}
											  
			check = tNumberChecker(tNumber);
				
			if(check == true){
				display = display + "\n" + tNumber;
				validTNo++;
			}
			else{
				while(check != true){
					tNumber = JOptionPane.showInputDialog("Invalid! Please re-enter t-number (return to exit)");
					tNumber.toLowerCase();
					
					if(tNumber.equals(""))
						break;
					
					check = tNumberChecker(tNumber);
					}
			}	
			counter++;
		}
			
		JOptionPane.showMessageDialog(null, "Number of valid t-numbers entered: " + validTNo +
									  "\nList of valid t-numbers:\n" + display, "Valid t-numbers!", 
									  JOptionPane.INFORMATION_MESSAGE);	
		
		System.exit(0);
	}
	
	public static boolean tNumberChecker(String tNumber)
	{
		boolean result = false;
		
		if(tNumber.length() == 9)
		{
			for(int i = 0; i < tNumber.length()-1; i++)
			{
				if(tNumber.charAt(0) != 't'){
					break;
				}
			
				if(Character.isDigit(tNumber.charAt(i+1)))
					result = true;
				else{
					result = false;
					break;
				}
			}
		}	
		return result;
	}
}