public class DistributePens {
	public static void main(String[] args) {
		// Declare the pens and students
		int pens = 14;
		int students = 3;
		
		// Calculating the quantity of pens
		int quantityOfPens = pens / students;
		
		// Calculating the remaining pens
		int remainingPens = pens % students;
		
		// Displaying the result
		System.out.println("The Pen per student is " + quantityOfPens + " and the remaining pen not distributed is " + remainingPens);
	}
}