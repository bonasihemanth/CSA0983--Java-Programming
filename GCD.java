import java.util.Scanner;
public class GCD
{
public static void main(String[]args)
{
int gcd,a,b,i;
Scanner s=new Scanner(System.in);
System.out.print("enter the dividend:");
a=s.nextInt();
System.out.print("enter the divisor:");
b=s.nextInt();
for(i=1;i<=a && i<=b;i++)
{
if (a%i==0 && b%i==0)
{
System.out.print("the gcd is :" +i);
}
}
}
}