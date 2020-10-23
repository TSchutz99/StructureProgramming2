package LabSheet3;
/* Java Program Exercise2
 * by: Faun Schutz
 * Start: 27/01/2020
 * Finish: 27/01/2020
 *
 * 
 */

import javax.swing.JOptionPane; 
import javax.swing.JTextArea;
import java.awt.Font;

public class Exercise2{
	public static void main(String args[])
	{
		String name, tNum, course, markString;
		float mark;
		int student = 1;
		
		JTextArea textArea = new JTextArea(14, 30);
		
		Font textAreaFont = new Font("monespaced", Font.PLAIN, 12);
		textArea.setFont(textAreaFont);
		
		textArea.setText(String.format("%-25s%-20s%-25s%10s\n%-25s%-20s%-25s%10s", "Name","T-Number","Course",
									  "Avg Mark","=====","========","======","========"));
									  
		while(student != 2)
		{
			name = JOptionPane.showInputDialog("Please enter the name of student " + student);
			tNum = JOptionPane.showInputDialog("Please enter the T-Number of student " + student);
			course = JOptionPane.showInputDialog("Please enter the Course of student " + student);
			
			markString = JOptionPane.showInputDialog("Please enter the Mark of student " + student);
			mark = Float.parseFloat(markString);
			
			textArea.append(String.format("\n%-25s%-15s%-25s%10.2f\n", name, tNum, course, mark));
			
			student++;
		}
		
		JOptionPane.showMessageDialog(null, textArea, "Formatted Data", JOptionPane.PLAIN_MESSAGE);
		
	}
}