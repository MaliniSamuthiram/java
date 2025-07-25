public class Position {
    public int[] Range(int[] nums, int target) {
        int first = Bound(nums, target, true);
        int last = Bound(nums, target, false);
        return new int[]{first, last};
    }

    private int Bound(int[] nums, int target, boolean isFirst) {
        int left = 0, right = nums.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                result = mid;
                if (isFirst) {
                    right = mid - 1; // Keep searching left for the first occurrence
                } else {
                    left = mid + 1;  // Keep searching right for the last occurrence
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Position pos = new Position();
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 8;
       
        int[] result = pos.Range(arr, target);
        System.out.println("First and Last Position: [" + result[0] + ", " + result[1] + "]");
    }
}

