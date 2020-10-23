package LabSheet14;
// Java Program Exercise6
/* By: Faun Schutz
 * Start: 28/04/2020
 * Finish: 28/04/2020
 *
 * This program adds a JLabel to a JFrame window.
 */
 
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Exercise6{
	public static void main(String args[])
	{
		JFrame jFrameWindow = new JFrame("Adding a JLabel to a JFrame");
		
		FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT);
		
		jFrameWindow.setLayout(flowLayout);
		
		jFrameWindow.setSize(300, 100);
		
		jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel jLabel = new JLabel("Java rules!");
		jLabel.setForeground(Color.RED);
		jLabel.setToolTipText("A very important fact!");
		
		jFrameWindow.add(jLabel);
		
		jFrameWindow.setVisible(true);
		
		int choice;
		
		choice = JOptionPane.showConfirmDialog(null, "Do you wish to remove the JLabel from the JFrame?", "Select an Option",
												JOptionPane.YES_NO_CANCEL_OPTION);
												
		if(choice == 0)
		{
			jFrameWindow.remove(jLabel);
			jFrameWindow.repaint();
		}	
	}
}