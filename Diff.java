import java.util.*;

public class Diff{
    public static int Arr(int x , int n, int arr[]){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(Math.abs(arr[i] - arr[j]) == x){
                    return 1;
                }
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {1,2,4,5,5};
        int x = 2;
        int n = 4;

        int result = Arr(x, n, arr);
        System.out.println(result);
    }
}