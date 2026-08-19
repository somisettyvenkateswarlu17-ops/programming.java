import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();

            int odd = 0;
            int even = 0;

            for (int i = 0; i < N; i++) {
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
    }
}
