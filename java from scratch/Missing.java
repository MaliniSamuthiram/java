import java.util.*;
class Missing{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int totalSum = (n+1)*(n+2)/2;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = sum + arr[i];
        }
        int missing = totalSum - sum;
        System.out.print("Missing number : "+missing);
        sc.close();
    }
}