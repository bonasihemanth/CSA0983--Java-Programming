class A
{
public void display()
{
System.out.println("Super class");
}
}

interface B
{
public void display1();
}
class C extends A implements B
{
public void display1()
{
System.out.println("child class");
}
}

class MP_Inherits 
{
public static void main(String args[])
{
C c=new C();
c.display();
c.display1();
}
}
