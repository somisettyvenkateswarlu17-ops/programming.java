package day4;

import java.util.Scanner;

public class HourGlass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scan.next();

        int limit = name.length();

        // Upper half
        for (int row = limit / 2; row >= 0; row--) {

            for (int space = limit / 2; space > row; space--)
                System.out.print(" ");

            for (int column = 0; column <= row * 2 && column < limit; column++)
                System.out.print(name.charAt(column));

            System.out.println();
        }

        // Lower half
        for (int row = 1; row <= limit / 2; row++) {

            for (int space = limit / 2; space > row; space--)
                System.out.print(" ");

            for (int column = 0; column <= row * 2 && column < limit; column++)
                System.out.print(name.charAt(column));

            System.out.println();
        }

        scan.close();
    }
}
