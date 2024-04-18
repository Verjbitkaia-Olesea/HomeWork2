package Lesson2;

import java.util.Scanner;

public class HW2_Task5 {
    public static void main(String[] args) {
        // Task 5.
        // There is a string "I love Java":
        //String text = "I love Java";
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String phrase = keyboard.nextLine();

        // a) Print the letter at index 4
        char fourthLetter = phrase.charAt(3);
        System.out.println("The letter at index 4 is: " + fourthLetter);

        // b) Print the index of the letter 'J'
        System.out.print("The index of the letter 'J' is: "+phrase.indexOf("J"));

        // c) Add "and QA Automation" to this phrase (resulting in "I love Java and QA Automation")
        System.out.println("\nEnter additional phrase: ");
        String add = keyboard.nextLine();
        System.out.println("New phrase is: " +phrase.concat(" "+add));

        // d) Check via boolean if the phrase "I love Java" is of type String

    }
}
