package year_check;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        // Call the method to check for leap year
        checkLeapYear();
    }

    // Method to ask user for year and check if it's a leap year
    public static void checkLeapYear() {
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter a year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year using the rules
        boolean isLeap;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeap = true;
        } else {
            isLeap = false;
        }

        // Output result
        if (isLeap) {
            System.out.println("The year you entered is a leap year.");
        } else {
            System.out.println("The year you entered is NOT a leap year.");
        }
    }
}
