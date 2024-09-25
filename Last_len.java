import java.util.*;

public class Last_len {
    public static void lengthOfLastWord(String s) {
        int n = s.length();
        int count = 0;

        for(int i =n-1; i>=0; i--){
            if(s.charAt(i) == ' ' && count > 0){
                break;
            }else if(s.charAt(i) != ' '){
                count++;
            }   
        }
        System.out.println(count);
    }    
    public static void main(String args[]){
        String s = "Hello World     ";
        lengthOfLastWord(s);
    }
}