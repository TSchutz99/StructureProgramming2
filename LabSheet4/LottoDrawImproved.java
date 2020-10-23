package LabSheet4;
/* Java Program LottoDrawImproved
 * by: Faun Schutz
 * Start: 31/01/2020
 * Finish: /01/2020
 *
 * 
 */

import javax.swing.JOptionPane;

public class LottoDrawImproved{
	public static void main(String args[])
	{
		int lottoNumber;
		String numbers = "";
		String with2Digits="";
		
		/*String text="";
		 
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter text: ");
		text = input.nextLine();
		
		System.out.println("First 3 characters of text are: " + text.substring(i,i+2));
		System.out.println("First 3 characters of text are: " + text.substring(0,3));*/
		
		for(int i=1; i<=7; i++)
		{
			lottoNumber = (int)(Math.random()*42 + 1);
			System.out.println(lottoNumber);
			
			if(lottoNumber < 10){
					with2Digits = String.format("%02d", lottoNumber);
					//numbers += with2Digits + "  ";
				    //System.out.println(with2Digits);
				}
			else
				with2Digits = String.valueOf(lottoNumber);
				
			int j;
			
			for(j=0; j<numbers.length();)
			{	
				if(!with2Digits.equals(numbers.substring(j,j+2)))
					j+=3;
				else				  
					break;
					//numbers += lottoNumber + "  ";
			
				//j++;
			}
			
			if(j<numbers.length())
				i--;
			else
				numbers += with2Digits + " ";
				
			System.out.println(numbers);			
		}
		
		JOptionPane.showMessageDialog(null, "The lotto numbers numbers  are :\n" + numbers, "Lotto Draw", JOptionPane.PLAIN_MESSAGE);
		
		System.exit(0);
	}
}