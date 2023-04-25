import java.util.Scanner;

    public class Untersuchen {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            System.out.println("Enter a text:");
            String inputText = s.nextLine();

            int vowels = 0;
            int consonants = 0;
            int punctuationMarks = 0;
            int spaces = 0;

            for (int i = 0; i < inputText.length(); i++) {
                char c = inputText.charAt(i);
                char ch = Character.toLowerCase(c);

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else if ((ch >= 'a' && ch <= 'z') && !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                    consonants++;
                } else if (c == '.' || c == ',' || c == ';' || c == ':' || c == '?' || c == '!' || c == '-' || c == '(' || c == ')' || c == '[' || c == ']' || c == '{' || c == '}' || c == '\'' || c == '"') {
                    punctuationMarks++;
                } else if (c == ' ') {
                    spaces++;
                }
            }

            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
            System.out.println("Punctuation marks: " + punctuationMarks);
            System.out.println("Spaces: " + spaces);
            System.out.println("Text length without spaces: " + (inputText.length() - spaces));
            System.out.println("Text length with spaces: " + inputText.length());
        }
    }
