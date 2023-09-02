import java.util.Scanner;
public class salarybonus
{
public static void main(String[] args) 
{
int salary,grade,bonus,bonus1,bonus2 ;
Scanner s = new Scanner(System.in);
System.out.print("enter the decimal number");
salary=s.nextInt();
System.out.println("enter the ware of the employee(A or B):");
grade=s.nextInt();
{
if (salary<10000)
{
bonus=salary*(2/100);
}
{
if (grade==A)
{
bonus1=salary+(salary+(5/100));
System.out.println("Total salary is :"+bonus1);
}
else if (grade==B)
{
bonus2=salary+(salary+(10/100));
System.out.println("Total salary is :"+bonus2);
}
}
else 
{
System.out.println("invalid garade enter);
}
}
}
}


