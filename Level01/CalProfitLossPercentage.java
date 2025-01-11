public class CalProfitLossPercentage {
	public static void main(String[] args) {
		// Declare the cost price and selling price
		int costPrice = 129;
		int sellingPrice = 191;
		
		// Calculating the profit
		int profit = sellingPrice - costPrice;
		
		// Calculating the Profit Percentage
		double profitPercentage = (double)profit / costPrice * 100;
		
		// Displaying the result
		System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
	}
}