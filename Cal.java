import java.util.Scanner;
public class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int odd = 0;
            int even = 0;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x % 2 == 0)
                    even++;
                else
                    odd++;
            }
            int ans = 2 * Math.min(odd, even);
            if (odd != even)
                ans++;
            System.out.println(ans);
        }
        sc.close();
    }
}
