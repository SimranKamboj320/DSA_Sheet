import java.util.Scanner;

public class Deloitte {

    public static void main(String[] args) {
        int n, p, ans = 0, m = Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            p = sc.nextInt();
            if (p < m) {
                m = p;
                ans++;
            }
        }
        System.out.print("Answer is: ");
        System.out.println(ans - 1);
        sc.close();  // Closing the scanner
    }
}
