class A
{
int x=1234;
public void display()
{
System.out.println(" "+x);
}
}
class B extends A
{
int y=2345;
public void display1()
{
System.out.println(" "+y);
}
}
class C extends B
{
int z=3456;
public void display2()
{
System.out.println(" "+z);
}
}
class Inherits1
{
public static void main(String args[])
{
C c=new C();
c.display();
c.display1();
c.display2();
}
}