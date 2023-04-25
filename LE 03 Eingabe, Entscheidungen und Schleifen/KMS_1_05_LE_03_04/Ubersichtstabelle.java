import java.util.Scanner;
public class Ubersichtstabelle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter starting price:");
        double startPrice = scanner.nextDouble();

        System.out.println("Enter ending price:");
        double endPrice = scanner.nextDouble();

        double increment = (endPrice - startPrice) / 10;

        System.out.print("\t");
        for (int i = 0; i <= 10; i++) {
            double price = startPrice + (increment * i);
            System.out.printf("%.2f\t", price);
        }

        System.out.println();
        for (int i = 1; i <= 10; i++) {
            int amount = 10 * i;
            System.out.printf("%d\t", amount);

            for (int j = 0; j <= 10; j++) {
                double price = startPrice + (increment * j);
                double total = price * amount;
                System.out.printf("%.2f\t", total);
            }
            System.out.println();
        }
    }
}
/*
public class Ubersichtstabelle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the starting price:");
        double startingPrice = scanner.nextDouble();

        System.out.println("Enter the number of pieces:");
        int numberOfPieces = scanner.nextInt();

        System.out.print("\t");
        for (int i = 0; i < 10; i++) {
            double price = startingPrice + (1.50 * i);
            System.out.printf(price + "\t");
        }

        System.out.println();
        for (int i = 0; i < 10; i++) {
            int amount = numberOfPieces + (10 * i);
            System.out.printf(amount + "\t");

            for (int j = 0; j < 10; j++) {
                double price = startingPrice + (1.50 * j);
                double total = price * amount;
                System.out.printf(total + "\t");
            }
            System.out.println();
        }
    }
}
*/
/*
public class Ubersichtstabelle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter starting price");
        double startPrice = input.nextDouble();
        System.out.print("Enter ending price");
        double endPrice = input.nextDouble();

        double increment = (endPrice - startPrice) / 10;

        System.out.println("Price list:");
        for (double price = startPrice; price <= endPrice + increment/2;price += increment){
            System.out.printf("Price per piece: %.2f€%n",price);
            for (int numItems = 10;numItems <= 100; numItems += 10){
                double totalPrice = price * numItems;
                System.out.printf("%3d pieces: %.2f€%n", numItems, totalPrice);
            }
            System.out.println();
        }
    }
}

 */




