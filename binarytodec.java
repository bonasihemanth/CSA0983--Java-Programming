import java.util.Scanner;

public class binarytodec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine();

        int decimal = convertBinaryToDecimal(binary);
        System.out.println("Decimal: " + decimal);
    }

    public static int convertBinaryToDecimal(String binary) {
        int decimal = 0;
        int length = binary.length();

        for (int i = 0; i < length; i++) {
            int digit = binary.charAt(length - i - 1) - '0';
            decimal += digit * Math.pow(2, i);
        }

        return decimal;
    }
}