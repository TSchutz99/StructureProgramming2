package LabSheet16;
// Java Program Exercise1
/* By: Faun Schutz
 * Start: 02/05/2020
 * Finish: 02/05/2020
 * 
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class Exercise1{
	
	JTextField lowerLimitField, upperLimitField;
	JButton GenerateButton, sortButton, statisticsButton;
	int randomNumbers[] = new int[100];
	int textFieldEventCount = 0;
	
	public static void main(String args[])
	{	 		
		 Exercise1 guiApp = new Exercise1();
	}
	
	public Exercise1()
	{
		JFrame jFrameWindow = new JFrame("Random Number Analyser");
		 			 			 
		 FlowLayout flowLayout = new FlowLayout();
	     jFrameWindow.setLayout(flowLayout);		     	     		 
		 jFrameWindow.setSize(500,150);
		 jFrameWindow.setLocation(250, 250);
		 jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		 JLabel lowerLabel = new JLabel("Lower Limit:"); 				 
 		 jFrameWindow.add(lowerLabel);	 
 		 	
 		 lowerLimitField = new JTextField(8); 
 		 jFrameWindow.add(lowerLimitField);
 		 
 		 JLabel upperLabel = new JLabel("Upper Limit:"); 				 
 		 jFrameWindow.add(upperLabel);	 
 		 	
 		 upperLimitField = new JTextField(8); 
 		 jFrameWindow.add(upperLimitField);		
		
		 GenerateButton = new JButton("Generate Random Numbers");
		 jFrameWindow.add(GenerateButton);
		 
		 sortButton = new JButton("Sort Random Numbers");
		 jFrameWindow.add(sortButton);
		 
		 statisticsButton = new JButton("Generate Statistics");
		 jFrameWindow.add(statisticsButton);
		 
		 ButtonEventHandler buttonHandler = new ButtonEventHandler();
		 GenerateButton.addActionListener(buttonHandler);
		 sortButton.addActionListener(buttonHandler);
		 statisticsButton.addActionListener(buttonHandler);
		 
		 jFrameWindow.setVisible(true);
	}
	
	private class ButtonEventHandler implements ActionListener
    {
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == GenerateButton)
			{
				// Validation Section
				String lowerLimitAsString = lowerLimitField.getText(), upperLimitAsString = upperLimitField.getText();
				int lowerLimit, upperLimit; // lowerLimit = Integer.parseInt(lowerLimitAsString), upperLimit = Integer.parseInt(upperLimitAsString);
				
				if(!(isWholeNumber(lowerLimitAsString)))
				{
					JOptionPane.showMessageDialog(null, "Lower Limit must be a whole number!",
			                              			"Error!", JOptionPane.ERROR_MESSAGE);
			        return;
				}
				else if(!(isWholeNumber(upperLimitAsString)))
				{
					JOptionPane.showMessageDialog(null, "Upper Limit must be a whole number!",
			                              			"Error!", JOptionPane.ERROR_MESSAGE);
			        return;
				}
				else
				{
					lowerLimit = Integer.parseInt(lowerLimitAsString);
					upperLimit = Integer.parseInt(upperLimitAsString);
					
					if(!(lowerLimit <= upperLimit))
				    {
						JOptionPane.showMessageDialog(null, "Lower Limit can not exceed Upper Limit!",
			                              			"Error!", JOptionPane.ERROR_MESSAGE);
			            return;
				    }
				    // Validation Section End 
				    populateArray(randomNumbers, lowerLimit, upperLimit);
					displayArray(randomNumbers); 
				}
			}
			
			else if(e.getSource() == sortButton)
			{
				selectionSort(randomNumbers);
				displayArray(randomNumbers);
			}
			
			else
			{
				int oddNumbers = 0, NumEnding0 = 0, total = 0;
				String listOf10Largest = "";
				
				selectionSort(randomNumbers);
				
				for(int i = 0; i < randomNumbers.length; i++)
				{
					if(randomNumbers[i] %2 == 1)
						oddNumbers++;
						
					else if(randomNumbers[i] %10 == 0)
						NumEnding0++;
						
					total += randomNumbers[i];
					
					if(i >= 90 && i < 100)
						listOf10Largest += randomNumbers[i] + "  ";
				}
				
				JOptionPane.showMessageDialog(null,"Count of odd numbers generated is " + oddNumbers +
					     	                       "\nCount of numbers ending in a zero is " + NumEnding0 +
					     	                       "\nAverage of the numbers generated is " + String.format("%.2f",total/100f) +
					     	                       "\nList of 10 largest numbers generated is " + listOf10Largest);	     
			}
		}
    }
    
    private static boolean isWholeNumber(String num)
    {
    	if(num.equals(""))
		    return false;
			      
		if(num.charAt(0) != '-' && !Character.isDigit(num.charAt(0)))
			return false;
				
		if(num.charAt(0) == '-' && num.length() == 1)
			return false;
				
		int i;
				
		for(i = 1; i < num.length(); i++)
		{
			if(!Character.isDigit(num.charAt(i)))
				break;
		}
				
		if(i < num.length())
			return false;
		
		else
			return true;
    }
    
    private static void populateArray(int randomNumbers[], int lowerLimit, int upperLimit)
    {
		for(int i = 0; i < randomNumbers.length; i++)
		{
			randomNumbers[i] = (int)(Math.random()*(upperLimit - lowerLimit + 1) + lowerLimit);
		}
    }
    
    private static void displayArray(int randomNumbers[])
    {
    	JTextArea textArea = new JTextArea();
    	
    	Font font = new Font("monospaced", Font.PLAIN, 12);
    	textArea.setFont(font);
    	
    	String text = "";
    	
    	for(int i = 0; i < randomNumbers.length; i++)
    	{
    		text += String.format("%5d", randomNumbers[i]);
	 			 	
	 		if((i+1) %10 == 0)
	 			text += "\n";
    	}
    	
    	textArea.append(text);
    	
    	JOptionPane.showMessageDialog(null, textArea, "Random Numbers Grid", 
    									JOptionPane.INFORMATION_MESSAGE);
    	
    }
    
    private static void selectionSort(int randomNumbers[])
    {
    	int smallest, temp, sub;
		
		for(int i = 0; i < randomNumbers.length; i++)
		{
			smallest = randomNumbers[i];
			sub = i;
			
			for(int j = i+1; j < randomNumbers.length; j++)
			{
				if(randomNumbers[j] < smallest)
				{
					smallest = randomNumbers[j];
					sub = j; 
				}
			}
			
			temp = randomNumbers[i];
			randomNumbers[i] = randomNumbers[sub];
			randomNumbers[sub] = temp; 
		}
    }
}