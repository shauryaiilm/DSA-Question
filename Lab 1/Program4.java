// TODO: Write a program in Java to design simple calculator for (+, -, *, and /) using switch case

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        int operator = sc.nextInt();

        int result;

        switch (operator) {
            case 0:
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case 1:
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case 2:
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case 3:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default:
                System.out.println("Invalid operator!");
        }

        sc.close();
    }
}