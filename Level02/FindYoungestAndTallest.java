import java.util.Scanner;

public class FindYoungestAndTallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        System.out.println("Enter the age and height for Amar, Akbar, and Anthony:");

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();

            System.out.print("Enter the height (in cm) of " + names[i] + ": ");
            heights[i] = scanner.nextDouble();
        }

        // Find the youngest friend
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        // Find the tallest friend
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Output results
        System.out.println("\nResults:");
        System.out.println("The youngest friend is " + names[youngestIndex] + " with an age of " + ages[youngestIndex] + " years.");
        System.out.println("The tallest friend is " + names[tallestIndex] + " with a height of " + heights[tallestIndex] + " cm.");

        scanner.close();
    }
}
