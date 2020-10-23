package PastCAs_Exams.Final_Exam;
//SummerExam.java
/*This program uses 2 arrays along with a GUI interface to generate a set of 7 lotto numbers
 *between 1 and 42 and then some stats based on numbers generated. It also lets the user enter
 *a line of numbers so they can check to see how many of their numbers got matched in the draw*/

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Arrays;

public class SummerExam{
	
	int[] lottoNumbers = new int[6];
	int bonusBall;
	boolean[] alreadyPicked = new boolean[43];
	JButton drawButton;
	JTextField lineField;
	                 	             
	public SummerExam()
		{	                   
			 JFrame jFrameWindow = new JFrame("Lotto");			 			 			 
			 FlowLayout flowLayout = new FlowLayout();			 
		     jFrameWindow.setLayout(flowLayout);     		     	     		 
			 jFrameWindow.setSize(235,100);	 
			 jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	 			 
 			 drawButton = new JButton("Draw Numbers");
 			 jFrameWindow.add(drawButton);	 	 
			 JLabel linePrompt = new JLabel("Check Numbers");
			 jFrameWindow.add(linePrompt);
			 lineField = new JTextField(10);
			 jFrameWindow.add(lineField);
			 
			 ButtonEventHandler buttonHandler = new ButtonEventHandler();
			 drawButton.addActionListener(buttonHandler);
			 lineField.addActionListener(buttonHandler);		 		 	 			 	 	 
			 jFrameWindow.setVisible(true);
		}	
	
	public static void main(String args[])
		{	 		
			 SummerExam guiApp = new SummerExam();
		}	 	 			 
	
    private class ButtonEventHandler implements ActionListener{
		public void actionPerformed(ActionEvent e)
			{
				if(e.getSource()==drawButton)
					{
						int evens=0,highs=0,consecutives=0,lottoNumber;
												
						for(int i = 0; i < lottoNumbers.length; i++)
							{
								lottoNumber = (int)(Math.random()*42)+1;
								
								while(alreadyPicked[lottoNumber])
									lottoNumber = (int)(Math.random()*42)+1;
		
								lottoNumbers[i] = lottoNumber;
		
								alreadyPicked[lottoNumber] = true;					
							}
						
							
						bonusBall = (int)(Math.random()*42)+1;
						
						while(alreadyPicked[bonusBall])
								bonusBall = (int)(Math.random()*42)+1;
											
						alreadyPicked = new boolean[43]; //reset this array to all false values for subsequent draws
						Arrays.sort(lottoNumbers);
						
						for(int i = 0; i < lottoNumbers.length; i++)
							{
								if(lottoNumbers[i]%2==0)
									evens++;
									
								if(lottoNumbers[i]>=22)
									highs++;
									
								if(i<5 && lottoNumbers[i+1]-lottoNumbers[i] == 1)
									consecutives++;
							}
						
						JOptionPane.showMessageDialog(null,"Lotto Numbers Drawn are: " + Arrays.toString(lottoNumbers) + "   Bonus Ball: " + bonusBall +
						                                   "\n\n\n#Even lotto numbers: " + evens + "\n#Odd lotto numbers: " + (6-evens) + 
						                                   "\nPercentage of high lotto numbers: " + String.format("%.2f",highs/6f*100) + 
						                                   "\nPercentage of low lotto numbers: " + String.format("%.2f",100-(highs/6f*100)) +
						                                   "\n#Pairs of consecutive lotto numbers: " + consecutives,
								                           "Lotto Stats",JOptionPane.INFORMATION_MESSAGE);					
					}									
				else 
					{
						 String userLine, userNumAsString;
						 int userNum, lottoNumMatches=0;
						 String bonusBallMatch="No";						 
						 
						 userLine = lineField.getText();
						 
						 for(int i=0;i<17;i+=3)
						 {
						 	userNumAsString = userLine.substring(i,i+2);						 	
						 	userNum = Integer.parseInt(userNumAsString);
						 	
							if(linearSearch(lottoNumbers,userNum))
							    lottoNumMatches++; 		
						     
						    if(userNum == bonusBall)
						     	bonusBallMatch="Yes";
						 }						 
	 		             JOptionPane.showMessageDialog(null,"Lotto Numbers Matched: " + lottoNumMatches + 
	 		             	        "   Bonus Ball Match: " + bonusBallMatch,"Match Data",JOptionPane.INFORMATION_MESSAGE);					     
					}		
		  }				
	}
      			
	private static boolean linearSearch(int lottoNums[],int searchNum)
			{    	
		      	for (int i=0;i<lottoNums.length;i++)
		      		if(searchNum==lottoNums[i])
		      			return true;
		      			
		      	return false;
			}			
}






