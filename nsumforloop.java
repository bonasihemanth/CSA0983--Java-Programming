import java.util.Scanner;
class nsumforloop
{
public static void main(String [] args)
{
int i,num,sum=0 ;
Scanner s=new Scanner(System.in);
num=s.nextInt();
for(i=1;i<=num;i++)
{
sum=sum+i;
}
System.out.print("The sum of n numbers:"+sum);
}
}