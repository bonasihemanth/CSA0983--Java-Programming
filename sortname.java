import java.util.Arrays;
class sortname 
{
public static void main(String[] args)
{
int n = 4;
String names[]={ "abcd", "bcde", "efgh", "uthf" };
String temp;
for (int i=0;i<n;i++) 
{
for (int j=i+1;j<n;j++) 
{
if (names[i].compareTo(names[j]) > 0) 
{
temp = names[i];
names[i] = names[j];
names[j] = temp;
}
}
}
System.out.println("Sorted words are : " +Arrays.deepToString(names));
}
}
