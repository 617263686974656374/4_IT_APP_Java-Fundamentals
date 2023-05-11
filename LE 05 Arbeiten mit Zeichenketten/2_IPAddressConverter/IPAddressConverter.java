/*
It will ask you for an IPv4 address and then display the octets in different numeral systems.
 */
import java.util.Scanner;

public class IPAddressConverter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the IPv4 address (e.g) 192.168.0.1:");
        String ipAddress = scanner.nextLine();

        String[] values = ipAddress.split("\\.");
        int[] changeToInt = new int[values.length];
        for (int i = 0; i < values.length; i++){
            changeToInt[i] = Integer.parseInt(values[i]);
        }

        String hexOutput = "#";
        for (int i = 0; i < changeToInt.length;i++){
            hexOutput += String.format("%02x", changeToInt[i]);
        }
        System.out.println("Convert to hexadecimal number: " + hexOutput);

        long decOutput = changeToInt[0] * 16777216L + changeToInt[1] * 65536L + changeToInt[2] * 256L + changeToInt[3];
        System.out.println("Convert to dezimal number: " + decOutput);

        String binOutput = "bx";
        for (int i = 0; i < changeToInt.length; i++){
            binOutput += String.format("%08d", Integer.parseInt(Integer.toBinaryString(changeToInt[i])));
            if (i < changeToInt.length - 1){
                binOutput += ".";
            }
        }

        System.out.println("Convert to binar number: " + binOutput);

        String octOutput = "Ox: ";
        for (int i = 0; i < changeToInt.length;i++){
            octOutput += String.format("%04o", changeToInt[i]);
            if (i < changeToInt.length - 1){
                octOutput += ".";
            }
        }
        System.out.println("Convert to oktal number: " + octOutput);
    }
}