import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Enter number1
        System.out.println("Please enter number1: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Not a valid number!");
            return;
        }
        // Number1 is read
        double num1 = sc.nextDouble();
        // Enter number2

        //check if input is number:
        //if (isDouble(num2))
        System.out.println("Please enter number2: ");
        // Number2 is read
        if (!sc.hasNextDouble()) {
            System.out.println("Not a valid number!");
        }
        double num2 = sc.nextDouble();
        // Addition
        double sum = num1 + num2;
        //Sub
        double sub = num1 - num2;
        // multiple
        double mult = num1 * num2;
        // div
        double div = num1 / num2;

        System.out.println("Total: " + sum);
        System.out.println("Sifference: " + sub);
        System.out.println("Product: " + mult);
        System.out.println("Quotient: " + div);
    }

}