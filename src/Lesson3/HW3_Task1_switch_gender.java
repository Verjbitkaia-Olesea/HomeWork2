package Lesson3;

public class HW3_Task1_switch_gender {
    public static void main(String[] args) {
        // 1. Write a program to read gender (M/F) and print the corresponding gender using a switch statement.

        String gender = "M";
        switch (gender){
            case ("M"):
                System.out.println("Gender identity is: Male");
                break;
            case ("F"):
                System.out.println("Gender identity is: Female");
                break;
            default:
                System.out.println(false);
        }
    }




}
