import java.util.Scanner;
class inventor 
{
public static void main(String args[]) 
{
System.out.println("Who is the inventor of the Java programming?");
System.out.println("Enter the name of the inventor in lowercase:");
Scanner s = new Scanner(System.in);
String inventor = s.nextLine();
if (inventor.equals("james gosling")) 
{
System.out.println("Good, it's the correct answer");
} 
else 
{
for (int chances = 1; chances <= 2; chances++) 
{
System.out.println("Try again, " + chances + " chances over");
inventor = s.nextLine();
if (inventor.equals("james gosling")) {
System.out.println("Good, it's the correct answer");
break; 
}
}
if (!inventor.equals("james gosling")) 
{
System.out.println("You are out of chances, the correct answer is James Gosling");
}
}
}
}