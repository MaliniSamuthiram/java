public class Palindrome {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,2,1};
        System.out.println("Is Palindrome : "+Palindrome(arr));

    }
    public static boolean Palindrome(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            if(arr[left]!=arr[right]){
                return false;
            }
            left++;
            right--;
            }
            return true;
        }
    }

