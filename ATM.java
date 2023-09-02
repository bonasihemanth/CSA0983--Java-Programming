import java.util.Scanner;
public class ATM
{
public static void main(String[] args) 
{
int a,b,c,d,sum;
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the no.of 2000 ruppee notes: ");
a= scanner.nextInt();
System.out.println("Enter the no.of 500 ruppee notes: ");
b=scanner.nextInt();
System.out.println("Enter the no.of 200 ruppee notes: ");
c= scanner.nextInt();
System.out.println("Enter the no.of 100 ruppee notes: ");
d= scanner.nextInt();
sum=(a*2000)+(b*500)+(c*200)+(d*100);
System.out.println("The total amount present in the ATM is :" +sum);
}
}