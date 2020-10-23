package LabSheet15;
// Java Program Exercise4
/* By: Faun Schutz
 * Start: 30/04/2020
 * Finish: 30/04/2020
 *
 */
 
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Exercise4{
	
	JFrame jFrameWindow;
	JTextField poundsField, kilosField;
	
	public static void main(String args[])
	{
		Exercise4 guiApp = new Exercise4();
	}
	
	public Exercise4()
	{
		jFrameWindow = new JFrame("Weight Converter");
		
		FlowLayout flowLayout = new FlowLayout();
		jFrameWindow.setLayout(flowLayout);
		jFrameWindow.setSize(300, 100);
		jFrameWindow.setLocation(300, 300);
		jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel poundsLabel = new JLabel("Pounds:");
		jFrameWindow.add(poundsLabel);
		
		poundsField = new JTextField(8);
		jFrameWindow.add(poundsField);
		
		JLabel kilosLabel = new JLabel("Kilos:");
		jFrameWindow.add(kilosLabel);
		
		kilosField = new JTextField(8);
		jFrameWindow.add(kilosField);
		
		JButton convertButton = new JButton("Convert");
		jFrameWindow.add(convertButton);
		
		convert handler = new convert();
		convertButton.addActionListener(handler);
		jFrameWindow.setVisible(true);
	}
	
	private class convert implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String poundsAsString = poundsField.getText(), kilosAsString = kilosField.getText();
			float pounds, kilos; // = Float.parseFloat(poundsAsString), = Float.parseFloat(kilosAsString);
			float convertion = 0;
					// OR here inside of and because of the ! negitive								
			if((!(poundsAsString.equals("") || kilosAsString.equals(""))) || (poundsAsString.equals("") && kilosAsString.equals("")))
				JOptionPane.showMessageDialog(null, "You must enter a value into one field and one field only", "Error",
												JOptionPane.ERROR_MESSAGE);
			
			else if(kilosAsString.equals(""))
			{
				pounds = Float.parseFloat(poundsAsString);
				convertion = pounds / 2.2f;
				kilosField.setText(String.format("%.4f", convertion));
			}
			
			else
			{
				kilos = Float.parseFloat(kilosAsString);
				convertion = kilos * 2.2f;
				poundsField.setText(String.format("%.4f", convertion));
			}
		}
	}
}