import java.util.*;

public class MinMax {
    public static void getMinMax(int arr[]) {
        int max=arr[0];
        int min=arr[0];
        
        for(int i=1; i<=arr.length-1; i++){
            
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        System.out.println(max);
        System.out.println(min);
    }
    public static void main(String args[]){
        int arr[] = {3, 5, 4, 1, 9};
        getMinMax(arr);
    }
        // Code Here
}