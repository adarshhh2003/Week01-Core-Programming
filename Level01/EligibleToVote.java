import java.util.*;
public class EligibleToVote {
	public static void main (String [] args) {
		// Create a scanner object to read input from the user
		Scanner input = new Scanner (System.in);
		
		// Declare a array of size ten
		int []age = new int[10];
		
		// Used for loop to get input for every index
		for(int i=0; i<age.length; i++) {
			age[i] = input.nextInt();
		}
		
		// Display the output with the help of for loop and if statements and else clause
		for(int i=0; i<age.length; i++) {
			if(age[i] < 0) {
				System.out.println("It is an invalid age");
			}
			else if(age[i]<18) {
				System.out.println("The age of the student is " + age[i] + " and can not vote");
			}
			else {
				System.out.println("The age of the student is " + age[i] + " and can vote");
			}
		}
		
		// Close the scanner object
		input.close();
	}
}