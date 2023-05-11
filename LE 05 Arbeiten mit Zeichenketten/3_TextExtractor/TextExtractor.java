/*

 */
import java.util.Scanner;

public class TextExtractor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text (theItem[Apple]wasOrderedBy[Krc])");
        String inputText = scanner.nextLine();

        int startInderxOfArtikel = inputText.indexOf("[") + 1;
        int endIndexOfArtikel = inputText.indexOf("]");
        String artikel = inputText.substring(startInderxOfArtikel, endIndexOfArtikel);

        int startIndexOfOrderer = inputText.lastIndexOf("[") + 1;
        int endIndexOfOrderer = inputText.lastIndexOf("]");
        String orderer = inputText.substring(startIndexOfOrderer, endIndexOfOrderer);

        System.out.println("Item: " + artikel);
        System.out.println("Orderer: " + orderer);
    }
}