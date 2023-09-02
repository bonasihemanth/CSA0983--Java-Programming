class A implements Runnable
{
public void main()
{
System.out.println("base");
}
}
class B 
{
public void main()
{
A a=new A();
Threads t=new Threads(a);
t.start(5);
}
}