import java.util.Scanner;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static void printLeapYears(int start, int end) {
        System.out.println("ALL leap years: \n");
        for (int year = start; year <= end; year++) {
            if (isLeapYear(year)) {
                System.out.print(year + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start year: ");
        int start = sc.nextInt();
        System.out.print("Enter end year: ");
        int end = sc.nextInt();

        printLeapYears(start, end);

        sc.close();
    }
}
