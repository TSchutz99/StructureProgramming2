package LabSheet14;
// Java Program FirstJFrame
/* By: Faun Schutz
 * Start: 28/04/2020
 * Finish: 28/04/2020
 *
 * This program illustrates the use of a JFrame GUI components.
 */
 
import javax.swing.JFrame;

public class FirstJFrame{
	public static void main(String args[])
	{
		JFrame jFrameWindow = new JFrame();
		
		jFrameWindow.setTitle("Our First JFrame GUI Application");
		jFrameWindow.setSize(350, 300);
		jFrameWindow.setVisible(true);
		jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}