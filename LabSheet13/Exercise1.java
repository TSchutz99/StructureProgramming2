package LabSheet13;
/* Java Program Exercise1
 * by: Faun Schutz
 * Start: 20/04/2020
 * Finish: 20/04/2020
 *
 */
 
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextArea;
import java.util.Arrays;
 
public class Exercise1{
	public static void main (String args[])
	{
		String names[] = new String[5];
		float GPAs[] = new float[5]; 
			
		populateArrays(names, GPAs);
		
		sortArray(names, GPAs);
		
		// Was used for test purpose.	
		// System.out.print(Arrays.toString(names) + "\n" + Arrays.toString(GPAs));
		
		displayResults(names, GPAs);
		
		JOptionPane.showMessageDialog(null, "The average GPA is " + String.format("%.0f", averageGPA(GPAs)), "Average GPA", 
										JOptionPane.INFORMATION_MESSAGE);
										
		JOptionPane.showMessageDialog(null, "The standard deviation of the GPA's is " + String.format("%.3f", standardDeviationGPA(GPAs)), "Standerd Deviation", 
										JOptionPane.INFORMATION_MESSAGE);
										
		System.exit(0);
	}
	
	private static void populateArrays(String names[], float GPAs[])
	{
		for(int i = 0; i < names.length; i++)
		{
			names[i] = JOptionPane.showInputDialog("Please input student " + (i+1) + "'s name");
			
			GPAs[i] = Float.parseFloat(JOptionPane.showInputDialog("Please input the GPA for " + names[i]));
		}
	}
	
	private static void sortArray(String names[], float GPAs[])
	{
		float smallest, temp;
		String tempString;
		int sub;
		
		for(int i = 0; i < GPAs.length; i++)
		{
			smallest = GPAs[i];
			sub = i;
			
			for(int j = i+1; j < GPAs.length; j++)
			{
				if(GPAs[j] < smallest)
				{
					smallest = GPAs[j];
					sub = j; 
				}
			}
			
			temp = GPAs[i];
			GPAs[i] = GPAs[sub];
			GPAs[sub] = temp; 
				
			tempString = names[i];
			names[i] = names[sub];
			names[sub] = tempString; 
		}
	}
	
	public static void displayResults(String names[], float GPAs[])
	{
		Font textAreaFont = new Font("monospaced", Font.PLAIN, 12);
		JTextArea textArea = new JTextArea(names.length + 2, 20);
		
		textArea.setFont(textAreaFont);
		
		String text = String.format("%-25s%-5s\n%-25s%-5s", "Name", "GPA", "------", "-----");
		
		for(int i = 0; i < names.length; i++)
		{
			text += String.format("\n%-25s%-5.2f", names[i], GPAs[i]);
		}
		
		textArea.append(text);
		
		JOptionPane.showMessageDialog(null, textArea, "Sorted results", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static float averageGPA(float GPAs[])
	{
		float total = 0;
		
		for(int i = 0; i < GPAs.length; i++)
		{
			total += GPAs[i];
		}
		
		return (total / GPAs.length);
	}
	
	public static float standardDeviationGPA(float GPAs[])
	{
		float totalPOW = 0, variance = 0; 
		
		for(int i = 0; i < GPAs.length; i++)
		{
			totalPOW += Math.pow(GPAs[i], 2);
		}
		
		variance = (totalPOW / GPAs.length) - (float)Math.pow(averageGPA(GPAs), 2);
		
		return (float)Math.sqrt(variance); 
	}
}