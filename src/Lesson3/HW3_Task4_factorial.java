package Lesson3;

import java.util.Scanner;

public class HW3_Task4_factorial {
    public static void main(String[] args) {
        // 4. Write a Java program that calculates the factorial of a given non-negative integer using a while loop. The factorial of a non-negative integer n, denoted by n!, is the product of all positive integers less than or equal to n.
        //    Example: For input n = 5, the factorial is calculated as 5! = 5 * 4 * 3 * 2 * 1 = 120.

        // Taking input from user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the factorial number (non-negative integer): ");
        int n = input.nextInt();
        //if (n<=0){
        //    System.out.println("Enter other number which is non-negative integer: ");
        //   int n1 = input.nextInt();
        //}

        // to calculate the factorial of a given non-negative integer
        int i=1;
        int factorial=1;
        //while (i<=n || i<=n1){
        while (i<=n){
            factorial=factorial*i;
            i++;
        }
        System.out.println("The factorial of number " + n + "! = " + factorial);

    }

}
