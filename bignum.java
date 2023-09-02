import java.util.Scanner;
class Small 
{
Small(int a, int b, int c) 
{
if (a>b)&&(a>c) 
{
System.out.print("a is bigger");
}
else if (b>a)&&(b>c) 
{
System.out.print("b is bigger");
} 
else 
{
System.out.print("c is bigger");
}
}
}
class bignum 
{
public static void main(String[] args) 
{
int a, b, c;
Scanner sc = new Scanner(System.in);
System.out.println("Please enter a number: ");
a = sc.nextInt();
System.out.println("Please enter b number: ");
b = sc.nextInt();
System.out.println("Please enter c number: ");
c = sc.nextInt();
Small obj = new Small(a, b, c);
}
}