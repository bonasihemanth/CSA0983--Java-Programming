import java.util.Scanner;
import java.util.Arrays;
public class merge
{
public static void main (String[] arg)
{
int i=0,j=0;
int a[]=new int[5];
int b[]=new int[5];
Scanner sc=new Scanner(System.in);
System.out.print("enter the elements in the 1st array:");
for(i=0;i<4;i++)
{
a[i]=sc.nextInt();
}
System.out.print("enter the elements in the 2nd array:");
for(i=0;i<4;i++)
{
b[i]=sc.nextInt();
}
int c[]=new int[5];
{
c[i]=a[i]+b[i];
}
System.out.println(" " +Arrays.deepToString(c));
}
}
