package Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class HW4_Task5_array_spec_elem {
    public static void main(String[] args) {
        // 5.Write a Java program to search for a specific element in an array and return its index.

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

        // to search for a specific element in an array and return its index
        System.out.println("Enter a specific element of array: ");
        int e = input.nextInt();
        for (int i=0; i < array.length; i++){
            if (e == array[i]){
                System.out.println("The index of specified element is: " + i);
            }
        }
    }

}
