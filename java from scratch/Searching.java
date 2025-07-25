import java.util.*;
class Searching{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int length = sc.nextInt();
        int[] arr = new int[length];
        System.out.print("Enter elements : ");
        for(int i=0;i<length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to search : ");
        int target = sc.nextInt();
        for(int i=0;i<length;i++){
            if(arr[i]==target){
                System.out.print("Target found at "+i+"th index");
            }
        }
        sc.close();
    }
}