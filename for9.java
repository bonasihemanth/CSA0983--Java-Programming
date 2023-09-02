import java.util.Scanner;
class for9
{
public static void main(String [] args)
{
int i,num,sum=0 ;
Scanner s=new Scanner(System.in);
num=s.nextInt();
for(i=100;i<=num;++i)
{
if (i%9==0)
{
System.out.println(+i);
}
}
}
}