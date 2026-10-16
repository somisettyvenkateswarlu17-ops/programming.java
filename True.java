import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int n = str.length();
        boolean lower = false;
        boolean upper = false;
        boolean digit = false;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                lower = true;
            } else if (ch >= 'A' && ch <= 'Z') {
                upper = true;
            } else if (ch >= '0' && ch <= '9') {
                digit = true;
            }
        }
        int missing = 0;
        if (!lower) missing++;
        if (!upper) missing++;
        if (!digit) missing++;
        int replace = 0;
        int one = 0;
        int two = 0;
        for (int i = 0; i < n; ) {
            int j = i;
            while (j < n && str.charAt(j) == str.charAt(i)) {
                j++;
            }
            int len = j - i;
            if (len >= 3) {
                replace += len / 3;
                if (len % 3 == 0) {
                    one++;
                } else if (len % 3 == 1) {
                    two++;
                }
            }

            i = j;
        }
        int result;
        if (n < 6) {
            result = Math.max(missing, 6 - n);
        } else if (n <= 20) {
            result = Math.max(missing, replace);
        } else {
            int delete = n - 20;
            int remainingDelete = delete;
            int use = Math.min(remainingDelete, one);
            replace -= use;
            remainingDelete -= use;
            use = Math.min(remainingDelete, two * 2);
            replace -= use / 2;
            remainingDelete -= use;
            replace -= remainingDelete / 3;
            result = delete + Math.max(missing, replace);
        }
        System.out.println(result);
        sc.close();
    }
}
