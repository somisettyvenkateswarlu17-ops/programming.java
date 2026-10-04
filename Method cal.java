import java.util.Scanner;
class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int B = sc.nextInt();
        int H = sc.nextInt();
        int C = sc.nextInt();
        int ans = Math.min(B / 2, H + C);
        System.out.println(ans);
    }
}
