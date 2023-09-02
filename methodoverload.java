class method 
{
public int area(int x)
{
return x*x;
}
public float area(float y)
{
return y*y;
}
public float area (int a,float b)
{
return a*b;
}
public float area (float c,float d)
{
return c*d;
}
}
class methodoverload
{ 
public static void main (String arg[])
{
method m=new method();
System.out.println(m.area(5));
System.out.println(m.area(5.5f,1));
System.out.println(m.area(5.5f));
}
}