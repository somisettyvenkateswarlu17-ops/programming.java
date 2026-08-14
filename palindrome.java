import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int s = scan.nextInt();
        int l = scan.nextInt();
        int r = scan.nextInt();

        if (r == 1) {
            System.out.println("WARNING");
        }
        else if (s <= l) {
            System.out.println("SAFE");
        }
        else {
            int excess = s - l;

            if (excess <= 10) {
                System.out.println("WARNING");
            }
            else if (excess <= 30) {
                System.out.println("FINE 1000");
            }
            else {
                System.out.println("FINE 3000");
            }
        }
    }
}
