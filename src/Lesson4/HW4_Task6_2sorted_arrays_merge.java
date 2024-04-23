package Lesson4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class HW4_Task6_2sorted_arrays_merge {
    public static void main(String[] args) {
        // 6. Write a Java program to merge two sorted arrays into a single sorted array.

        // Enter elements of array
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of elements in the 1st array: ");
        int a1 = input.nextInt();
        int[] array1 = new int[a1];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Enter the element of the 1st array: ");
            array1[i] = input.nextInt();
        }
        System.out.println("Enter a number of elements in the 2nd array: ");
        int a2 = input.nextInt();
        int[] array2 = new int[a2];
        for (int j = 0; j < array2.length; j++) {
            System.out.println("Enter the element of the 2nd array: ");
            array2[j] = input.nextInt();
        }
        System.out.print("Array 1: ");
        System.out.println(Arrays.toString(array1));
        System.out.print("Array 2: ");
        System.out.println(Arrays.toString(array2));

        // to sort the 1st array in ascending order
        int asc = 0;
        for (int i = 0; i < array1.length - 1; i++) {
            if (array1[i] > array1[i + 1]) {
                asc = array1[i];
                array1[i] = array1[i + 1];
                array1[i + 1] = asc;
                i = -1;
            }
        }
        System.out.println("Sorted array1 in ascending order:");
        for (int i = 0; i < array1.length; i++) {
            //  System.out.print(array[i] + " ");
        }
        System.out.println(Arrays.toString(array1));

        // to sort the 2nd array in descending order
        int des = 0;
        for (int j = 0; j < array2.length - 1; j++) {
            if (array2[j] < array2[j + 1]) {
                des = array2[j];
                array2[j] = array2[j + 1];
                array2[j + 1] = des;
                j = -1;
            }
        }
        System.out.println("Sorted array 2 in descending order:");
        for (int j = 0; j < array2.length; j++) {
            //  System.out.print(array[j] + " ");
        }
        System.out.println(Arrays.toString(array2));

        // to merge two sorted arrays into a single sorted array
        int[]c = new int[array1.length+array2.length];
        int count = 0;

        for(int i = 0; i < array1.length; i++) {
            c[i] = array1[i];
            count++;
        }
        for(int j = 0; j < array2.length;j++) {
            c[count++] = array2[j];
        }
        System.out.println("A single merged array is: ");
        for(int i = 0;i < c.length;i++)
            System.out.print(c[i]+" ");

    }
}
