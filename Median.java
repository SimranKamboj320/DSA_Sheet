import java.util.*;

public class Median{
    public static void MedianMerge(int arr1[], int arr2[]){
        
        int arr3[] = new int(arr1.length + arr2.length); 

        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);

        int n = arr3.length;

        Arrays.sort(arr3);

        //even
        if(n%2 == 0){
            int med1 = arr3[n/2];
            int med2 = arr3[mid1-1];
            return (median1 + median2)/2;
        }else{
            return arr3[n/2];
        }
    }
    public static void main(String args[]){
        arr1[] = {1,2,3};
        arr2[] = {6,2,4,5};

        int result = MedianMerge(arr1, arr2);
        System.out.println(result);
    }
}