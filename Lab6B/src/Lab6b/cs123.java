import java.util.Scanner;

public class cs123 {

	public static void main(String[] args) {
		// method call Print_intructions
		Print_instrcutions();		
		// Variable Declaration
		double radius, area,  circumference;
	    // Prompts user to enter radius
		System.out.print("Enter the value of radius: ");
		// Reads keyboard		
		Scanner pam = new Scanner(System.in);
		
		radius = pam.nextDouble();
		// Method to call circle area
		area =  Cal_area(Math.PI, radius);
		// Method to call circle circumference
		circumference = Cal_circumference(Math.PI, radius);
        // Print results
		System.out.print("\nThe area of the circle is: " +area);
		System.out.print("\nThe circumference of the circle is: " +circumference);
		
		}
	//  Static method print short description
	public static void Print_instrcutions()
	{
		System.out.println("This program will caculate the area and circumference of a circle");
		System.out.println("You can insert the value of the radius to check area and circumference\n");
		
	}
	// Static method (Cal_area) declaration and calculate area of the circle
	public static double Cal_area (double PI, double radius)
	{
	return Math.PI*(Math.pow(radius, 2));
	}
	// Static method (Cal_circumference declaration and calculate circumference
	public static double Cal_circumference (double PI, double radius)
	{
	return 2*Math.PI*radius;
	}
	
	

}
