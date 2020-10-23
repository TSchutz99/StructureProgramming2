package LabSheet3;
/* Java Program Exercise1
 * by: Faun Schutz
 * Start: 27/01/2020
 * Finish: 27/01/2020
 *
 * 
 */

import javax.swing.JOptionPane; 
public class Exercise1{
	public static void main(String args[])
	{
		String choice;
		
		choice = JOptionPane.showInputDialog("1. Calculate the area of a triangle" +
											 "\n2. Calculate the volume of a cone" + 
										   	 "\n3. Quit" + 
											 "\n\n\n\nPlease enter your chocie (1-3): ");
		
		switch(choice){
			
			case "1":
				
				String sideAString, sideBString, sideCString;
				float sideA, sideB, sideC, area1, area2;
				
				sideAString = JOptionPane.showInputDialog("Please enter the length of the first side: ");
				sideA = Float.parseFloat(sideAString);
				
				sideBString = JOptionPane.showInputDialog("Please enter the length of the second side: ");
				sideB = Float.parseFloat(sideBString);
				
				sideCString = JOptionPane.showInputDialog("Please enter the length of the third side: ");
				sideC = Float.parseFloat(sideCString);
				
				area1 = (sideA + sideB + sideC) / 2;
				area2 = (float)Math.sqrt(area1 * (area1 - sideA) *  (area1 - sideB) * (area1 - sideC));
				
				JOptionPane.showMessageDialog(null, "The area of the triangle is " + String.format("%.3f", area2) +
													" metres squared", "Triangle Area", JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
				
			break;
			
			case "2":
				
				String radiusString, heightString;
				float radius, height, volume;
				final float PI = 3.142f;
				
				radiusString = JOptionPane.showInputDialog("Please enter the radius of the cone:");
				radius = Float.parseFloat(radiusString);
				
				heightString = JOptionPane.showInputDialog("Please enter the height of the cone:");
				height = Float.parseFloat(heightString);
				
				volume = (1/3f * PI * (float)Math.pow(radius, 2) * height);
				
				JOptionPane.showMessageDialog(null, "The volume of the cone is " + String.format("%.3f", volume) +
													" metres cubed", "Cone Volume", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
			
			break;
			
			case "3":
				
				JOptionPane.showMessageDialog(null, "Thanks for using the system. Goodbye!", "Farewell", 
													JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
				
			break;
			
			default:
				
				JOptionPane.showMessageDialog(null, "Sorry - you have entered an invalid choice - most be between 1 and 3",
													"Warning Message", JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
		}
	}
}