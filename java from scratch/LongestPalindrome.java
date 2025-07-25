import java.util.*;

public class LongestPalindrome {
    public static void main(String[] args) {
        String[] arr = {"abc", "car", "madam", "racecar", "apple"};
        String longest = "";
        for (String word : arr) {
            if (isPalindrome(word) && word.length() > longest.length()) {
                longest = word;
            }
        }
        if (!longest.isEmpty()) {
            System.out.println("Longest Palindrome is " + longest);
        } else {
            System.out.println("No long palindrome is found");
        }
    }
    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;  
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}