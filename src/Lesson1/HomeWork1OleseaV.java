package Lesson1;

import java.util.Scanner;

public class HomeWork1OleseaV {
    public static void main(String[] args) {
        //Task1. Write a program to find square of a number.
        double n=7;
        double square_number=n*n;
        System.out.println("Square of a number " + n + " is: " + square_number);

        //Task2. Write a program to take two integer inputs from user and print sum and product of them.
        int a=5;
        int b=8;
        int suma=a+b;
        System.out.println("SUM " + a + " + " + b + " = " + suma);

        //Task3. Take side of a square from user and print area and perimeter of it.
        // Taking inputs from user
        Scanner side = new Scanner(System.in);

        System.out.print("Enter the Length of side of a square: ");
        double length = side.nextDouble();

        side.close();

        double area = length * length;
        double perimeter = 4 * length;

        System.out.println("Side of square: " + length);
        System.out.println("Area of square: " + area);
        System.out.println("Perimeter of square: " + perimeter);


    }
}
