package LabSheet12;
/* Java Program Exercise6
 * by: Faun Schutz
 * Start: 20/04/2020
 * Finish: 20/04/2020
 *
 * This program generates 7 random lotto numbers and also using arrays ensures that none of 
 * the numbers are the same.
 */

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Exercise6{
	public static void main(String args[])
	{
		int lottoNumber[] = new int[7];
		boolean alreadyPicked[] = new boolean[43];
		
		for(int i = 0; i < 7; i++)
		{
			lottoNumber[i] = (int)(Math.random()*42 + 1);
			
			if(alreadyPicked[lottoNumber[i]] == true)
			{
				while(alreadyPicked[lottoNumber[i]] == true)
				{
					lottoNumber[i] = (int)(Math.random()*42 + 1);
				}
			}
			
			alreadyPicked[lottoNumber[i]] = true;
		}
		
		// Arrays.sort(lottoNumber);
		
		JOptionPane.showMessageDialog(null, "The lotto numbers numbers  are :\n\n" + Arrays.toString(lottoNumber), 
										"Lotto Draw", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}
}