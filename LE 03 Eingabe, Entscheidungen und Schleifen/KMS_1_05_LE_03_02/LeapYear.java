import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter how many Years you want write: ");
        int howmany = s.nextInt();

        Integer[] years = new Integer[howmany];

        for (int i=0; i < howmany; i++){
            System.out.println("Enter year " + (i + 1) + ":");
            int year = s.nextInt();
            years[i] = year;
        }

        for (int year : years){
            boolean question;
            if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
                question = true;
            } else {
                question = false;
            }
            if (question) {
                System.out.println("Year " + year + " is Leap.");
            } else {
                System.out.println("Year " + year + " is not Leap.");
            }
        }

    }
}

/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Year: ");
        int year = s.nextInt();
        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
            System.out.println("This Year is Leap");
        } else {
            System.out.println("This Year is not Leap");
        }

    }
}*/
/*
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter how many Years you want write: ");
        int howmany = s.nextInt();

        for (int i=0; i < howmany; i++){
            System.out.println("Enter year " + (i+1) + ":");
            int year = s.nextInt();
            boolean question;
            if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
                question = true;
            } else {
                question = false;
            }
            if (question) {
                System.out.println("Year " + year + " is Leap.");
            } else {
                System.out.println("Year " + year + " is not Leap.");
            }
        }

    }
}
*/
