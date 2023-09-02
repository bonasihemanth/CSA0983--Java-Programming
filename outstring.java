import java.util.*;
class outstring
{
public static void main(String args[]) 
{
int i=0;
int a[] =new int[5];
Scanner sc = new Scanner(System.in);
System.out.print("Enter the elements in the array:");
for (i=0;i<5;i++) 
{
a[i] = sc.nextInt();
}
for (i=0;i<5;i++) 
{
if (a[i] % 3 == 0 && a[i] % 5 == 0) 
{
System.out.println("health and wealth");
} 
else if (a[i] % 3 == 0) 
{
System.out.println("health");
} 
else if (a[i] % 5 == 0) 
{
System.out.println("wealth");
} 
else 
{
System.out.println("0");
}
}
}
}
