import java.util.*;

public class ReverseSort {
    
    // Function to check if reversing a subarray will sort the array
    public static boolean canSortByReversingSubarray(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;
        
        // Step 1: Find the first index where the order breaks
        while (left < n - 1 && arr[left] <= arr[left + 1]) left++;
        
        // If the entire array is already sorted
        if (left == n - 1) return true;
        
        // Step 2: Find the last index where the order breaks
        while (right > 0 && arr[right] >= arr[right - 1]) right--;
        
        // Step 3: Check if the subarray from left to right is in decreasing order
        for (int i = left; i < right; i++) {
            if (arr[i] < arr[i + 1]) {
                return false; // If not decreasing, return false
            }
        }
        
        // Step 4: Check if the element before left and after right fits
        // Handle boundary conditions separately
        if ((left == 0 || arr[left - 1] <= arr[right]) && 
            (right == n - 1 || arr[left] <= arr[right + 1])) {
            return true;
        }
        
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 4, 2, 6, 7};
        System.out.println(canSortByReversingSubarray(arr) ? 
                           "Yes, reversing a subarray can sort the array." : 
                           "No, it can't be sorted by reversing a subarray.");
    }
}
