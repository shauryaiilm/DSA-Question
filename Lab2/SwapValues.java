import java.util.Scanner;

public class SwapValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("First number: ");
        int a = sc.nextInt();
        System.out.print("Second number: ");
        int b = sc.nextInt();

        System.out.println("\nWithout Using 3rd Variable");
        System.out.println("Before swap: a = "+a+", b = "+b);

        a = a+b; 
        b = a - b; 
        a = a - b; 

        System.out.println("After swap:  a = "+a+", b = "+b);

        
        System.out.println("\nWith Using 3rd Variable");
        System.out.println("Before swap: a = "+a+", b = "+b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap:  a = "+a+", b = "+b);

        sc.close();
    }
}
