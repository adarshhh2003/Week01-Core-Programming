import java.util.*;
public class DistanceConverter {
	public static void main(String[] args) {
		// Create scanner object to take user input from standard input
		Scanner input = new Scanner (System.in);
		
		// Taking km input with the help of scanner class
		double km = input.nextDouble();
		
		// Converting km to miles
		double miles = km / 1.6;
		
		// Displaying the result
		System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
	}
}