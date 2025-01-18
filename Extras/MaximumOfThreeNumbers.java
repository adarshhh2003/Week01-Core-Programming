import java.util.Scanner;

public class MaximumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = getInput(scanner, "Enter the first number: ");
        int num2 = getInput(scanner, "Enter the second number: ");
        int num3 = getInput(scanner, "Enter the third number: ");

        int max = findMaximum(num1, num2, num3);

        System.out.println("The maximum of the three numbers is: " + max);

        scanner.close();
    }

    private static int getInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    private static int findMaximum(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
