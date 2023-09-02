import java.util.Scanner;
public class until {
public static void main(String[] args) {
String[] a = new String[10];
Scanner sc = new Scanner(System.in);
int i = 0,c=0;    
while (i < 10) {
String num = sc.nextLine();  
if (num.equals("*")) {
break;
}
a[i] = num;
i++;
if (a[i].UpperCase()==True){
c=c+i;
}
}
System.out.println("Input values:");
for (int j = 0; j < i; j++) {
System.out.println(a[j]);
System.out.println("no of upper values:"+c);
}
}
}