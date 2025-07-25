import java.util.Scanner;
public class Practice {
    public static void main(String[]args){
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println("Element at index "+i+" is : "+arr[i]);
        }
        sc.close();
    }
}

