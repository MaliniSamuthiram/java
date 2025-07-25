import java.util.Arrays;
public class MinMax{
    public static void main(String[] args) {
        int[] arr = {11,45,33,73,42};
        System.out.println("Maximum in the array : "+max(arr));
        System.out.print("Minimum in the array : "+min(arr));
    }
public static int max(int[] arr){
    int max = arr[0];
    for(int i=0;i<arr.length;i++){
        if(max<arr[i]){
            max = arr[i];
           }
    }
    return max;
}
public static int min(int[] arr){
    int min = arr[0];
    for(int i=0;i<arr.length;i++){
        if(min>arr[i]){
            min = arr[i];
        }
    }
    return min;
}
}