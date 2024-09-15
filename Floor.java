import java.util.*;

public class Floor{
    public static int Floors(int arr[], int x){
        int ans = -1;
        int low = 0;
        int high = arr.length-1;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(arr[mid]<=x){
                ans = arr[mid];
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int arr[] = {1,4,6,8,9,13};
        int x = 5;
        int result = Floors(arr, x);
        System.out.println(result);

    }
}