package LabSheet6;
/* Java Program Exercise3
 * By: Faun Schutz
 * start: 10/02/2020
 * finish: 10/02/2020
 *
 */
 
import java.util.Scanner;

public class Exercise3{
	public static void main(String args[])
	{
		float areaCyl, areaSemCir, areaTri;
		int choice;
		String hit;
		
		Scanner input = new Scanner(System.in);
		 
		do{
			System.out.print("\n\n\t1. Find the area of a cylinder" +
						 "\n\t2. Find the area of a semi-circle" +
						 "\n\t3. Find the area of a triangle" +
						 "\n\t4. Quit");
			choice = getChoice();
			
			switch(choice){
				case 1:
					areaCyl = getAreaCyl();
					System.out.print("\nArea of cylinder is " + String.format("%.2f", areaCyl)  + " m2");
					
					System.out.print("\n\nPlease hit return to continue ......");
					hit = input.nextLine(); 
					if(hit.equals(""))
						break;
				
				case 2:
					areaSemCir = getAreaSemCir();
					System.out.print("\nArea of semi-circle is " + String.format("%.2f", areaSemCir) + " m2");
					
					System.out.print("\n\nPlease hit return to continue ......");
					hit = input.nextLine(); 
					if(hit.equals(""))
						break;
				
				case 3:
					areaTri = getAreaTri();
					System.out.print("\nArea of triangle is " + String.format("%.2f", areaTri) + " m3");
					
					System.out.print("\n\nPlease hit return to continue ......");
					hit = input.nextLine(); 
					if(hit.equals(""))
						break;
					
				default:
					if(choice == 4)
						break;
					else
						System.out.println("\nInvalid choice -- please choose again");
			}
		}while(choice != 4);
		System.out.println("\nThanks for using the system - goodbye!");
		System.exit(0);
	}
	
	public static int getChoice()
	{
		int choice;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("\n\n\n\n\nEnter your choice: ");
		choice = input.nextInt();
		
		return choice;
	}
	
	public static float getAreaCyl()
	{
		float radius, height, AreaCyl;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nPlease enter the radius of the cylinder: ");
		radius = input.nextFloat();
		
		System.out.print("\nPlease enter the height of the cylinder: ");
		height = input.nextFloat();
		
		AreaCyl = (float)Math.PI * (float)Math.pow(radius, 2) * height;
		
		return AreaCyl;
	}
	
	public static float getAreaSemCir()
	{
		float radius, AreaSemCir;
			
		Scanner input = new Scanner(System.in);
			
		System.out.print("\nPlease enter the radius of the semi-circle: ");
		radius = input.nextFloat();
		
		AreaSemCir = ((float)Math.PI * (float)Math.pow(radius, 2)) / 2;
			
		return AreaSemCir;
	}
	
	public static float getAreaTri()
	{
		float baseLength, height, AreaTri; 
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nPlease enter base length of the triangle: ");
		baseLength = input.nextFloat();
		
		System.out.print("\nPlease enter height of the triangle: ");
		height = input.nextFloat();
		
		AreaTri = (baseLength * height) / 2;
			
		return AreaTri;
	}
}