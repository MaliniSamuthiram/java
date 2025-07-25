public class SumArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.print("Sum of the Array is "+sum(arr));
    }
    public static int sum(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum+i;
        }
        return sum;
    }
}
