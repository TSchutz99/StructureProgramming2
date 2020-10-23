package LabSheet1;
/* Java Program ReadingIntoVariables
 * by: Faun Schutz
 * Start: 20/01/2020
 * Finish: 20/01/2020
 *
 */

import java.util.Scanner; 
public class ReadingIntoVariables{
	public static void main(String args[])
	{
		String title, author;
		int pages, yearPublished;
		float price;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the title of the book: ");
		title = input.nextLine();
		
		System.out.print("Please enter the author of the book: ");
		author = input.nextLine();
		
		System.out.print("Please enter the nmber of pages in the book: ");
		pages = input.nextInt();
		
		System.out.print("Please enter the year the book was published: ");
		yearPublished = input.nextInt();
		
		System.out.print("Please enter the price of the book: ");
		price = input.nextFloat();
		
		System.out.println("\n\n======Book Details======\nTitle: " + title + "\nAuthor: " + author + 
						   "\nNumber of pages: " + pages + "\nYear Published: " + yearPublished + 
						   "\nPrice: EUR" + price);
	}
}