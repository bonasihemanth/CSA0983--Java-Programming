class staff
{
public void display()
{
System.out.println("Staff code: ");
System.out.println("Staff name:");
}
}
class teacher extends staff
{
public void display1()
{
System.out.println("teacher subject: ");
System.out.println("teacher publications: ");
}
}
class typist extends staff
{
public void display2()
{
System.out.println("Typist speed:");
}
}
class officer extends staff
{
public void display3()
{
System.out.println("grade:");
}
}

class regular extends typist
{
public void display5()
{
System.out.println("regular salary:");
}
}

class casual extends typist
{
public void display4()
{
System.out.println("casual daily wages:");
}
}

class classdiagram
{
public static void main(String args[])
{
casual c=new casual();
c.display();
c.display2();
c.display5();
c.display4();
}
}