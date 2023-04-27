
import java.util.Scanner;
import java.util.Random;

public class Kundinnennumfrage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter the number of test persons: ");
        int numTestPersons = scanner.nextInt();

        int[] ratings = new int[numTestPersons];

        for (int i = 0; i < numTestPersons; i++) {
            ratings[i] = random.nextInt(3) + 1;
        }

        int notRecommended = 0;
        int acceptable = 0;
        int excellent = 0;

        for (int rating : ratings) {
            if (rating == 1) {
                notRecommended++;
            } else if (rating == 2) {
                acceptable++;
            } else if (rating == 3) {
                excellent++;
            }
        }

        double notRecommendedPercentage = (double) notRecommended / numTestPersons * 100;
        double acceptablePercentage = (double) acceptable / numTestPersons * 100;
        double excellentPercentage = (double) excellent / numTestPersons * 100;

        System.out.println("Survey Results: ");
        System.out.println("1 - Not recommended: " + notRecommended + " (" + (notRecommendedPercentage) + "%)");
        System.out.println("2 - Acceptable: " + acceptable + " (" + (acceptablePercentage) + "%)");
        System.out.println("3 - Excellent: " + excellent + " (" + (excellentPercentage) + "%)");

        double averageRating = (double) (notRecommended + 2 * acceptable + 3 * excellent) / numTestPersons;
        System.out.println("Overall rating for the new product: " + averageRating);
    }
}
