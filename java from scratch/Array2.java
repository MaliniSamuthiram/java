//import java.util.Scanner;
import java.util.Arrays;
public class Array2 {
    public static void main(String[] args){
   // Scanner sc = new Scanner(System.in);
    String[] arr = {"Milo", "Megan", "Melon"};
    System.out.println(Arrays.toString(arr));
    change(arr);
    System.out.println(Arrays.toString(arr));
    }
    static void change(String[] arr){
    arr[1] = "Merry";
    }
}

