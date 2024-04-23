package Lesson3;

import java.util.Scanner;

public class HW3_Task2_switch_calculator {
    public static void main(String[] args) {
        // 2. Write a program to create simple calculator using switch statement.

        // Taking input from user
        Scanner input = new Scanner(System.in);
        // Enter numbers
        System.out.println("Enter first number: ");
        double n1 = input.nextDouble();
        System.out.println("Enter second number: ");
        double n2 = input.nextDouble();
        // Enter operator
        System.out.println("Enter Math operator (+, -, *, or /): ");
        char operator = input.next().charAt(0);

        // Create a simple calculator with Switch

        double cal;
        switch (operator) {
            // add numbers
            case '+':
                cal = n1 + n2;
                System.out.println(n1 + " + " + n2 + " = " + cal);
                break;

            // subtract numbers
            case '-':
                cal = n1 - n2;
                System.out.println(n1 + " - " + n2 + " = " + cal);
                break;

            // multiply numbers
            case '*':
                cal = n1 * n2;
                System.out.println(n1 + " * " + n2 + " = " + cal);
                break;

            // divide numbers
            case '/':
                cal = n1 / n2;
                System.out.println(n1 + " / " + n2 + " = " + cal);
                break;

            default:
                System.out.println("Choose correct Math operator");
                break;
        }


    }
}





