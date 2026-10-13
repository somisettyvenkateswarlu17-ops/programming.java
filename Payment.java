import java.util.Scanner;
public class Sol {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        if (m1 >= 40 && m2 >= 40 && m3 >= 40) {
            System.out.print("PASS");
        }
        else if (
            ((m1 >= 35 && m1 < 40 && m2 >= 40 && m3 >= 40) ||
             (m2 >= 35 && m2 < 40 && m1 >= 40 && m3 >= 40) ||
             (m3 >= 35 && m3 < 40 && m1 >= 40 && m2 >= 40))
            && m1 + m2 + m3 >= 150
        ) {
            System.out.print("GRACE PASS");
        }
        else {
            System.out.print("FAIL");
        }

        sc.close();
    }
}
