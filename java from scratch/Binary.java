import java.util.Arrays;

public class Binary {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(Binary(arr, 3));
    }
    public static int Binary(int[] arr,int target){
       Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==target){
                System.out.println("target found at "+mid);
                return mid;
            }
            else if(target<arr[mid]){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
           
        }
        return -1;
    }
}
