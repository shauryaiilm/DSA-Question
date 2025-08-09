// WAP that reads a number in meters converts it to feet and displays the result

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value in meters: ");
        double meters = sc.nextDouble();

        double feet = meters * 3.28084;

        System.out.println(meters + " meters is equal to " + feet + " feet.");

        sc.close();
    }
}