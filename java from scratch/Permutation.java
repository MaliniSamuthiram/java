import java.util.*;
public class Permutation {
    public static void main(String[] args) {
   int[] arr = {1,2,3,4,5};
   int[] permu = {4,2,0,3,1};
   int[] result = new int[arr.length];
   for(int i=0;i<arr.length;i++){
       result[i] = arr[permu[i]];
   }
   for(int i=0;i<result.length;i++){
       System.out.print(result[i]);
   }
}
}

