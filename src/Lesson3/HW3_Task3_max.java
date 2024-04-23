package Lesson3;

import java.util.Scanner;

public class HW3_Task3_max {
    public static void main(String[] args) {
        // 3. Write a program to find the Maximum of Two Numbers using switch statement

        // Taking input from user
        Scanner input = new Scanner(System.in);
        // Enter numbers
        System.out.println("Enter first number: ");
        double n1 = input.nextDouble();
        System.out.println("Enter second number: ");
        double n2 = input.nextDouble();

        // find the Maximum of Two Numbers
        int max=0;
        if (n1>n2){
            max+=0;
        }
        else if (n1<n2){
            max+=1;
        }

        switch (max) {
            case 0:
                System.out.println("The first number is greater:" + n1);
                break;

            case 1:
                System.out.println("The second number is greater:" + n2);
                break;

            default:
                System.out.println("the numbers are equal");
                break;
        }


    }

}
