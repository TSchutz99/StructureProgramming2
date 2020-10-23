package LabSheet13;
/* Java Program Exercise2
 * by: Faun Schutz
 * Start: 21/04/2020
 * Finish: 21/04/2020
 *
 */
 
import javax.swing.JOptionPane;
import java.util.Arrays;
import java.awt.Font;
import javax.swing.JTextArea;

public class Exercise2{
	public static void main(String args[])
	{
		String tNumbers[] = new String[10], courseNames[] = new String[10], tNumber;
		boolean found;
		int noCN = 0;
		
		populateArrays(tNumbers, courseNames);
		
		JOptionPane.showMessageDialog(null, "Before sorting, the contents of the t-Numbers and course names array are:\n\n\n" +
											Arrays.toString(tNumbers) + "\n" + Arrays.toString(courseNames),
										"Message", JOptionPane.INFORMATION_MESSAGE);
										
		sortArray(tNumbers, courseNames);
		
		JOptionPane.showMessageDialog(null, "Before sorting, the contents of the t-Numbers and course names array are:\n\n\n" +
											Arrays.toString(tNumbers) + "\n" + Arrays.toString(courseNames),
										"Message", JOptionPane.INFORMATION_MESSAGE);
		
		tNumber = JOptionPane.showInputDialog("Enter the t-Number of the student you seek");
		
		found = binarySearch(tNumbers, tNumber);
		
		if(found)
		{	
			for(int i = 0; i < tNumbers.length; i++)
				if(tNumbers[i].compareTo(tNumber) < 0)
					noCN = i;
			
			JOptionPane.showMessageDialog(null, "The t-Number you sought was found in the array and the corresponding " +
												"course names for this student is " + courseNames[noCN],
											"Found!", JOptionPane.INFORMATION_MESSAGE);
		}
		
		else
			JOptionPane.showMessageDialog(null, "The t-Number you sought was not found in the Array", "Not Found",
											JOptionPane.INFORMATION_MESSAGE);
											
		studentStatics(tNumbers, courseNames);
		
		System.exit(0);
	}
	
	private static void populateArrays(String tNumbers[], String courseNames[])
	{
		for(int i = 0; i < tNumbers.length; i++)
		{
			tNumbers[i] = JOptionPane.showInputDialog("Please input student " + (i+1) + "'s t-Number");
			
			courseNames[i] = JOptionPane.showInputDialog("Please input student " + (i+1) + "'s course name");
		}
	}
	
	private static void sortArray(String tNumbers[], String courseNames[])
	{
		String temp, smallest;
		int sub;
		
		for(int i = 0; i < tNumbers.length -1; i++)
		{
			smallest = tNumbers[i];
			sub = i;
			
			for(int j = i+1; j < tNumbers.length; j++)
			{
				if(tNumbers[j].compareTo(smallest) < 0)
				{
					smallest = tNumbers[j];
					sub = j; 
				}
			}
			
			temp = tNumbers[i];
			tNumbers[i] = tNumbers[sub];
			tNumbers[sub] = temp; 
				
			temp = courseNames[i];
			courseNames[i] = courseNames[sub];
			courseNames[sub] = temp; 
		}
	}
	
	private static boolean binarySearch(String tNumbers[], String tNumber)
	{
		int lowerSub = 0, higherSub = tNumbers.length -1, middleSub;
		
		while(lowerSub <= higherSub)
		{
			middleSub = (lowerSub + higherSub) /2;
			
			if(tNumbers[middleSub].compareTo(tNumber) < 0)
				lowerSub = middleSub +1;
			else if(tNumbers[middleSub].compareTo(tNumber) > 0)
				higherSub = middleSub -1;
			else
				return true;
		}
		
		return false;
	}
	
	public static void studentStatics(String tNumbers[], String courseNames[])
	{
		Font textAreaFont = new Font("monospaced", Font.PLAIN, 12);
		JTextArea textArea = new JTextArea(20, 20);
		
		textArea.setFont(textAreaFont);
		
		int no003 = 0, noHLorCh = 0, noCompt00036onwards = 0;
		String text = String.format("%-25s%-25s\n%-25s%-25s\n\n", "T-Number", "Course Name", "------------", "--------------");
		
		for(int i = 0; i < tNumbers.length; i++)
		{
			if(tNumbers[i].startsWith("t003"))
				no003++;
				
			if(courseNames[i].equals("Health & Leisure") || courseNames[i].equals("Chemistry"))
				noHLorCh++;
				
			if(courseNames[i].equals("Computing") && tNumbers[i].startsWith("t00036"))
				noCompt00036onwards++;
				
			if(courseNames[i].equals("Mechtronics") || courseNames[i].equals("Early Childcare") || courseNames[i].equals("Computing"))
				text += String.format("\n%-25s%-25s", tNumbers[i], courseNames[i]);
		}
		
		textArea.append("The number of students whose t-number begins with \"t003\" is " + no003 +
						"\nThe number of students whose course name is either \"Health & Leisure\" or \"Chemistary\" is " + noHLorCh +
						"\nThe percentage of students taking the \"Computing\" course whose t-number is from \"t00036\" onwards is " + (noCompt00036onwards*10) + "%" +
						"\nThe list of t-number/course names for students taking \"Mechtronics\",\"Early Childcare\" or \"Computing\"\n\n");
		textArea.append(text);
		
		JOptionPane.showMessageDialog(null, textArea, "Student Statics",
										JOptionPane.INFORMATION_MESSAGE);
	}
} 