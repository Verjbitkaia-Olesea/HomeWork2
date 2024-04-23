package Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class HW4_Task4_array_avg {
    public static void main(String[] args) {
        // 4. Write a Java program to calculate the average of all elements in an integer array.

        // Enter elements of array
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of elements in array: ");
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i=0; i < array.length; i++) {
            System.out.println("Enter the element of array: ");
            array[i] = input.nextInt();
        }
        System.out.println("Original array:");
        System.out.println(Arrays.toString(array));

        // To calculate the average of all elements in an integer array
        int sum = 0;
        for (int i=0; i<array.length; i++) {
            sum += array[i];
        }
        double avg = sum/n;
        System.out.println("The average of all elements in array = " + avg);


    }

}
