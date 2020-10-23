package LabSheet3;
/* Java Program JOptionPaneInput
 * by: Faun Schutz
 * Start: 27/01/2020
 * Finish: 27/01/2020
 *
 * This program reads in some user-supplied values using a GUI window component.
 */

import javax.swing.JOptionPane; 
public class JOptionPaneInput{
	public static void main(String args[])
	{
		String name, address, ageAsString, heightAsString;
		int age;
		float height;
		
		name = JOptionPane.showInputDialog("Please enter your name: ");
		address = JOptionPane.showInputDialog("Please enter your address: ");
		ageAsString = JOptionPane.showInputDialog("Please enter your age: ");
		heightAsString = JOptionPane.showInputDialog("Please enter your height: ");
		
		age = Integer.parseInt(ageAsString);
		height = Float.parseFloat(heightAsString);
		
		JOptionPane.showMessageDialog(null, "Name: " + name + "\nAddress: " + address + 
											"\nAge: " + age + "\nHeight: " + height + "m","Results", 
										    JOptionPane.PLAIN_MESSAGE);
											
		System.exit(0);
	}
}