package LabSheet14;
// Java Program Exercise4
/* By: Faun Schutz
 * Start: 28/04/2020
 * Finish: 28/04/2020
 *
 * This program illustrates the use of a JFrame GUI components.
 */
 
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Exercise4{
	public static void main(String args[])
	{
		JFrame jFrameWindow = new JFrame();
		
		jFrameWindow.setTitle("Exercise4.java");
		jFrameWindow.setSize(250, 250);
		jFrameWindow.setLocation(150, 150);
		jFrameWindow.setVisible(true);
		jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JOptionPane.showMessageDialog(null, "Text obtained from the JFrame title bar is\n\n" + jFrameWindow.getTitle(), 
										"Title Bar Text", JOptionPane.INFORMATION_MESSAGE);
	}
}