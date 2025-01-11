import java.util.*;
public class CalculateDiscount {
	public static void main(String[] args) {
		// Create scanner object to take user input from standard input
		Scanner input = new Scanner (System.in);
		
		// Taking input
		int fee = input.nextInt();
		
		// Taking input 
		int discountPercent = input.nextInt();
		
		// calculating discount
		int discount = fee * discountPercent / 100;
		
		// Calculating discounted fee
		int discountedFee = fee - discount;
		
		// Displaying the result
		System.out.println("The discount amount is INR " + discount + " and final discounted fee is " + discountedFee);
	}
}

