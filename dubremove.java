import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 1, 5, 6, 3};
for (int i = 0; i < array.length; i++) {
set.add(array[i]);}
int[] uniqueArray = new int[set.size()];
        int index = 0;

        for (int num : set) {
            uniqueArray[index++] = num;
        }

        return uniqueArray;
    }
}
      System.out.println("Array with Duplicates Removed: " + Arrays.toString(uniqueArray));