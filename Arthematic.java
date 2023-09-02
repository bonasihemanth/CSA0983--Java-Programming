import java.util.Scanner;
public class Arthematic
{
public static void main(String[] args) 
{
int num1 , num2;
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the first number: ");
num1 = scanner.nextInt();
System.out.print("Enter the second number: ");
num2 = scanner.nextInt();
System.out.println("Select an operation:");
System.out.println("1. Addition");
System.out.println("2. Subtraction");
System.out.println("3. Multiplication");
System.out.println("4. Division");
int choice = scanner.nextInt();
double result;
switch (choice) 
{
case '1':
result = num1 + num2;
System.out.println("Addition: " + result);
break;
case '2':
result = num1 - num2;
System.out.println( "subtraction" +num1+ "and" +num2+ "is" + result);
break;
case '3':
result = num1 * num2;
System.out.println("Multiplication: " + result);
break;
case '4':
if (num2 != 0) 
{
result = num1 / num2;
System.out.println("Division: " + result);
} 
else 
{
System.out.println("Cannot divide by zero!");
}
break;
default:
System.out.println("Invalid choice!");
}
scanner.close();
}
}






