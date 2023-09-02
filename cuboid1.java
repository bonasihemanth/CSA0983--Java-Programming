public class cuboid
{
int a;
int b;
int c;
public cuboid(int a,int b,int c) 
{
this.a=a;
this.b=b;
this.c=c;
}

interface Shape 
{
double calculateArea();
}

class Rectangle implements Shape 
{
public Rectangle(int a, int b) ;
public double calculateArea() 
{
return a*b;
}
}

class Cuboid extends rectangle
{
public Cuboid(int a, int b,int c) ;
public double calculatevolume() 
{
return a*b*c;
}
}

public class cuboid1
{
public static void main(String[] args) 
{
System.out.println("Area: " + calculateArea());
System.out.println("Volume: " + calculateVolume());
}
}
}



