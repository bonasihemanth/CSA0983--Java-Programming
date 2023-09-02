import java.util.*;
class days_convert
{
public static void main(String args[])
{
Scanner s= new Scanner(System.in);
int a= s.nextInt();
int year =a/365;
int c=a%365;
int week =c/7;
int e=c%7;
System.out.println("No.of years :"+year);
System.out.println("No.of weeks :"+week);
System.out.println("No.of  days : "+e);
}
}

