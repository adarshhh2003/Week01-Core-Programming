public class KilometersToMiles {
	public static void main(String[] args) {
		// Declare the kilometers
		double kilometers = 10.8;
		
		// Declare the conversion factor
		double conversionFactor = 1.6;
		
		// Converting distance in miles
		double miles = kilometers * conversionFactor;
		
		// Displaying the result
		System.out.println("The distance " + kilometers + " km in miles is " + miles);
	}
}