package Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class HW4_Task1_array {
    public static void main(String[] args) {
        // 1.Write a Java program to reverse an array of integers.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of elements in array: ");
        int n = input.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        System.out.print("Original array: ");
        System.out.println(Arrays.toString(array));

        //Loop through the array in reverse order
        System.out.print("Array in reverse order: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

    }
}
