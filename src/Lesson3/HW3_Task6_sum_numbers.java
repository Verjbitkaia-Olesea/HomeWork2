package Lesson3;

import java.util.Scanner;

public class HW3_Task6_sum_numbers {
    public static void main(String[] args) {
        // 6. Write a program where the user enters any positive integer.
        //      The program then calculates the sum of all numbers from 1 to the number entered by the user.
        //      For example: if the user enters the number 3. The program should calculate the sum of numbers from 1 to 3, which is 1+2+3, and output the answer 6.

        // Taking a number from user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int n = input.nextInt();

        // To calculate the sum of all numbers from 1 to the number entered by the user
        int sum = 0;
        for (int i=1; i<=n; i++){
            sum +=i;
        }
        System.out.println("The sum of all numbers from 1 to " +n+ " = " + sum);


    }
}
