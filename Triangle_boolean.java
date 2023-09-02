public class Triangle 
{
int a;
int b;
int c;
public Triangle(int a,int b,int c) 
{
this.a=a;
this.b=b;
this.c=c;
}
public boolean isRight() 
{
int hypotesis=Math.max(side1,Math.max(b,c));
if (hypotesis==a) 
{
return a*a==b*b+c*c;
} 
else if (hypotenuse==b) 
{
return b*b==a*a+c*c;
} 
else 
{
return c*c==a*a+b*b;
}
}
public boolean isIsosceles()
{
return a==b||a==c||b==c;
}
public boolean isScalar()
{
return a!=b && a!=c && b!=c;
}
public boolean isEquilateral()
{
return a==b && a==c && b==c:
}
}
public class Triangle_boolean
{
public static void main(String args[])
{
Triangle_boolean s=new Triangle_boolean(System.in);
System.out.println("enter the sides values a,b,c :");
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
System.out.println("the triangle is right triangkle" +s.isRight());
System.out.println("the triangle is isoseles triangle" +s.isIsosceles());
System.out.println("the triangle is Scalar triangle" +s.isScalar());
System.out.println("the triangle is equalateral triangle" +s.isEquilateral());
}
}


