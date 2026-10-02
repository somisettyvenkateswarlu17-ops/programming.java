import java.util.Scanner;
class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] a = new int[N];
            for (int i = 0; i < N; i++)
                a[i] = sc.nextInt();
            int ans = N;
            for (int i = 0; i < N; i++) {
                int count = 0;
                for (int j = 0; j < N; j++) {
                    if (a[j] - j == a[i] - i)
                        count++;
                }
                ans = Math.min(ans, N - count);
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
