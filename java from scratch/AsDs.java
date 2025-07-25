import java.util.*;
public class AsDs {
    public static void main(String[]args){
        int[] arr = {5, 2, 9, 1, 6, 3, 8, 7};
        int temp;
        for(int i=0;i<arr.length/2;i++){
            if(arr[i]<arr[i+1]){
                temp = arr[i];
               System.out.print(arr[i+1]);
            }
        }
    }
}
