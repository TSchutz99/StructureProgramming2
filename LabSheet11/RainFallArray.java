package LabSheet11;
// Java Program RainFallArray
/* By: Faun Schutz
 * start: 30/03/2020
 * finish: 30/03/2020
 *
 * This Program creates an array of rainfall values and determines some statistical
 * information based on it.
 */
 
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextArea;

public class RainFallArray{
	public static void main(String args[])
	{
		int rainfall[] = {7, 12, 10, 4, 5, 3, 1, 4, 3, 7, 8, 10};
		int month, i, janToJuneRainfall = 0, winterRainfall;
		String text = "", monthAsString;
		
		Font textAreaFont = new Font("monospaced", Font.PLAIN, 12);
		JTextArea textArea = new JTextArea(14, 20);
		
		textArea.setFont(textAreaFont);
		
		for(i = 0; i < rainfall.length; i++)
		{
			text += String.format("%-10s%-10s\n", (i+1), rainfall[i]);
		}
		
		textArea.append(text);
		
		JOptionPane.showMessageDialog(null, textArea, "Rainfall Stats", 
										JOptionPane.PLAIN_MESSAGE);
		
		monthAsString = JOptionPane.showInputDialog("Please enter a month nuber (1-12)");
		
		month = Integer.parseInt(monthAsString);
		
		JOptionPane.showMessageDialog(null, "Rainfall for this month is: " + 
				rainfall[month-1] + "mm", "Rainfall Stats", JOptionPane.PLAIN_MESSAGE);
				
		winterRainfall = rainfall[0] + rainfall[10] + rainfall[11];
		
		JOptionPane.showMessageDialog(null, "Total Rainfall for the winter is: " + 
				winterRainfall + "mm", "Rainfall Stats", JOptionPane.PLAIN_MESSAGE);
				
		for(i = 0; i <= 5; i++)
		{
			janToJuneRainfall += rainfall[i]; 
		}
				JOptionPane.showMessageDialog(null, "Total rainfall from January to June is: " +
				janToJuneRainfall + "mm", "Rainfall Stats", JOptionPane.PLAIN_MESSAGE);
	}
}