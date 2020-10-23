package PastCAs_Exams.CA_2;
//AssessSoln.java
/*A program that reads in exactly 5 latitude values and validates each one according to a
 *set of criteria*/

import javax.swing.JOptionPane;

public class AssessSoln {
	public static void main(String args[]) 	
	{
		String latitude, allValidLatitudes="", allAtLeast55Degrees="";
		boolean valid;
		int degrees=0;
		
		for(int i=1;i<=5;i++)
			{
				latitude = JOptionPane.showInputDialog("Loop " + i + " - Please enter a latitude value");
				
				valid = false;
		
				while(!valid)
				    {
				    	if(latitude.length()==7) 
				    			if(Character.isDigit(latitude.charAt(0)) && Character.isDigit(latitude.charAt(1)))
					    			{
					    				degrees = Integer.parseInt(latitude.substring(0,2));
					    				
					    				if(degrees<=90)
						    					if(latitude.charAt(2) == '*')		    								
						    						if(latitude.charAt(3)>='0' && latitude.charAt(3)<='5')
							    						if(Character.isDigit(latitude.charAt(4)))
							    							if(degrees<=89 || degrees == 90 && latitude.charAt(3)=='0' && latitude.charAt(4)=='0')
								    							if(latitude.charAt(5)=='\'')	
								    								if(Character.toLowerCase(latitude.charAt(6))=='n' || Character.toLowerCase(latitude.charAt(6))=='s')
									    								valid = true;
									    							else
											    						latitude = JOptionPane.showInputDialog("Invalid! Last character must be N or S or n or s");
											    				else
											    					latitude = JOptionPane.showInputDialog("Invalid! Sixth character must be an apostrophe");
											    			else
											    				latitude = JOptionPane.showInputDialog("Invalid! If degrees part is 90, minutes part must be 00");
										    			else
										    				latitude = JOptionPane.showInputDialog("Invalid! Fifth character must be a digit");			
										    		else
										    			latitude = JOptionPane.showInputDialog("Invalid! Fourth character must be a digit between 0 and 5");					
										    	else
										    		latitude = JOptionPane.showInputDialog("Invalid! Third character must be an asterisk");	
						    		    else
							    			latitude = JOptionPane.showInputDialog("Invalid! Degrees part of latitude value must be a number in the range 0-90 inclusive");		
					    			}
				    			else
							    	latitude = JOptionPane.showInputDialog("Invalid! Latitude value must begin with two digits");
				    	else
				        	latitude = JOptionPane.showInputDialog("Invalid! Latitude value must have exactly 7 characters");	
				    }
				    
				allValidLatitudes += latitude + "      ";
								    						
				if(degrees>=55)
					allAtLeast55Degrees += latitude + "      ";						    								    							    							
			}    
				    
		JOptionPane.showMessageDialog(null,"The list of valid latitudes entered is: " + allValidLatitudes +
			                               "\n\nThe list of valid latitudes which are at least 55 degrees north or south: " + allAtLeast55Degrees, 
			   						  	   "Valid Latitudes",JOptionPane.INFORMATION_MESSAGE); 
			   						  	   	
	    System.exit(0);		
	}
}