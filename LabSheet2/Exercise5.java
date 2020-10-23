package LabSheet2;
/* Java Program Exercise5
 * by: Faun Schutz
 * Start: 25/01/2020
 * Finish: 25/01/2020
 *
 * 
 */

import java.util.Scanner; 
public class Exercise5{
	public static void main(String args[])
	{
		String word, longestWord="";
		float averageNoVow = 0, avaerageNoCon=0;
		
		Scanner input = new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			System.out.print("Please enter word " + (i+1) + ": ");
			word = input.nextLine().toLowerCase();
			
			for(int j=0;j<word.length();)
			{				
				if(word.charAt(j) == 'a' || word.charAt(j) == 'e' || word.charAt(j) == 'i' || word.charAt(j) == 'o' || word.charAt(j) == 'u')
					averageNoVow++;
					
				if(word.charAt(j) > 'a' && word.charAt(j) <= 'z' && word.charAt(j) != 'a' && word.charAt(j) != 'e' && word.charAt(j) != 'i' && word.charAt(j) != 'o' && word.charAt(j) != 'u')
					avaerageNoCon++;
					
				if(j==0){
					longestWord = word;
				}else{
					if(word.length() > longestWord.length())
						longestWord = word;
				}
					
				j++;
			}
		}
		
		
	}
}