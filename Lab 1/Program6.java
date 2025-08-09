// Write a Java program that prints all real solutions to the quadratic equation 
// ax2+bx+c = 0. Read in a, b, c and use the quadratic formula. If the discriminate 
// b2-4ac is negative, display a message stating that there are no real solutions.

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Two real solutions: " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("One real solution: " + root);
        } else {
            System.out.println("There are no real solutions.");
        }

        sc.close();
    }
}