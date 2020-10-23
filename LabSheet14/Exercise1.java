package LabSheet14;
// Java Program Exercise1
/* By: Faun Schutz
 * Start: 28/04/2020
 * Finish: 28/04/2020
 *
 * This program changes the icons on the message dialog box. 
 */
 
import javax.swing.JOptionPane;

public class Exercise1{
	public static void main(String args[])
	{
		JOptionPane.showMessageDialog(null, "This Message dialog uses an error message icon", "Error!",
										JOptionPane.ERROR_MESSAGE);
										
		JOptionPane.showMessageDialog(null, "This Message dialog uses a warning message icon", "Warning!",
										JOptionPane.WARNING_MESSAGE);
										
		JOptionPane.showMessageDialog(null, "This Message dialog uses an question message icon", "Question!",
										JOptionPane.QUESTION_MESSAGE);	
											
		System.exit(0);
	}
}