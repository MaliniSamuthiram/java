import java.util.Arrays;
public class SecLar {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.print("Second largest value is "+SecondLargest(arr));
    }
    public static int SecondLargest(int[] arr){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        if(arr.length<2){
            return first;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>first){
                second = first;
                first = arr[i];
            }
        }
        return second;
    }
}
