import java.util.Scanner;
import java.util.Arrays;

public class readmatrix {
    public static void main(String[] args) {
        int[] a = new int[100];
int n,p;
        Scanner sc = new Scanner(System.in);
int i = 0;
while (i < 100) {
int num = sc.nextInt();
 if (num == -1) {
  break;
  } else {
if (a[i]<0){
 n=n+a[i];
}
else{
 p=p+a[i];
}
}
System.out.println(n);
System.out.println(p);
  a[i] = num;
    i++;
            }
        }


        System.out.println(Arrays.toString(Arrays.copyOfRange(a, 0, i)));
    }
}
