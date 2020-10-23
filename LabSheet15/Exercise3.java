package LabSheet15;
// Java Program Exercise3
/* By: Faun Schutz
 * Start: 30/04/2020
 * Finish: 30/04/2020
 *
 * This program uses some text-fields for input and a botton to submit the users input. The program should
 * calculatethe average age of the group and give the name of the oldest person. There is some validation
 * built-in to the GUI also.
 */
 
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Exercise3{
	
	JTextField nameField;
	JTextField ageField;
	String nameOldest, name[] = new String[3];
	JFrame jFrameWindow;
	int totalProcessed = 0, age[] = new int[3], totalAge = 0, oldestAge = 0, youngestAge = 150;
	
	public static void main(String args[])
	{
		Exercise3 guiApp = new Exercise3();
	}
	
	public Exercise3()
	{
		jFrameWindow = new JFrame("Enter Details");
		
		FlowLayout flowLayout = new FlowLayout();
		jFrameWindow.setLayout(flowLayout);
		jFrameWindow.setSize(350, 100);
		jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel nameLabel = new JLabel("Name:");
		jFrameWindow.add(nameLabel);
		
		nameField = new JTextField(15);
		jFrameWindow.add(nameField);
		
		moveCursor handler1 = new moveCursor();
		nameField.addActionListener(handler1);
		
		JLabel ageLabel = new JLabel("Age:");
		jFrameWindow.add(ageLabel);
		
		ageField = new JTextField(3);
		jFrameWindow.add(ageField);
		
		JButton submitButton = new JButton("Submit");
		jFrameWindow.add(submitButton);
		
		ButtonEventHandler handler2 = new ButtonEventHandler();
		submitButton.addActionListener(handler2);
		jFrameWindow.setVisible(true);
	}
	
	private class moveCursor implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			ageField.requestFocus();
		}
	}
	
	private class ButtonEventHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String aboveAvAgeNames = "";
			String ageAsString;
			float averageAge;
			int choice;
			
			name[totalProcessed] = nameField.getText();
			
			if(!name[totalProcessed].equals(""))
			{
				ageAsString = ageField.getText();
				age[totalProcessed] = Integer.parseInt(ageAsString);
				totalAge += age[totalProcessed];
				
				if(age[totalProcessed] > oldestAge)
				{
					oldestAge = age[totalProcessed];
					nameOldest = name[totalProcessed];
				}
				if(age[totalProcessed] < youngestAge)
				{
					youngestAge = age[totalProcessed];
				}
			}
			
			totalProcessed++;
			nameField.setText("");
			ageField.setText("");
			
			choice = JOptionPane.showConfirmDialog(null, "More details to enter?", "",
													JOptionPane.YES_NO_OPTION);
			
			if(choice == JOptionPane.NO_OPTION)
			{
				jFrameWindow.setVisible(false);
				if(totalProcessed != 0)
				{
					averageAge = (float)totalAge/totalProcessed;
					
					for(int i = 0; i < totalProcessed; i++)
					{
						if(age[i] > averageAge)
							aboveAvAgeNames += name[i] + " ";
					}
					
					JOptionPane.showMessageDialog(null, "Average age: " + averageAge + 
														"\nOldest person: " + nameOldest + 
														"\nYoungest age: " + youngestAge + 
														"\n\nThe following people are above the average age:\n\n" + aboveAvAgeNames, 
													"Statistics", JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "You entered no details" +  
														"\nThanks for using the system - Goodbye!", "Statistics",
													JOptionPane.INFORMATION_MESSAGE);
				}
				
				System.exit(0);
			}
		}
	}
}