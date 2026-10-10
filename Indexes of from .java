import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            String S = sc.next();
            String L = sc.next();
            int current = 0;
            int max = 0;
            char prev = ' ';
            for (char c : S.toCharArray()) {
                char hand = L.indexOf(c) != -1 ? 'L' : 'R';
                if (hand == prev)
                    current++;
                else {
                    current = 1;
                    prev = hand;
                }
                max = Math.max(max, current);
            }
            System.out.println(max);
        }
        sc.close();
    }
}
