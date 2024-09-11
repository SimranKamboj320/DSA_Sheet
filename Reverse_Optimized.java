import java.util.*;

public class Reverse_Optimized{
    public static void Reverse(int arr[]){
        int n = arr.length-1;

        for(int i=0; i<n/2; i++){
            int temp = arr[i]; 
            arr[i] = arr[n-i];
            arr[n-i] = temp;
        }
        for(int i= 0; i<=n; i++){
            System.out.println(arr[i]);
        }

    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        Reverse(arr);
    }
}