import java.util.Arrays;

public class Frequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3};
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                System.out.println(arr[i - 1] + " : " + count);
            }
        }
        System.out.println(arr[arr.length - 1] + " : " + count);
        
    }
}
