import java.util.Scanner;

public class Caesar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the text to be encrypted:");
        String inputText = scanner.nextLine();

        System.out.println("Enter the shift value:");
        int shift = scanner.nextInt();

        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < inputText.length(); i++) {
            char currentChar = inputText.charAt(i);

            if (Character.isUpperCase(currentChar)) {
                char encryptedChar = (char) (((currentChar - 'A' + shift) % 26) + 'A');
                encryptedText.append(encryptedChar);
            } else if (Character.isLowerCase(currentChar)) {
                char encryptedChar = (char) (((currentChar - 'a' + shift) % 26) + 'a');
                encryptedText.append(encryptedChar);
            } else {
                encryptedText.append(currentChar);
            }
        }

        System.out.println("Encrypted text:");
        System.out.println(encryptedText.toString());
    }
}



/*public class Caesar {

    public static String encrypt(String text, int shift) {
        StringBuilder encrypted = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                char offset = Character.isUpperCase(ch) ? 'A' : 'a';
                encrypted.append((char) (((ch + shift - offset) % 26) + offset));
            } else {
                encrypted.append(ch);
            }
        }
        return encrypted.toString();
    }

    public static String decrypt(String text, int shift) {
        return encrypt(text, 26 - shift);
    }

    public static void main(String[] args) {
        String message = "Ahoj, ako sa mas?";
        int shift = 3;

        String encryptedMessage = encrypt(message, shift);
        System.out.println("Zasifrovana sprava: " + encryptedMessage);

        String decryptedMessage = decrypt(encryptedMessage, shift);
        System.out.println("Desifrovana sprava: " + decryptedMessage);
    }
}

 */
