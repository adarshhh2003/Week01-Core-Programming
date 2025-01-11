public class ComputeVolume {
	public static void main(String[] args) {
		// Declare the radius
		double radius = 6378;
		
		// Kilometers to miles convert factor
		double kmToMilesFactor = 0.239913;
		
		// Calculating the volume of earth in kilometers
		double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
		
		// Converting volume of earth from cubic kilometers to cubic miles
		double volumeMiles3 = volumeKm3 * kmToMilesFactor;
		
		// Displaying the result
		System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);
	}
}