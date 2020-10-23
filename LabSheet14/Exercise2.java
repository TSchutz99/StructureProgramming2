package LabSheet14;
// Java Program Exercise2
/* By: Faun Schutz
 * Start: 28/04/2020
 * Finish: 28/04/2020
 *
 * 
 */
 
import javax.swing.JOptionPane;

public class Exercise2{
	public static void main(String args[])
	{
		int choice;
		
		choice = JOptionPane.showConfirmDialog(null, "Take your pick - Yes, No or Cancel", "Select an Option",
												JOptionPane.YES_NO_CANCEL_OPTION);
												
		//System.out.print(choice);
										
		if(choice == 0)
			JOptionPane.showMessageDialog(null, "You chose Yes", "YES",
											JOptionPane.PLAIN_MESSAGE);
											
		else if(choice == 1)
			JOptionPane.showMessageDialog(null, "You chose No", "NO",
											JOptionPane.PLAIN_MESSAGE);
		
		else if(choice == 2)
			JOptionPane.showMessageDialog(null, "You chose Cancel", "CANCEL",
											JOptionPane.PLAIN_MESSAGE);
		
		else
			JOptionPane.showMessageDialog(null, "You closed the window without selecting", "CLOSE",
											JOptionPane.PLAIN_MESSAGE);
											
		System.exit(0);
	}
}