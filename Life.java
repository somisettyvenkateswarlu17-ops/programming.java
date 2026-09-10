import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        while (n-- > 0) {
            String type = sc.next();

            if (type.equals("HEALTH")) {
                double b = sc.nextDouble();
                int age = sc.nextInt();
                sc.nextInt();
                total += b + age * 10;
            } else {
                double b = sc.nextDouble();
                int term = sc.nextInt();
                double coverage = sc.nextDouble();
                total += b + (coverage / term) * 0.05;
            }
        }

        System.out.printf("Total Premium: %.2f", total);
    }
}
