package MyCA_Copies.FirstCA;
// Java Program FaunSchutz_t00213674
/* by: Faun Schutz
 * start: 17/02/2020
 * finish: 17/02/2020
 *
 * This is a program that takes in two player names and then using a user deffined method will generate 
 * each player a card, then this information is outputted with in a TextArea in a Dialog box with the winner 
 * being the person with the highter card type, this runs throw three times.
 */
 
import javax.swing.JOptionPane;
import java.util.Random;
import java.awt.TextArea;

public class FaunSchutz_t00213674{
	public static void main(String args[])
	{
		String player1, player2, player1Card, player2Card;
		
		player1 = JOptionPane.showInputDialog("Please enter the name of player 1");
		player2 = JOptionPane.showInputDialog("Please enter the name of player 2");
		
		JTextArea text = new JTextArea(300, 150);
		Font(monospaced, Plain, point);
		
		for(int i = 0; i < 3; i++)
		{
			player1Card = dealCard();
			player2Card = dealCard();
			
			
			JOptionPane.showMessageDialog(null,"PLace Holder" ,"Game Info", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public static String dealCard()
	{
		String rankFace, suitString, card;
		int rank, suit;
		
		rank = (int)(random()*13)+2;
		System.out.print(rank);     // For test purposes.
		
		if(rank == 11)
			rankFace.equals("Jack");
		else if(rank == 12)
			rankFace.equals("Queen");
		else if(rank == 13)
			rankFace.equals("king");
		else if(rank == 14)
			rankFace.equals("Ace");
		else
			rankFace.equals(rank);
		System.out.print(rankFace);     // For test purposes.
		
		suit = (int)(random()*4)+1;
		System.out.print(suit);     // For test purposes.
		
		if(suit == 1)
			suitString.equals("Hearts");
		else if(suit == 2)
			suitString.equals("Diamonds");
		else if(suit == 3)
			suitString.equals("Clubs");
		else
			suitString.equals("Spades");
		System.out.print(suitString);     // For test purposes.
		
		card = (rankFace + " of " + suitString);
		
		return card;
	}
}