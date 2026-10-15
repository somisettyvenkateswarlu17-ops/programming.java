import java.util.Scanner; 
public class Main {    
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        int n = password.length();
        int lower = 0, upper = 0, digit = 0;
        for (int i = 0; i < n; i++) {
            char ch = password.charAt(i);
            if (ch >= 'a' && ch <= 'z')
                lower = 1;
            else if (ch >= 'A' && ch <= 'Z')
                upper = 1;
            else if (ch >= '0' && ch <= '9')
                digit = 1;
        }
        int missing = (1 - lower) + (1 - upper) + (1 - digit);
        int replace = 0;
        for (int i = 0; i < n - 2; i++) {
            if (password.charAt(i) == password.charAt(i + 1)
                    && password.charAt(i) == password.charAt(i + 2)) {
                replace++;
                i += 2;
            }
        }

        int result;
        if (n < 6) {
            result = Math.max(missing, 6 - n);
        } else if (n <= 20) {
            result = Math.max(missing, replace);
        } else {
            result = (n - 20) + Math.max(missing, replace);
        }
        System.out.println(result);
        sc.close();
    }
}
