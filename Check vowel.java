import java.util.Scanner;

public class Sol {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char ch = scan.next().charAt(0);

        if (ch == 'a' || ch == 'A' ||
            ch == 'e' || ch == 'E' ||
            ch == 'i' || ch == 'I' ||
            ch == 'o' || ch == 'O' ||
            ch == 'u' || ch == 'U') {
            
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}
