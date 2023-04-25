
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This is a program for calculating the base area and volume of various packaging types.\n");
        System.out.println("Choose a base area type:\n" +
                "1) Rectangle\n" +
                "2) Equilateral triangle\n" +
                "3) Circle\n");
        if (!input.hasNextInt()) {
            System.out.println("Invalid selection!");
            return;
        }
        int choice = input.nextInt();
        System.out.println("Do you want to calculate (1) the base area or (2) the volume?");
        if (!input.hasNextInt()) {
            System.out.println("Invalid selection!");
            return;
        }
        int choice2 = input.nextInt();

        switch (choice) {
            case 1:
                calculateRectangle(input, choice2);
                break;
            case 2:
                calculateEquilateralTriangle(input, choice2);
                break;
            case 3:
                calculateCircle(input, choice2);
                break;
            default:
                System.out.println("Invalid selection!");
        }
    }

    private static void calculateRectangle(Scanner input, int choice2) {
        System.out.println("Enter length a: ");
        if (!input.hasNextDouble()) {
            System.out.println("Invalid number.");
            return;
        }
        double a = input.nextDouble();

        System.out.println("Enter length b: ");
        if (!input.hasNextDouble()) {
            System.out.println("Invalid number.");
            return;
        }
        double b = input.nextDouble();

        if (choice2 == 1) {
            double area = a * b;
            System.out.println("The base area is: " + area);
        } else if (choice2 == 2) {
            System.out.println("Enter height c: ");
            if (!input.hasNextDouble()) {
                System.out.println("Invalid number.");
                return;
            }
            double c = input.nextDouble();
            double volume = a * b * c;
            System.out.println("The volume is: " + volume);
        } else {
            System.out.println("Invalid selection!");
        }
    }

    private static void calculateEquilateralTriangle(Scanner input, int choice2) {
        System.out.println("Enter side length a: ");
        if (!input.hasNextDouble()) {
            System.out.println("Invalid number.");
            return;
        }
        double a = input.nextDouble();

        System.out.println("Enter height h: ");
        if (!input.hasNextDouble()) {
            System.out.println("Invalid number.");
            return;
        }
        double h = input.nextDouble();

        if (choice2 == 1) {
            double area = (a * h) / 2;
            System.out.println("The base area is: " + area);
        } else if (choice2 == 2) {
            System.out.println("Enter height: ");
            if (!input.hasNextDouble()) {
                System.out.println("Invalid number.");
                return;
            }
            double height = input.nextDouble();
            double volume = (a * h / 2) * height;
            System.out.println("The volume is: " + volume);
        } else {
            System.out.println("Invalid selection!");
        }
    }

    private static void calculateCircle(Scanner input, int choice2) {
        System.out.println("Enter radius r: ");
        if (!input.hasNextDouble()) {
            System.out.println("Invalid number.");
            return;
        }
        double r = input.nextDouble();

        if (choice2 == 1) {
            double area = Math.PI * r * r;
            System.out.println("The base area is: " + area);
        } else if (choice2 == 2) {
            System.out.println("Enter height h: ");
            if (!input.hasNextDouble()) {
                System.out.println("Invalid number.");
                return;
            }
            double h = input.nextDouble();
            double volume = Math.PI * r * r * h;
            System.out.println("The volume is: " + volume);
        } else {
            System.out.println("Invalid selection!");
        }
    }
}


