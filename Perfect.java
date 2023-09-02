import java.util.Scanner;
class PerfectNumber
{
int num;
public boolean isPerfect() 
{ 
int m=0;
for(i=0;i<num;i++)
{
if (num%i==0)
{
m=m+1;
}
}
if(m==num)
{
System.out.println("The number is perfect number");
}
}
}
public class Perfect
{
public static void main(String[] args) 
{
int num;
Scanner s=new Scanner(System.in);
System.out.println("enter the number to check iot is perfect number or not:");
num=s.nextInt();
PerfectNumber num = new PerfectNumber(num);
if (PerfectNumber.isPerfect()) 
{
System.out.println(PerfectNumber.num + " is a perfect number.");
} 
else 
{
System.out.println(PerfectNumber.num + " is not a perfect number.");
}
}
}