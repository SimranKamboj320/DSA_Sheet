import java.util.*;

public class Four{
    public static void Sums(int arr[], int X){
        Arrays.sort(arr);
        int n = arr.length;
        int left; 
        int right; 

        for(int i=0; i<=n-3; i++){
            for(int j=i+1; j<=n-2; j++){
                left = j+1;
                right = n-1;

                int cursum = arr[i] + arr[j] + arr[left] + arr[right];

                if(cursum == X){
                    System.out.println("Found");
                    return;
                }else if(cursum < X){
                    left++;
                }else{
                    right--;
                }
            }
        }
        System.out.println("Not found");
    }
    public static void main(String args[]){
        int arr[] = {4,5,6,8,9,0,2};
        int X = 23;
        Sums(arr, X);
    }
}