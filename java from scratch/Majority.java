import java.util.*;
public class Majority {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4};
        int[] count = new int[arr.length];

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count[i] = count[i] + arr[i]; 
                System.out.print(count[i] + " ");
            }
        }
    }
}