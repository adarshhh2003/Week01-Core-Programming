import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
		
            // Compute sum using formula
            int formulaSum = n * (n + 1) / 2;

            // Compute sum using while loop
            int whileSum = 0;
            int i = 1; // Start from 1
            while (i <= n) {
                whileSum += i;
                i++;
            }

            // Compare and display the results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + whileSum);

            if (formulaSum == whileSum) {
                System.out.println("Both computations are correct and give the same result.");
            } else {
                System.out.println("There is a discrepancy between the two computations.");
            }
        

        scanner.close();
    }
}
