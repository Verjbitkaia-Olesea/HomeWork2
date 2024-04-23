package Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class HW4_Task3_intersection_2arrays {
    public static void main(String[] args) {
        // 3.Write a Java program to find the intersection of two arrays (common elements).
        // Enter elements of array
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of elements in the 1st array: ");
        int a1 = input.nextInt();
        int[] array1 = new int[a1];
        for (int i=0; i < array1.length; i++) {
            System.out.println("Enter the element of the 1st array: ");
            array1[i] = input.nextInt();
        }
        System.out.println("Enter a number of elements in the 2nd array: ");
        int a2 = input.nextInt();
        int[] array2 = new int[a2];
        for (int j=0; j < array2.length; j++) {
            System.out.println("Enter the element of the 2nd array: ");
            array2[j] = input.nextInt();
        }
        System.out.print("Array 1: ");
        System.out.println(Arrays.toString(array1));
        System.out.print("Array 2: ");
        System.out.println(Arrays.toString(array2));

        // Find the intersection of two arrays (common elements)
        System.out.print("Common elements: ");
        for (int i=0; i<array1.length; i++){
            for (int j=0; j<array2.length; j++){
                if (array1[i]==array2[j])
                System.out.print(array1[i]+" ");
            }
        }


    }

}
