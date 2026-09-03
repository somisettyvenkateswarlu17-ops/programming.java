import java.util.Scanner; // Import the Scanner class to read user input

public class FactorialCalculator {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        // Validate input
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1;
            
            // Loop to calculate the factorial
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            
            // Display the result
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
        
        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
