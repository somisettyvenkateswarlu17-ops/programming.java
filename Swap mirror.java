import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[2 * N];

            for (int i = 0; i < 2 * N; i++) {
                A[i] = sc.nextInt();
            }

            int sum = 0;

            for (int i = 0; i < N; i++) {
                sum += Math.max(A[i], A[2 * N - 1 - i]);
            }

            System.out.println(sum);
        }
    }
}
