import java.util.Scanner;

public class OneHundredBottlesOfBeer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int verses;

        // Validate input
        do {
            System.out.print("Enter the number of verses to print (1-100): ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter a number between 1 and 100: ");
                scanner.next();
            }
            verses = scanner.nextInt();
        } while (verses < 1 || verses > 100);

        // Print the verses
        for (int i = 100; i > 100 - verses; i--) {
            System.out.println(i + " bottle" + (i == 1 ? "" : "s") + " of beer on the wall");
            System.out.println(i + " bottle" + (i == 1 ? "" : "s") + " of beer");
            System.out.println("If one of those bottles should happen to fall");
            System.out.println((i - 1) + " bottle" + (i - 1 == 1 ? "" : "s") + " of beer on the wall");
            System.out.println();
        }

        scanner.close();
    }
}
