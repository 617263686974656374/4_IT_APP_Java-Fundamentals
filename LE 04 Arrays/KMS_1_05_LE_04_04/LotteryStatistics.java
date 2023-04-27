import java.util.Random;
import java.util.Scanner;

public class LotteryStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of draws: ");
        int numberOfDraws = scanner.nextInt();

        System.out.println("Enter your 5 numbers (1-45):");
        int[] userNumbers = new int[5];
        for (int i = 0; i < 5; i++) {
            userNumbers[i] = scanner.nextInt();
        }

        int[] results = new int[5];
        Random random = new Random();

        for (int i = 0; i < numberOfDraws; i++) {
            int[] draw = new int[6];
            int additionalNumber;

            for (int j = 0; j < 5; j++) {
                int randomNumber;
                boolean unique;

                do {
                    unique = true;
                    randomNumber = random.nextInt(45) + 1;

                    for (int k = 0; k < j; k++) {
                        if (draw[k] == randomNumber) {
                            unique = false;
                            break;
                        }
                    }
                } while (!unique);

                draw[j] = randomNumber;
            }

            boolean found;
            do {
                additionalNumber = random.nextInt(45) + 1;
                found = false;
                for (int number : draw) {
                    if (number == additionalNumber) {
                        found = true;
                        break;
                    }
                }
            } while (found);

            draw[5] = additionalNumber;

            int matchedNumbers = 0;
            boolean matchedAdditional = false;

            for (int userNumber : userNumbers) {
                found = false;
                for (int number : draw) {
                    if (number == userNumber) {
                        found = true;
                        break;
                    }
                }

                if (found) {
                    matchedNumbers++;
                }
            }

            found = false;
            for (int number : userNumbers) {
                if (number == additionalNumber) {
                    found = true;
                    break;
                }
            }

            if (found) {
                matchedAdditional = true;
            }

            if (matchedNumbers == 5) {
                results[0]++;
            } else if (matchedNumbers == 4 && matchedAdditional) {
                results[1]++;
            } else if (matchedNumbers == 4) {
                results[2]++;
            } else if (matchedNumbers == 3 && matchedAdditional) {
                results[3]++;
            } else if (matchedNumbers == 3) {
                results[4]++;
            }
        }

        System.out.println("Results after " + numberOfDraws + " lottery draws:");
        System.out.println("Jackpot (5): " + results[0] + " times");
        System.out.println("2nd win (4+1): " + results[1] + " times");
        System.out.println("3rd win (4): " + results[2] + " times");
        System.out.println("4th win (3+1): " + results[3] + " times");
        System.out.println("5th win (3): " + results[4] + " times");
    }
}
