import java.util.Scanner;
class div
{
public static void main(String [] args)
{
int i,num,sum=0 ;
Scanner s=new Scanner(System.in);
num=s.nextInt();
for(i=100;i<=num;i++)
{
if (i%9==0)
{
System.out.print(+i);
}
else
{
System.out.print(/n);
}
System.out.print("The sum of n numbers:"+sum);
}
}
}