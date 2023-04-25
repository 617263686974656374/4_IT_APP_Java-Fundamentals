import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String name;
        int numPieces;
        int numPrice;
        String question;
        Scanner s = new Scanner(System.in);

        while (true){
            System.out.println("Enter name: ");
            name = s.nextLine();
            while (true) {
                System.out.println("Enter number of Pieces: ");
                try{
                    numPieces = Integer.parseInt(s.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Wrong number ! Write only number");
                }
            }
            while (true){
                System.out.println("Enter price: ");
                try {
                    numPrice = Integer.parseInt(s.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Wrong number ! Write only number");
                }
            }
            System.out.println("Name: " + name + ", Number of Pieces: " + numPieces + ", Price: " + numPrice);
            System.out.println("Do you want write new Item ? (yes/no) ");
            question = s.nextLine().trim().toLowerCase();
            if (!question.equals("yes")) {
                break;
            }
        }

    }
}