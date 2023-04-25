import java.util.Scanner;
public class Nummerierung {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int start = s.nextInt();

        System.out.println("Enter last number: ");
        int end = s.nextInt();

        System.out.println("Enter the increment of the list: ");
        int increment = s.nextInt();

        System.out.println("List of numbers:");
        for (int i = start; i <= end; i+= increment) {
            System.out.println(i + " ");
        }
    }
}