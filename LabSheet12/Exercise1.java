package LabSheet12;
// Java Program Exercise1
/* By: Faun Schutz
 * Start: 09/04/2020
 * Finish: 09/04/2020
 *
 */
 
import javax.swing.JOptionPane;

public class Exercise1{
	public static void main(String args[])
	{
		float height[] = new float[10];
		
		readArray(height);
		
		JOptionPane.showMessageDialog(null, "Average height: " + averageHeight(height) +
											"\nTallest height: " + tallestHeight(height) +
											"\nSmallest height: " + smallestHeight(height),
									  	"Height Stats", JOptionPane.INFORMATION_MESSAGE);

		heightsAbove1_7m(height);
		
		System.exit(0);
	}
	
	public static void readArray(float height[])
	{
		String heightAsString;
		
		for(int i = 0; i < height.length; i++)
		{
			heightAsString = JOptionPane.showInputDialog("Enter height(m) for student " + (i+1) + ": ");
			height[i] = Float.parseFloat(heightAsString);
		}
	}
	
	public static float averageHeight(float height[])
	{
		float total = 0;
		
		for(int i = 0; i < height.length; i++)
		{
			total += height[i];
		} 
			
		return total / height.length;
	}
	
	public static float tallestHeight(float height[])
	{
		float tallestHeight = 0;
		
		for(int i = 0; i < height.length; i++)
		{
			if(i == 1)
				tallestHeight = height[i];
				
			else
			{
				if(height[i] > tallestHeight)
					tallestHeight = height[i];
			}
		}
		
		return tallestHeight;
	}
	
	public static float smallestHeight(float height[])
	{
		float smallestHeight = 0;
		
		for(int i = 0; i < height.length; i++)
		{
			if(i == 1)
				smallestHeight = height[i];
				
			else
			{
				if(height[i] < smallestHeight)
					smallestHeight = height[i];
			}
		}
		
		return smallestHeight;
	}
	
	public static void heightsAbove1_7m(float height[])
	{
		String heightsAbove1_7m = "";
		
		for(int i = 0; i < height.length; i++)
		{
			if(height[i] > 1.7f)
				heightsAbove1_7m += height[i] + " ";
		} 
			
		JOptionPane.showMessageDialog(null, "The list of hieghts over 1.7m is:\n" + heightsAbove1_7m,
										"Heights over 1.7m", JOptionPane.INFORMATION_MESSAGE);
	}
}