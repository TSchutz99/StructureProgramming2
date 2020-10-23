package MyCA_Copies.FirstCA;
// Java Program FaunSchutz_t00213674_Corrections
/* by: Faun Schutz
 * start: 17/02/2020
 * finish: 17/02/2020
 *
 * This is a program that takes in two player names and then using a user deffined method will generate 
 * each player a card, then this information is outputted with in a TextArea in a Dialog box with the winner 
 * being the person with the highter card type, this runs throw three times.
 */
 
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;

public class FaunSchutz_t00213674_Corrections{
	public static void main(String args[])
	{
		String player1, player2, player1Card="", player2Card="";
		
		player1 = JOptionPane.showInputDialog("Please enter the name of player 1");
		player2 = JOptionPane.showInputDialog("Please enter the name of player 2");
	
		JTextArea textArea = new JTextArea(5, 5);
		
		Font textAreaFont = new Font("monospaced", Font.PLAIN, 12);
		textArea.setFont(textAreaFont);
		
		for(int i = 0; i < 3; i++)
		{
			player1Card = dealCard();
			player2Card = dealCard();
			
			textArea.setText(String.format("%-15s%-10s\n\n", "Player Name", "Card Delt"));
			
			textArea.append(String.format("%-15s%-10s\n%-15s%-10s", player1, player1Card, player2, 
											player2Card));
											
			JOptionPane.showMessageDialog(null, textArea, "Game Info", JOptionPane.INFORMATION_MESSAGE);	
		}
		
		System.exit(0);
	}
	
	public static String dealCard()
	{
		String rankFace="", suitString="", card="";
		int rank, suit;
		
		rank = (int)(Math.random()*13)+2;
		//System.out.print("\n"+rank);     // For test purposes.
		
		if(rank == 11)
			rankFace = "Jack";
		else if(rank == 12)
			rankFace = "Queen";
		else if(rank == 13)
			rankFace = "king";
		else if(rank == 14)
			rankFace = "Ace";
		else
			rankFace = Integer.toString(rank);
			
		//System.out.print("\n"+rankFace);     // For test purposes.
		
		suit = (int)(Math.random()*4)+1;
		//System.out.print("\n"+suit);     // For test purposes.
		
		if(suit == 1)
			suitString = "Hearts";
		else if(suit == 2)
			suitString = "Diamonds";
		else if(suit == 3)
			suitString = "Clubs";
		else
			suitString = "Spades";
		//System.out.print("\n"+suitString);     // For test purposes.
		
		card = (rankFace + " of " + suitString);
		
		return card;
	}
}