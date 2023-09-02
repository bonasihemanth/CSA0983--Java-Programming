class PerfectNumber 
{
public int number;
public PerfectNumber(int number) 
{
this.number = number;
}
public boolean isPerfect() 
{
int sum = 0;
for (int i=1;i<number;i++) 
{
if (number % i == 0) 
{
sum += i;
}
}
return sum == number;
}
}
public class perfect1 
{
public static void main(String[] args) 
{
PerfectNumber perfectNumber = new PerfectNumber(24 );
if (perfectNumber.isPerfect()) 
{
System.out.println(perfectNumber.number + " is a perfect number.");
} 
else 
{
System.out.println(perfectNumber.number + " is not a perfect number.");
}
}
}