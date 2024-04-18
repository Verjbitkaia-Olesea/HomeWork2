package Lesson2;

import java.util.Scanner;

public class HW2_Task4 {
    public static void main(String[] args) {
        // Task 4. Write a program in Java to input 5 numbers from the keyboard and find their sum and average.
        // Taking inputs from user
        Scanner numbers = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        double n1 = numbers.nextDouble();
        System.out.print("Enter the 2nd number: ");
        double n2 = numbers.nextDouble();
        System.out.print("Enter the 3rd number: ");
        double n3 = numbers.nextDouble();
        System.out.print("Enter the 4th number: ");
        double n4 = numbers.nextDouble();
        System.out.print("Enter the 5th number: ");
        double n5 = numbers.nextDouble();

        // Find their sum and average
        double sum = n1+n2+n3+n4+n5;
        System.out.println("The sum is: ");
        System.out.println(n1+" + "+n2+ " + "+n3+" + "+n4+" + "+n5+" = "+sum);

        double average = sum/5;
        System.out.println("The average is: " + average);

    }
}
