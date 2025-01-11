import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get two numbers and an operator
        System.out.print("Enter the first number: ");
        double first = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double second = scanner.nextDouble();
        System.out.print("Enter the operator (+, -, *, /): ");
        String op = scanner.next();

        // Initialize a variable to store the result
        double result;

        // Switch statement to perform the calculation based on operator
        switch (op) {
            case "+":
                result = first + second;
                System.out.println("Result: " + result);
                break;
            case "-":
                result = first - second;
                System.out.println("Result: " + result);
                break;
            case "*":
                result = first * second;
                System.out.println("Result: " + result);
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid Operator.");
                break;
        }

        scanner.close();
    }
}
