import java.util.Scanner;

public class PrintWithoutDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] freq = new int[256];

        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        for (int i = 0; i < n; i++) {
            if (freq[arr[i]] > 1) {
                System.out.print(arr[i] + " ");
                freq[arr[i]] = 0;
            }
        }
    }
}
