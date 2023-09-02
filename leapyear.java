import java.util.*;
class leapyear
{
public static void main(String arg[])
{
int year, a, b;
Scanner s=new Scanner(System.in);
System.out.println("enter the year:");
year=s.nextInt();
b=year%4;
{
if (b==0)
{
System.out.println("the year is leap year");
}
else if (b!=0)
{
a=year+(4-b);
System.out.println("the year is not leap year , next leap year is " +a);
}
else
System.out.println("invalid");
}
}
}
