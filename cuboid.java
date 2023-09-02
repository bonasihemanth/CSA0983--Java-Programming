interface Shape 
{
double calculateArea();
}
class Rectangle implements Shape 
{
double a;
double b;
public Rectangle(double a, double b) 
{
this.a=a;
this.b=b;
}
public double calculateArea() 
{
return a*b;
}
}
class Cuboid implements Shape 
{
public Rectangle base;
public double c;
public Cuboid(double a, double b, double c) 
{
this.base = new Rectangle(a,b);
this.c=c;
}
public double calculateVolume() 
{
return base.calculateArea()*c;
}
public double calculateArea() 
{
return 2*(base.calculateArea()+base.a *c + base.b*c);
}
public void display() 
{
System.out.println("Length: " + base.a);
System.out.println("Breadth: " + base.b);
System.out.println("Height: " + c);
System.out.println("Area: " + calculateArea());
System.out.println("Volume: " + calculateVolume());
}
}
public class cuboid
{
public static void main(String[] args) 
{
Cuboid cuboid = new Cuboid(4, 3, 5);
cuboid.display();
}
}