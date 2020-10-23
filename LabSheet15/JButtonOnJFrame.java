package LabSheet15;
// Java Program JBottonOnJFrame
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

public class JButtonOnJFrame{
	
	JTextField nameField;
	JTextField ageField;
	String nameOldest;
	JFrame jFrameWindow;
	int totalProcessed = 0, totalAge = 0, oldestAge = 0;
	
	public static void main(String args[])
	{
		JButtonOnJFrame guiApp = new JButtonOnJFrame();
	}
	
	public JButtonOnJFrame()
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
		
		JLabel ageLabel = new JLabel("Age:");
		jFrameWindow.add(ageLabel);
		
		ageField = new JTextField(3);
		jFrameWindow.add(ageField);
		
		JButton submitButton = new JButton("Submit");
		jFrameWindow.add(submitButton);
		
		ButtonEventHandler handler = new ButtonEventHandler();
		submitButton.addActionListener(handler);
		jFrameWindow.setVisible(true);
	}
	
	private class ButtonEventHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String name;
			String ageAsString;
			int age = 0;
			float averageAge;
			int choice;
			
			name = nameField.getText();
			
			if(!name.equals(""))
			{
				ageAsString = ageField.getText();
				age = Integer.parseInt(ageAsString);
				totalAge += age;
				totalProcessed++;
				
				if(age > oldestAge)
				{
					oldestAge = age;
					nameOldest = name;
				}
			}
			
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
					
					JOptionPane.showMessageDialog(null, "Average age: " + averageAge + 
														"\nOldest person: " + nameOldest, "Statistics",
													JOptionPane.INFORMATION_MESSAGE);
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