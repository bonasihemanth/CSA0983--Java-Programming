import java.util.Scanner;
public class binarytooct {
public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a binary number: ");
String binary = scanner.nextLine();
int octal = binaryToOctal(binary);
System.out.println("Octal equivalent: " + octal);
}
public static int binaryToOctal(String binary) 
{
int decimal = Integer.parseInt(binary, 2);
int octal = 0;
int count = 0;
while (decimal != 0) 
{
octal += (decimal % 8) * Math.pow(10, count);
decimal /= 8;
count++;
}
return octal;
}
}
