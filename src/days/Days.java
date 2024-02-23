// Days.java
package days;

import java.util.Scanner;

public class Days {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the day number (1-7) in integer");
        int code = in.nextInt();

        if (code >= 1 && code <= 7) {
            Weekdays t = Weekdays.values()[code - 1];
            System.out.println("Day: " + t);
        } else {
            System.out.println("Invalid day number. Please enter a number between 1 and 7.");
        }
    }
}