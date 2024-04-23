package Lesson3;

import java.util.Scanner;

public class HW3_Task7_sequence_7 {
    public static void main(String[] args) {
        // 7. The program should display the following sequence on the screen:7 14 21 28 35 42 49 56 63 70 77 84 91 98.

        // Taking a number from user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();

        // The sequence of 7 on the screen:7 14 21 28 35 42 49 56 63 70 77 84 91 98
        System.out.print("The sequence of number " +n+ " :");
        int sum = 0;
        for (int i=1; i<=14; i++){
            sum +=n;
            System.out.print(" " + sum);
        }


    }

}
