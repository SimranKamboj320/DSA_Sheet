import java.util.*;

public class Count_String {
    //Function to arrange all letters of a string in lexicographical 
    //order using Counting Sort.
    public static String countSort(String arr)
    {
        int count[] = new int[26];
        
        for (int i = 0; i < arr.length(); i++) {
            count[arr.charAt(i) - 'a']++;
        }
        
        StringBuilder sortedString = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            // Append the character 'a' + i based on its frequency count[i]
            while (count[i] > 0) {
                sortedString.append((char) (i + 'a'));
                count[i]--;
            }
        }
        
        return sortedString.toString();
        // code here
    }
    public static void main(String args[]){
        String arr = "jdfbs";

        
        System.out.print(countSort(arr));
    }
}