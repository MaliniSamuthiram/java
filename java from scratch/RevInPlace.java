import java.util.Arrays;

public class RevInPlace {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        System.out.print("Reverse at place "+Arrays.toString(reverse(arr)));
    }
    public static int[] reverse(int[] arr){
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        return arr;
    }
}
