import java.util.*;
public class SimpleInterestCalculator {
	// Create a method to calculate simple interest
	public double calculateSimpleInterest(int principal, int rate, int time) {
		double result = (principal * rate * time) / 100;
		return result; // return the result
	}
	public static void main (String []args) {
		// Create a object of scanner class
		Scanner input = new Scanner(System.in);
		
		// Declare variables a get input from the user
		System.out.println("Enter the principal amount");
		int principal = input.nextInt();
		System.out.println("Enter the rate of interest");
		int rate = input.nextInt();
		System.out.println("Enter the time (in years)");
		int time = input.nextInt();
		
		// Create object of the class to call the method
		SimpleInterestCalculator obj = new SimpleInterestCalculator();
		
		// Call the method by using object and store result
		double result = obj.calculateSimpleInterest(principal, rate, time);
		
		// Display the result
		System.out.println("The Simple Interest is " + result + " for Principal " + principal + ", Rate of Interest " + rate + ", and Time " + time);
		
		// Close the object
		input.close();
	}
}