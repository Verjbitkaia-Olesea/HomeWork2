package Lesson2;

import java.util.Scanner;

public class HW2_Task1 {
    public static void main(String[] args) {
        // Task 1. Write a Java program to get a number from the user and print whether it is positive or negative.
        // Taking inputs from user
        Scanner number = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double nr = number.nextDouble();
        number.close();

        // Print whether the number is positive or negative or 0
        if (nr < 0) {
            System.out.println("The number is negative: " + nr);
        } else if (nr > 0) {
            System.out.println("The number is pozitive: " + nr);
        } else {
            System.out.println("The number is zero: " + nr);
        }
    }
}
