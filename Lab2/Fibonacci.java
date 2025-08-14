import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask for number of terms
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();
        
        // Print the Fibonacci series
        System.out.println("Fibonacci Series:");
        printFibonacci(n);
        
        scanner.close();
    }

    // Non-recursive method
    public static void printFibonacci(int n) {
        int first = 0, second = 1;

        // Handle edge cases
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            
            // Calculate next term
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
}
