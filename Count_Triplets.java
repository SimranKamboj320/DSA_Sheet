import java.util.*;

public class Count_Triplets {
    public static long countTriplets(int n, int sum, long arr[]) {
        // Initialize result
        long ans = 0;

        // Fix the first element as arr[i]
        for (int i = 0; i < n - 2; i++) {
            // Fix the second element as arr[j]
            for (int j = i + 1; j < n - 1; j++) {
                // Now look for the third number
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] < sum) {
                        ans++;
                    }
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        long[] arr = {5, 1, 3, 4, 7};  // Initialize array
        int sum = 12;
        int n = arr.length;

        System.out.println(countTriplets(n, sum, arr));  // Call the method with the array
    }
}
