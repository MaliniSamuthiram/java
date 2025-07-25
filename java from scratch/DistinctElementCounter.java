public class DistinctElementCounter {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4}; 
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isDistinct = true;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct) {
                count++; 
            }
        }
        System.out.println("Number of distinct elements: " + count);
    }
}