package PastCAs_Exams.Final_Exam;
//Q1.java
/*This program processes 2 parallel arrays via a GUI interface to generate some stats based on
 *temperature data or to sort the temperature data into descending order*/

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Q1{

	JButton statsButton, sortButton;
	double[] temperatures = {7.3,7.2,8.1,9.3,11.5,13.6,15.3,15.4,13.9,11.5,9.3,7.8};
	String[] months = {"January","February","March","April","May","June","July","August",
	                   "September","October","November","December"};
	                 	             
	public Q1()
		{	                   
			 JFrame jFrameWindow = new JFrame("Valentia Temperatures");			 			 			 
			 FlowLayout flowLayout = new FlowLayout();			 
		     jFrameWindow.setLayout(flowLayout);     		     	     		 
			 jFrameWindow.setSize(300,100);	 
			 jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	 			 
 			 statsButton = new JButton("Generate Stats");
 			 jFrameWindow.add(statsButton);	 	 
			 sortButton = new JButton("Sort Data");
			 jFrameWindow.add(sortButton);

			 ButtonEventHandler buttonHandler = new ButtonEventHandler();
			 statsButton.addActionListener(buttonHandler);
			 sortButton.addActionListener(buttonHandler);		 		 	 			 	 	 
			 jFrameWindow.setVisible(true);
		}	
	
	public static void main(String args[])
		{	 		
			 Q1 guiApp = new Q1();
		}	 	 			 
	
    private class ButtonEventHandler implements ActionListener{
		public void actionPerformed(ActionEvent e)
			{
				if(e.getSource()==statsButton)
					{
						double total=0,highestMMT=Double.MIN_VALUE, averageMMT;
						String monthsExceedingAverageMMT="",highestMMTMonth="";
						
						for(int i = 0; i < temperatures.length; i++)
							{
								total+=temperatures[i];
								
								if(temperatures[i]>highestMMT)
								{
									highestMMT = temperatures[i];
									highestMMTMonth	= months[i];
								}				
							}
						
						averageMMT = total/12;
						
						for(int i = 0; i < temperatures.length; i++)
							{
								if(temperatures[i]>averageMMT)
									monthsExceedingAverageMMT += months[i] + "   ";
							}
						
						JOptionPane.showMessageDialog(null,"Average MMT: " + String.format("%.2fC",averageMMT) +
						                                   "\nHighest MMT: " + highestMMT + "C  Month: " + highestMMTMonth +
						                                   "\nList of months with above average MMT: " + monthsExceedingAverageMMT,
								                           "Temperature Stats",JOptionPane.INFORMATION_MESSAGE);
						
					}						
			
				else //the source of the event was the "Sort Data" button
					{
						 selectionSort(temperatures,months);
							 
					     JTextArea textArea = new JTextArea();	 
 			             Font font = new Font("monospaced",Font.PLAIN,12);
 			             String text="";
 			             text += String.format("%-8s%s\n\n","MMT","Month");
 			 
 			             textArea.setFont(font);		             
 			 
 			             for (int i = temperatures.length-1; i >= 0; i--)
			 			 	text += String.format("%-8.1f%s\n",temperatures[i],months[i]);
	 			 
	 		             textArea.append(text);
	 		
	 		             JOptionPane.showMessageDialog(null,textArea,"Sorted Temperatures",JOptionPane.INFORMATION_MESSAGE);					     
					}		
		  }				
	}
      			
	private static void selectionSort(double temps[],String mnths[])
			{
		      	double smallest, temp;
		      	int sub;
		      	String tempMonth;
		      	
		      	for (int i = 0; i < temps.length-1; i++)
		      		{
	      				smallest = temps[i];
			  			sub = i;
			  			
			  			for (int j = i+1; j < temps.length; j++)
			       			if (temps[j] < smallest)
			       				{
				   					smallest = temps[j];
				   					sub = j;
			       				}
			  				
		        		temp = temps[i];
				  		temps[i] = temps[sub];
			  			temps[sub] = temp;
			  			
			  			tempMonth = mnths[i];
			  			mnths[i] = mnths[sub];
			  			mnths[sub] = tempMonth;			  			
	      			}   		
			}			
}






