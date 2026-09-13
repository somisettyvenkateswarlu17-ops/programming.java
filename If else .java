import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double sum = 0;

        for (int i = 0; i < n; i++)
            sum += sc.nextDouble();

        double avg = sum / n;

        System.out.printf("Average: %.2f\n", avg);

        if (avg >= 90) System.out.println("Grade: A+");
        else if (avg >= 80) System.out.println("Grade: A");
        else if (avg >= 70) System.out.println("Grade: B");
        else if (avg >= 60) System.out.println("Grade: C");
        else if (avg >= 50) System.out.println("Grade: D");
        else System.out.println("Grade: F");
    }
}
