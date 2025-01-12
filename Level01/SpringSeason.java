import java.util.Scanner;

public class SpringSeason {

    public boolean isSpringSeason(int month, int day) {
        // Check for March
        if (month == 3 && day >= 20 && day <= 31) {
            return true;
        }
        // Check for April
        if (month == 4 && day >= 1 && day <= 30) {
            return true;
        }
        // Check for May
        if (month == 5 && day >= 1 && day <= 31) {
            return true;
        }
        // Check for June
        if (month == 6 && day >= 1 && day <= 20) {
            return true;
        }
        // If none of the conditions are met, it's not spring season
        return false;
    }

    public void checkSpringSeason(int month, int day) {
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for month and day
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter day (1-31): ");
        int day = scanner.nextInt();

        // Create an instance of SpringSeason
        SpringSeason springSeason = new SpringSeason();

        // Check and print the result
        springSeason.checkSpringSeason(month, day);

        scanner.close();
    }
}
