package LabSheet14;
// Java Program Exercise5
/* By: Faun Schutz
 * Start: 28/04/2020
 * Finish: 28/04/2020
 *
 * This program adds a JLabel to a JFrame window.
 */
 
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class Exercise5{
	public static void main(String args[])
	{
		JFrame jFrameWindow = new JFrame("Adding a JLabel to a JFrame");
		
		FlowLayout flowLayout = new FlowLayout();
		
		jFrameWindow.setLayout(flowLayout);
		
		// jFrameWindow.setTitle("Adding a JLabel to a JFrame");
		jFrameWindow.setSize(300, 100);
		
		jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel jLabel = new JLabel("Java rules!");
		// jLabel.setText("Java rules!");
		
		jFrameWindow.add(jLabel);
		
		jFrameWindow.setVisible(true);
	}
}