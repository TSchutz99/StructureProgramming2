package LabSheet10;
// Java Program Exercise2
/* By: Faun Schutz
 * start: 11/03/2020
 * finish: 16/03/2020
 *
 * 
 */

/* Hey John this program is working fine expect the exit command doesn't work and its 
 * accepting most things I put in but my validations should be working, to test it I even
 * set up the A B C test you showed me but I can't seem to figure out the problem. This 
 * has been buging me for a few days now.
 */

import javax.swing.JOptionPane;

public class Exercise2Modify{
	public static void main(String args[])
	{
		String PPS_NO = " ", listValidPSS_NO = "";
		boolean valid, validPPS_NO;
		
		while(!PPS_NO.equals(""))//modified by JB
		{
			PPS_NO = JOptionPane.showInputDialog("Please enter a PPS number (return to exit)");
			PPS_NO = PPS_NO.toUpperCase(); //modified by JB here
			
			if(PPS_NO.equals("")) //added by JB
				break;
			
			System.out.print(PPS_NO + "\n");
				
			valid = false;
			
			while(valid == false) //modified by JB
			{
				if(PPS_NO.length() == 8 || PPS_NO.length() == 9)
				{
					valid = PPS_NOLetterChecker(PPS_NO);
					
					if(valid == true) //modified by JB
						System.out.print(PPS_NO + "\n");
					if(valid == true) //modified by JB
					{
						validPPS_NO = PSS_NODigitChecker(PPS_NO);
						
						if(validPPS_NO == true) //modified by JB
						{
							listValidPSS_NO += "\n" + PPS_NO;
						}else{
							PPS_NO = JOptionPane.showInputDialog("A. Invalid! Please re-enter PPS number (return to exit)");
						    PPS_NO = PPS_NO.toUpperCase(); //modified by JB here
						}
							
					}else{
						PPS_NO = JOptionPane.showInputDialog("B. Invalid! Please re-enter PPS number (return to exit)");
						PPS_NO = PPS_NO.toUpperCase(); //modified by JB here
					}
				}else{
					PPS_NO = JOptionPane.showInputDialog("C. Invalid! Please re-enter PPS number (return to exit)");
					PPS_NO = PPS_NO.toUpperCase(); //modified by JB here
				}
			}			
		}
		
		JOptionPane.showMessageDialog(null, "The list of valid PSS numbers entered are:" + listValidPSS_NO, 
											"Valid List", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}
	
	public static boolean PPS_NOLetterChecker(String PPS_NO)
	{
		boolean result = false;
		int i;
		
		if(PPS_NO.length() == 9)
		{
			for(i = PPS_NO.length() -2; i < PPS_NO.length(); i++)
			//for(int i=0; i < PPS_NO.length() -2; i++)
			{
				if(PPS_NO.charAt(i) >= 'A' && PPS_NO.charAt(i) <= 'Z')
					//result = true;
				{
					//do nothing, just continue to next loop iteration
				}
				else
					break;
			}		
		}
		else
		{
			for(i = PPS_NO.length() -1; i < PPS_NO.length(); i++)
			{
				if(PPS_NO.charAt(i) >= 'A' && PPS_NO.charAt(i) <= 'Z')
					//result = true;
				{
					//do nothing, just continue to next loop iteration
				}
				else
					break;
			}	
		}
		if(i==PPS_NO.length())
			result = true;
				
		return result;
	}
	
	public static boolean PSS_NODigitChecker(String PPS_NO)
	{
		boolean result = false;
		int i;
		
		if(PPS_NO.length() == 9)
		{
			for(i = 0; i < PPS_NO.length() -2; i++)
			{
				if(PPS_NO.charAt(i) >= '0' && PPS_NO.charAt(i) <= '9')
					//result = true;
				{
					
				}
				else
					break;
			}		
		}
		else
		{
			for(i = 0; i < PPS_NO.length() -1; i++)
			{
				if(PPS_NO.charAt(i) >= '0' && PPS_NO.charAt(i) <= '9')
					//result = true;
				{
					
				}
				else
					break;
			}	
		}
		
		if(i==7)
			result=true;
		
		return result;
	}
}