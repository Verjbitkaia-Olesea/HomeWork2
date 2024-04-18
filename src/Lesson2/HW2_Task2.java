package Lesson2;

import java.util.Scanner;

public class HW2_Task2 {
    public static void main(String[] args) {
        // Task 2. Write a Java program that takes three numbers from the user and prints the greatest number.
        // Taking inputs from user
        Scanner numbers = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        double nr1 = numbers.nextDouble();
        System.out.print("Enter the 2nd number: ");
        double nr2 = numbers.nextDouble();
        System.out.print("Enter the 3rd number: ");
        double nr3 = numbers.nextDouble();

        // Print the greatest number
        if (nr1 > nr2 && nr1 > nr3){
            System.out.println("The greatest number is: " + nr1);
        }
        else if (nr2 > nr1 && nr2 > nr3){
            System.out.println("The greatest number is: " + nr2);
        }
        else {
            System.out.println("The greatest number is: " + nr3);
        }
    }
}
