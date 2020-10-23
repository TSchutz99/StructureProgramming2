package MyCA_Copies.FinalExam;
// Java Program FaunSchutz
/* By: Faun Schutz
 * Start: 05/05/2020
 * Finish: 05/05/2020
 *
 * This Program uses arrays and GUIs to randomly generate 100 random salaries between 20,000
 * and 60,000 and then displays them along with the largest, smallest, average and median 
 * salary aswell as the the percentage of salaries between 35,000 and 45,000. 
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class FaunSchutz{

	JButton viewSalaries, salaryStats;
	int salaries[] = new int[100];
	Font font = new Font("monospaced", Font.PLAIN, 12);

	public static void main(String args[])
	{
		FaunSchutz guiApp = new FaunSchutz();
	}

	public FaunSchutz()
	{
		JFrame jFrameWindow = new JFrame("Salaries");
		
		FlowLayout flowLayout = new FlowLayout();
		jFrameWindow.setLayout(flowLayout);
		jFrameWindow.setSize(300, 150);
		jFrameWindow.setLocation(150, 150);
		jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		viewSalaries = new JButton("View Salaries");
		jFrameWindow.add(viewSalaries);
		
		salaryStats = new JButton("Salary Stats");
		jFrameWindow.add(salaryStats);
		
		ButtonEventHandler buttonHandler = new ButtonEventHandler();
		viewSalaries.addActionListener(buttonHandler);
		salaryStats.addActionListener(buttonHandler);
		
		jFrameWindow.setVisible(true);
	}

	private class ButtonEventHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{	
			if(e.getSource() == viewSalaries)
			{
				JTextArea textArea = new JTextArea();
				textArea.setFont(font);
				
				populateArray(salaries);
				String text = "";
				
				for(int i = 0; i < salaries.length; i++)
		    	{
		    		text += String.format("%-10d", salaries[i]);
			 			 	
			 		if((i+1) % 10 == 0)
			 			text += "\n";
		    	}
		    	
		    	textArea.append(text);
		    	
		    	JOptionPane.showMessageDialog(null, textArea, "Salary Data", JOptionPane.INFORMATION_MESSAGE);
			}
			else if(e.getSource() == salaryStats)
			{
				if(salaries[0] == 0)
					JOptionPane.showMessageDialog(null, "The array has not yet been populated with random salary values!",
													"No Salary Data", JOptionPane.ERROR_MESSAGE);
				else
				{
					selectionSort(salaries);
					
					int largestSalary = salaries[99], smallestSalary = salaries[0], total = 0, noSal35_45 = 0;
					
					for(int i = 0; i < salaries.length; i++)
					{
						total += salaries[i];
						
						if(salaries[i] >= 35000 && salaries[i] <= 45000)
							noSal35_45++;
					}
					
					JTextArea textArea = new JTextArea();
					textArea.setFont(font);
					
					String text = "";
					for(int i = 0; i < salaries.length; i++)
			    	{
			    		text += String.format("%-10d", salaries[i]);
				 			 	
				 		if((i+1) % 10 == 0)
				 			text += "\n";
			    	}
			    	
			    	text += "\n\n\nLargest salary in the array: �" + largestSalary + 
			    		    "\nSamllest salary in the array: �" + smallestSalary + 
			    		    "\nAverage salary: �" + String.format("%.2f", (float)total / salaries.length) +
			    		    "\nMedian salary: �" + String.format("%.0f", ((float)salaries[49] + (float)salaries[50]) / 2) +
			    		    "\nPercentage of salaries in the range �35000 - �45000: " + (((float)noSal35_45 / salaries.length) * 100) + "%";
			    		    
			    	textArea.append(text);
			    	JOptionPane.showMessageDialog(null, textArea, "Salary Stats", JOptionPane.INFORMATION_MESSAGE);
			    	
				}
			}
		}
	}

	private static void populateArray(int salaries[])
	{
		for(int i = 0; i < salaries.length; i++)
		{
			salaries[i] = (int)(Math.random()*(40001) + 20000);
		}
	}
	
	private static void selectionSort(int salaries[])
	{
		int smallest, temp;
		int sub;
		
		for(int i = 0; i < salaries.length; i++)
		{
			smallest = salaries[i];
			sub = i;
			
			for(int j = i+1; j < salaries.length; j++)
			{
				if(salaries[j] < smallest)
				{
					smallest = salaries[j];
					sub = j; 
				}
			}
			
			temp = salaries[i];
			salaries[i] = salaries[sub];
			salaries[sub] = temp; 
		}
	}
}