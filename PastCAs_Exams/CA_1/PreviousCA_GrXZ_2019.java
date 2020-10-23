package PastCAs_Exams.CA_1;
// Java Program PreviousCA_GrXZ_2019
/* By: Faun Schutz
 * start: 14/02/2020
 * finish: 19/02/2020
 *
 *  
 */
 
import javax.swing.JOptionPane;

public class PreviousCA_GrXZ_2019{
	public static void main(String args[])
	{
		for(int i = 0; i < 5; i++)
		{
			boolean validCountry;
			String country, analysis;
		
			country = JOptionPane.showInputDialog("Loop " + (i+1) + " - Please enter the name of a country (return to exit)");
			country.toLowerCase();
			
			validCountry = isValidCountry(country);
			
			if(validCountry == true){
				analysis = countryAnalysis(country);
				
				JOptionPane.showMessageDialog(null, analysis, "Country name Analysis", JOptionPane.INFORMATION_MESSAGE);
				
			}else
				JOptionPane.showMessageDialog(null, "The country name you entered was not valid", 
											  "Invalid Country Name!", JOptionPane.INFORMATION_MESSAGE);
		}
		System.exit(0);
	}
	
	public static boolean isValidCountry(String country)
	{
		boolean result = false;
		
		for(int i = 0; i < country.length(); i++)
		{
			if((country.charAt(i) >= 'a' && country.charAt(i) <= 'z') || country.charAt(i) == ' ')
				result = true;
			else{
				result = false;
				break;
			}
		}
		return result;
	}
	
	public static String countryAnalysis(String country)
	{
		String result="";
		int characters=0, words=1;
		String ia;
		
		for(int i = 0; i < country.length(); i++)
		{
			if(country.charAt(i) != ' ')
				characters++;
				
			if(country.charAt(i) == ' ')
				words++;	
		}
		
		if(country.substring(country.length()-2,country.length()).equals("ia"))
			ia = "This country name ends with 'ia'";
		else
			ia = "This country name does not ends with 'ia'";
			
		result = "-------------------------------" +
				 "\n\tCountry Name Analysis" +
				 "\n-------------------------------" +
				 "\n\nNumber of characters in country name: " + characters +
				 "\nNumber of words in country name: " + words + "\n" + ia;
				
		return result;
	}
}