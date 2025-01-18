import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Think of a number between 1 and 100, and I will try to guess it!");

        int low = 1;
        int high = 100;
        boolean correctGuess = false;

        while (!correctGuess) {
            int guess = generateGuess(low, high, random);
            System.out.println("Is your number " + guess + "?");
            System.out.print("Enter 'low' if your number is lower, 'high' if it's higher, or 'correct' if I guessed right: ");
            String feedback = scanner.nextLine().toLowerCase();

            switch (feedback) {
                case "low":
                    high = guess - 1;
                    break;
                case "high":
                    low = guess + 1;
                    break;
                case "correct":
                    System.out.println("I guessed your number! It was " + guess + ".");
                    correctGuess = true;
                    break;
                default:
                    System.out.println("Invalid input. Please enter 'low', 'high', or 'correct'.");
            }

            if (low > high) {
                System.out.println("It seems there was a mistake. Let's try again.");
                break;
            }
        }

        scanner.close();
    }

    private static int generateGuess(int low, int high, Random random) {
        return random.nextInt(high - low + 1) + low;
    }
}
