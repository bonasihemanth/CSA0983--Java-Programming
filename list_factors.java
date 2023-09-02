import java.util.Scanner;
public static void main(String[] args) 
{
Scanner s = new Scanner(System.in);
System.out.print("Enter number: ");
int num = s.nextInt();
System.out.print("Enter n ");
int n = s.nextInt();
System.out.println("Factors are ");
for (int i = 1; i <= num; i++) 
{
if (num%i==0) 
{
System.out.println(i); 
}
}
int c = 0;
int n1 = 0;
for (int i=1;i<=num;i++) 
{
if (num % i == 0) 
{
c++;
if (c == n) 
{
nth = i;
break; 
}
}
}
if (n1!=-1) 
{
System.out.println("The factors of given number are : " + n1Factor);
}
else 
{
System.out.println("The factors does not exist for " + num);
}
}
}