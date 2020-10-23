package LabSheet7;
/* Java Program Exercise5
 * By: Faun Schutz
 * start: 12/02/2020
 * finish: 12/02/2020
 *
 */
 
import javax.swing.JOptionPane;

public class Exercise5{
	public static void main(String args[])
	{
		String widthAsString;
		int width;
		
		widthAsString = JOptionPane.showInputDialog("Please enter the width of your square graphic");
		width = Integer.parseInt(widthAsString);
		
		squareGraphic(width);
	}
	
	public static void squareGraphic(int width)
	{
		String block = "#    ", square="";
		
		for(int h = 0; h < width; h++)
		{
			square = square + "\n";
			
			if(width != h)
				for(int i = 0; i < width; i++)
				{
				square = square + block;
				}
		}	
			
		JOptionPane.showMessageDialog(null, square, "Square Graphic", JOptionPane.PLAIN_MESSAGE);
	}
} 