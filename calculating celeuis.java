import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float fahrenheit = scan.nextFloat();
        float celsius = (fahrenheit - 32) * 5 / 9;

        System.out.printf("%.5f", celsius);
    }
}
