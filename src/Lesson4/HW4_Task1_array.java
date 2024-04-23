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
        for (int i=0; i < array.length; i++) {
            System.out.println("Enter the element of array: ");
            array[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }
}
