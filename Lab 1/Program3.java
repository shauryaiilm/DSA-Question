
import java.util.Scanner;


public class Program3 {
    public static void main(String[] args) {
        System.out.print("Enter number a: ");
        Scanner aScanner = new Scanner(System.in);
        int a = aScanner.nextInt();

        System.out.print("\nEnter number b: ");
        Scanner bScanner = new Scanner(System.in);
        int b = bScanner.nextInt();

        System.out.println("Sum: "+ (a+b));

        aScanner.close();
        bScanner.close();
    }
}
