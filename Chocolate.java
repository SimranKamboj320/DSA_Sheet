import java.util.*;

public class Chocolate{
    public static int Choco(int nums[], int m){
        Arrays.sort(nums);

        int num[] = new int[m];

        for(int i=0; i<m; i++){
            num[i] = nums[i];
        }
        int min = num[0];
        int max = num[0];

        for(int i=1; i<num.length; i++){
            max = Math.max(max, num[i]);
            min = Math.min(min, num[i]);
        }

        int diff = max - min;

        return diff;

    }
    public static void main(String args[]){
        int nums[] = {7, 3, 2, 4, 9, 12, 56};
        int m = 3;

        System.out.println(Choco(nums, m));
    }
}