import java.util.*;
public class SmLg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int largest = arr[0];
        int smallest = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
            if(arr[i]<smallest){
            smallest = arr[i];
            }
        }
            System.out.println("smallest : "+smallest);
            System.out.println("largest : "+largest);
            sc.close();
        }
    }
