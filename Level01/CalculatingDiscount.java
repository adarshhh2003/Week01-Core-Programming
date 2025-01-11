public class CalculatingDiscount {
	public static void main(String[] args) {
		// Declare the fee and discount percent
		int fee = 125000;
		int discountPercent = 10;
		
		// calculating discount
		int discount = fee * discountPercent / 100;
		
		// Calculating discounted fee
		int discountedFee = fee - discount;
		
		// Displaying the result
		System.out.println("The discount amount is INR " + discount + " and final discounted fee is " + discountedFee);
	}
}