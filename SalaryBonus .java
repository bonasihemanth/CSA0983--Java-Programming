import java.util.Scanner;
public class SalaryBonus 
{
public static void main(String[] args) 
{
int salary,grade,bonus=0,bonusPercentage=0;
Scanner s = new Scanner(System.in);
System.out.print("Enter the salary: ");
salary = s.nextInt();
System.out.print("Enter the grade of the employee (A or B): ");
grade = s.next().charAt(0);
if (salary < 10000) 
{
bonusPercentage = 2;
} 
else 
{
if (grade == 'A') 
{
bonusPercentage = 5;
} 
else if (grade == 'B') 
{
bonusPercentage = 10;
} 
else 
{
System.out.println("Invalid grade entered.");
}
}
bonus = (salary * bonusPercentage) / 100;
int totalSalary = salary + bonus;
System.out.println("Total salary is: " + totalSalary);
}
}