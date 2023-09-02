class A
{
public void display()
{
System.out.println("super class");
}
}

class B extends A
{
public void display1()
{
System.out.println("interfacing class ");
}
}

interface D
{
public void display2();
}

class C extends B implements D
{
public void display2()
{
System.out.println("child class");
}
}

class hybrid
{
public static void main(String args[])
{
C c=new C();
c.display();
c.display1();
c.display2();
}
}