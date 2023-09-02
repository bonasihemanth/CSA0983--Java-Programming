class A
{
public void display()
{ 
System.out.println("Base");
}
}
class B extends A
{
public void display()
{ 
System.out.println("decimal");
}
}
class methodoverriding
{
public static void main(String args [])
{
B c= new B();
c.display();
{
A s = new A();
s.display();
}
}
}