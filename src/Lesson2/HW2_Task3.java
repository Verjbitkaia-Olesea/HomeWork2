package Lesson2;

import java.util.Scanner;

public class HW2_Task3 {
    public static void main(String[] args) {
        // Task 3. Write a Java program that takes a year from the user and prints whether it is a leap year or not.
        // Taking input from user
        Scanner year = new Scanner(System.in);
        System.out.print("Enter a year, please: ");
        int y = year.nextInt();

        // Print whether the year is a leap year or not
        boolean a = (y % 4) == 0;
        boolean b = (y % 100) != 0;
        boolean c = ((y % 100 == 0) && (y % 400 == 0));

        if (a && (b || c))
        {
            System.out.println(y + " is a leap year");
        }
        else
        {
            System.out.println(y + " is not a leap year");
        }

    }
}
