import java.util.Arrays;

public class Chocolate_opti {
    public static int Choco(int nums[], int m) {
        if (nums.length < m) {
            return -1; // Error code for invalid case
        }
        
        Arrays.sort(nums);

        int minDiff = Integer.MAX_VALUE;

        // Traverse the array to find the minimum difference between
        // the maximum and minimum of any subset of size m
        for (int i = 0; i + m - 1 < nums.length; i++) {
            int diff = nums[i + m - 1] - nums[i];
            minDiff = Math.min(minDiff, diff);
        }

        return minDiff;
    }

    public static void main(String[] args) {
        int nums[] = {7, 3, 2, 4, 9, 12, 56};
        int m = 3;

        int result = Choco(nums, m);
        if (result == -1) {
            System.out.println("Invalid input: m is greater than the number of elements in nums.");
        } else {
            System.out.println("Minimum Difference is: " + result);
        }
    }
}
