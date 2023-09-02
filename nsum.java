import java.util.Scanner;
class nsum
{
public static void main(String args[])
{
int n,i=1 ;
int sum=0;
System.out.println("Enter Number of items :");
Scanner s=new Scanner(System.in);
n=s.nextInt();
while(i<=n)
{
sum =sum +i;
i=i+1;
}
System.out.println("Sum of "+n+" numbers is :"+sum);
} 
}