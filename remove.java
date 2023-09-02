import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 1, 5, 6, 3};
        int [] array1= new int[array.Length];
for(i=0;i<array.Length;i++)
{
for (j=0;j<array.Length;j++)
{
if(array[i]==array1[j]){
break;
}
}
   