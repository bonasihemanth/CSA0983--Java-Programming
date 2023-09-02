class Student
{
public void display()
{
System.out.println("Name of the student:Hemanth");
System.out.println("Roll number:192111338");
}
}
class test extends Student
{
int s1=10;
int s2=20;
int s3=10;
int s4=20;
int s5=11;
public void display1()
{
System.out.println("the 5 subject marks for tests ");
}
}
class result extends test
{
int result1=(s1+s2+s3+s4+s5);
public void display3()
{
System.out.println(" total marks :"+result1);
}
}
class marks
{
public static void main(String args[])
{
result c=new result();
c.display();
c.display1();
c.display3();
}
}