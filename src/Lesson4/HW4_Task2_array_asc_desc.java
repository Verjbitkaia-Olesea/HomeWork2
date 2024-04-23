package Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class HW4_Task2_array_asc_desc {
    public static void main(String[] args) {
        // 2.Write a Java program to sort an array of integers in ascending and descending order.

        // Enter elements of array
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of elements in array: ");
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i=0; i < array.length; i++) {
            System.out.println("Enter the element of array: ");
            array[i] = input.nextInt();
        }
        // for (int i=0; i<array.length; i++){
        //    System.out.println(array[i] + " ");}
        System.out.println("Original array:");
        System.out.println(Arrays.toString(array));

        // to sort an array of integers in ascending order
        int a = 0;
        for (int i=0; i<array.length-1; i++){
            if (array[i] > array[i+1]){
                    a = array[i];
                    array[i] = array[i+1];
                    array[i+1] = a;
                    i = -1;
                }
            }
        System.out.println("Sorted array in ascending:");
        for (int i=0; i<array.length; i++) {
        //  System.out.print(array[i] + " ");
        }
        System.out.println(Arrays.toString(array));

        // to sort an array of integers in descending order
        int d = 0;
        for (int i=0; i<array.length-1; i++){
            if (array[i] < array[i+1]){
                d = array[i];
                array[i] = array[i+1];
                array[i+1] = d;
                i = -1;
            }
        }
        System.out.println("Sorted array in descending:");
        for (int i=0; i<array.length; i++) {
        //  System.out.print(array[i] + " ");
        }
        System.out.println(Arrays.toString(array));
    }

}
