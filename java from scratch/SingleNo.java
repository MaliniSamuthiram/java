public class SingleNo {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4, 5, 5};
        System.out.println(uniqueElement(arr));
    }
    public static int uniqueElement(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (i==0 || arr[i]!=arr[i-1] && i==arr.length-1 || arr[arr.length-1]!=arr[arr.length-1-i]) {
             return(arr[i]);
            }
        }
        return 0;
    }
}


