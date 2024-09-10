import java.util.*;

public class DuplicateString{
    public static void Duplicate(String str){
        int len = str.length();

        char chars[] = str.toCharArray();
        Arrays.sort(chars);
        String substr = new String(chars);

        for(int i=0; i<len; i++){
            int count = 1;

            while(i<len-1 && substr.charAt(i) == substr.charAt(i+1)){
                i++;
                count++;
            }
            if (count > 1) {
                System.out.println(substr.charAt(i) + ", count = " + count);
            }
        }

    }
    public static void main(String args[]){
        String str = "adwfsadfaas";
        Duplicate(str);
    }
}