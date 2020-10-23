package LabSheet1;
/* Java Program Exercise4
 * by: Faun Schutz
 * Start: 20/01/2020
 * Finish: 22/01/2020
 *
 * This program gets the user to supply the values for the tube radius, the cross-sectional radius 
 * and the mass of a torus and then uses a formulae to determine the moments of inertia.
 */
 
import java.util.Scanner; 
public class Exercise4{
	public static void main(String args[])
	{
		double radius, crossSecRadius, mass;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the tube radius of the torus: ");
		radius = input.nextDouble();
		
		System.out.print("Please enter the cross-sectional radius of the torus: ");
		crossSecRadius = input.nextDouble();
		
		System.out.print("Please enter the mass of the torus: ");
		mass = input.nextDouble();
		
		double diameter = 0.125 * ((4 * Math.pow(radius, 2)) + (5 * Math.pow(crossSecRadius, 2))) * mass;
		double verticalAxis = (Math.pow(radius, 2) + 0.75 * Math.pow(crossSecRadius, 2)) * mass;
		
		System.out.println("\n========Result========" + 
						   "\n\nMoment of inertia about a diameter is: " + String.format("%.3f", diameter) + "kg sq m" +
						   "\nMoment of inertia about a vertical axis is: " + String.format("%.3f", verticalAxis) + "kg sq m");
	}
}