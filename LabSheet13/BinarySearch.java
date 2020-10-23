package LabSheet13;
/* Java Program BinarySearch
 * by: Faun Schutz
 * Start: 21/04/2020
 * Finish: 21/04/2020
 *
 * This program takes an array of name values that has already been sorted into ascending order and uses 
 * the binary search to find a particular name value entered by the user at runtime. The code for the 
 * algorithm is contained within a user-defined method called binarySearch(). 
 */
 
import javax.swing.JOptionPane;
import java.util.Arrays;

public class BinarySearch{
	public static void main(String args[])
	{
		String playerNames[] = {"Rafael Nadal", "Andy Murray", "Roger Federer", "Stanislas Wawrinka", "Grigor Dimitrow"};
		String player;
		boolean found;
		
		Arrays.sort(playerNames);
		
		JOptionPane.showMessageDialog(null, "After sorting, the player names array is:\n\n" + Arrays.toString(playerNames));
		
		player = JOptionPane.showInputDialog("Enter the name of the player you seek");
		
		found = binarySearch(playerNames, player);
		
		if(found)
			JOptionPane.showMessageDialog(null, "The player you sought was found in the array", "Found",
											JOptionPane.INFORMATION_MESSAGE);
		
		else
			JOptionPane.showMessageDialog(null, "The player you sought was not found in the array", "Not Found",
											JOptionPane.INFORMATION_MESSAGE);
	}
	
	private static boolean binarySearch(String playerNames[], String player)
	{
		int lowerSub = 0, higherSub = playerNames.length -1, middleSub;
		
		while(lowerSub <= higherSub)
		{
			middleSub = (lowerSub + higherSub) /2;
			
			if(playerNames[middleSub].compareTo(player) < 0)
				lowerSub = middleSub +1;
			else if(playerNames[middleSub].compareTo(player) > 0)
				higherSub = middleSub -1;
			else
				return true;
		}
		
		return false;
	}
} 