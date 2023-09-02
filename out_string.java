import java.util.*;
import java.util.Arrays;
class out_string
{
public static void main(String args[])
{
int i=0;
int a[]=new int[5];
Scanner sc=new Scanner(System.in);
System.out.print("enter the elemnets in the array:");
{
for(i=0;i<=5;i++)
{
a[i]=sc.nextInt();
}
}
{
if (a[i]%3==0)
{
System.out.println("health");
}
else if (a[i]%5==0)
{
System.out.println("wealth");
}
else if (a[i]%5==0) && (a[i]%3==0)
{
System.out.println("health and wealth");
}
else if (a[i] %5 !=0) && (a[i] %3 !=0)
{
System.out.println("0");
}
else
{
System.out.println("0");
}
}
}
}