import java.util.*;

public class FourElementSum {
    // Method to find four elements that sum to a given value
    public static void findFourElements(int[] arr, int targetSum) {
        int n = arr.length;

        Arrays.sort(arr);

        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                int left = j + 1;
                int right = n - 1;

                // Use two pointers to find the remaining two elements
                while (left < right) {
                    int currentSum = arr[i] + arr[j] + arr[left] + arr[right];

                    // Check if the current sum is equal to the target sum
                    if (currentSum == targetSum) {
                        System.out.println("Found elements: " + arr[i] + ", " + arr[j] + ", " + arr[left] + ", " + arr[right]);
                        return; // Exit after finding the first combination
                    } else if (currentSum < targetSum) {
                        left++; // Move the left pointer to increase the sum
                    } else {
                        right--; // Move the right pointer to decrease the sum
                    }
                }
            }
        }
        System.out.println("No combination found.");
    }

    public static void main(String[] args) {
        int[] arr = {10, 2, 3, 4, 5, 9, 7, 8};
        int targetSum = 23;
        findFourElements(arr, targetSum);
    }
}