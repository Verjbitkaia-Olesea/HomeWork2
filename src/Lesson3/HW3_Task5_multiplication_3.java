package Lesson3;

import java.util.Scanner;

public class HW3_Task5_multiplication_3 {
    public static void main(String[] args) {
        // 5. Display on the screen the multiplication table for 3.

        // Taking a number from user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();

        // The multiplication table for 3
        System.out.println("The multiplication table for " + n + " : ");
        int i=1;
        while (i<=10){
            System.out.println(i+ " * " + n + " = " + i*n);
            i++;
        }

    }
}
