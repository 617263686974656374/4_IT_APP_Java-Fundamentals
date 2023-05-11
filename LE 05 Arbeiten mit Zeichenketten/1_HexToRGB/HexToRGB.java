/*
This code creates a simple Java program that takes a user input for a 6-digit hexadecimal color code,
converts it into RGB values, and displays the result on the screen. The user is asked to input the color
code without the '#' symbol.
 */
import java.util.Scanner;

public class HexToRGB {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a hexadecimal color code (without the # symbol):");
        String hexColor = scanner.nextLine();
        scanner.close();

        int red, green, blue;
        if (hexColor.length() == 6) {
            red = Integer.parseInt(hexColor.substring(0, 2), 16);
            green = Integer.parseInt(hexColor.substring(2, 4), 16);
            blue = Integer.parseInt(hexColor.substring(4, 6), 16);
        } else {
            System.out.println("Invalid color code. Please enter a 6-digit hexadecimal value.");
            return;
        }

        System.out.println("RGB values for the given color code:");
        System.out.println("Red: " + red);
        System.out.println("Green: " + green);
        System.out.println("Blue: " + blue);
    }
}
