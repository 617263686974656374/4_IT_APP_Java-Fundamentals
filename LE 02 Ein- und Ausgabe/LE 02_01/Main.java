import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write your name: ");
        String firstname = scanner.nextLine();

        System.out.print("Write your surname: ");
        String surname = scanner.nextLine();

        System.out.println("Your full name: " + firstname + " " + surname);
    }
}