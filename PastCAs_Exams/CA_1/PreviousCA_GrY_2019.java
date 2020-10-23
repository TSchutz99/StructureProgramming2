package PastCAs_Exams.CA_1;
// Java Program PreviousCA_GrY_2019
/* By: Faun Schutz
 * start: 13/02/2020
 * finish: 13/02/2020
 *
 * This program is a game between you and the computer what happens is a random number is generated and 
 * then you the user is asked to guess it then the computer generates another random number which is its guess
 * the program performs a check to see which guess was closer and then which everone was, is the winner 
 * of that round. 
 */
 
import javax.swing.JOptionPane;

public class PreviousCA_GrY_2019{
	public static void main(String args[])
	{
		for(int i = 0; i < 5; i++)
		{
			String guessAsString, winner;
			int randomNumber, guess;
				
			randomNumber = (int)(Math.random()*100) + 1;
			System.out.print("\n"+randomNumber);
			
			guessAsString = JOptionPane.showInputDialog("User, please enter your guess of a value between 1 and 100");
			guess = Integer.parseInt(guessAsString);
			
			if(isValidGuess(guessAsString).equals(true)){
				winner = whoIsCloser(guess, randomNumber); 
					
				JOptionPane.showMessageDialog(null, winner, "Game Result", 
											  	JOptionPane.INFORMATION_MESSAGE);			
			}							
			else{
				JOptionPane.showMessageDialog(null, "Invalid guess value entered - this game is void", 
											  "Void Game", JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}
		}
	}
	
	public static Boolean isValidGuess(String guess)
	{
		boolean result = false;
		
		for(int i = 0; i < guess.length(); i++)
		{
			if(guess.charAt(i) >= 1 && guess.charAt(i) <= 100)
				result = true;
			else{
				result = false;
				break;
			}
		}
		
		return result;
	}
	
	public static String whoIsCloser(int guess, int randomNumber)
	{
		String result;
		int userGDiff=101, compGDiff=101, compGuess = (int)(Math.random()*100) + 1;
		
		userGDiff = guess - randomNumber;
		if(userGDiff < 0)
			userGDiff = userGDiff * (-1);
		System.out.print("\n"+userGDiff);
		
		compGDiff = compGuess - randomNumber;
		if(compGDiff < 0)
			compGDiff = compGDiff * (-1);
		System.out.print("\n"+compGDiff);	
				
		if(userGDiff < compGDiff)
			result = "The generated number was " + randomNumber + ", the computer number was " + compGuess + 
					 " and the winner was the User"; 
		else
			result = "The generated number was " + randomNumber + ", the computer number was " + compGuess + 
					 " and the winner was the Computer"; 
						
		return result;
	}
}