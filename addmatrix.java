import java.util.Scanner;
import java.util.Arrays;
public class addmatrix 
{
public static void main (String[] arg)
{
int i=0,j=0;
int a[][]=new int[3][3];
int b[][]=new int[3][3];
Scanner sc=new Scanner(System.in);
System.out.print("enter the elemnets in the A matrix:");
for(i=0;i<3;i++)
{
for (j=0;j<3;j++) 
{
a[i][j]=sc.nextInt();
}
}
System.out.print("enter the elemnets in the B matrix:");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
b[i][j]=sc.nextInt();
}
}
int c[][]=new int[3][3];
{
c[i][j]=a[i][j]+b[i][j];
}
System.out.println(Arrays.deepToString(c));
}
}