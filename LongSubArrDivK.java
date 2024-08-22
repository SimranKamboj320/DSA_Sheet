import java.util.*;

public class LongSubArrDivK{
    public static int SubArr(int nums[], int k){
        int max = 0;

        for(int i=0; i<nums.length; i++){
            int sum = 0;
            for(int j=i; j<nums.length; j++){
                sum = sum + nums[j];
                if(sum%k == 0){
                    max = Math.max(max, j-i+1);
                }
            }
        }
        return max;
    }
    public static void main(String args[]){
        int nums[] = {2,7,6,1,4,5};
        System.out.println(SubArr(nums, 3));
    }
}