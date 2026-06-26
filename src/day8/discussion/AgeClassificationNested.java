package day8.discussion;

import java.util.Scanner;

public class AgeClassificationNested {

    public static void main(String[] args) {
        /*
        Age: 0 - 12 -> Child
                 Age: 0 - 5 -> Specifically, Toddler
                 Age: 6 - 12-> Specifically, Pre-Teen
        Age: 13 - 19 -> Teenager
                Age: 13 - 15 -> Specifically, Early Teen
                Age: 16 - 19 -> Specifically, Late Teen
        Age: 20 -59 -> Adult
                Age: 20 - 35 -> Specifically, Young Adult
                Age: 36 - 59 -> Specifically, Middle-Aged
         Age: 60 - 120 -> Senior Citizen
                 Age: 60 - 75 -> Specifically, Young Senior
                 Age: 76 - 120 -> Specifically, Elderly
        Invalid age -> Invalid input
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter age:");
        int age = input.nextInt();
        // Nested use for Validation

        if (age >= 0 && age <= 120) {

            if (age <= 12) { // 0 - 12
                System.out.println("You are a child"); // inner if block
                if (age <= 5) { // toddler
                    System.out.println("Specifically, you are Toddler");
                } else {
                    System.out.println("Specifically, you are a Pre-Teen");
                }
            } else if (age <= 19) { // 13 - 19
                System.out.println("You are teenager");
                if (age <= 15) // Early Teen
                {
                    System.out.println("Specifically, you are Early Teen");
                } else {
                    System.out.println(" Specifically, you are Late Teen");
                }
            } else if (age <= 59) { // 20 - 59
                System.out.println("You are adult");
                if (age <= 35) { // Young Adult
                    System.out.println("Specifically, you are Young adult");
                } else {
                    System.out.println("Specifically, you are Mid-dle Aged");
                }
            } else if (age <= 120) { // 60 - 120 
                System.out.println("You are Senior citizen");
                if (age <= 75) { // Young Senior
                    System.out.println("Specifically, you are Young Senior");
                }
            } else {
                System.out.println("Specifically, Elderly");
            }

        } else {
            System.out.println("Invalid Age Entered");
        }

//        if (age <= 12) { // 0 - 12
//            System.out.println("You are a child"); // inner if block
//            if (age <= 5) { // toddler
//                System.out.println("Specifically, you are Toddler");
//            } else {
//                System.out.println("Specifically, you are a Pre-Teen");
//            }
//        } else if (age <= 19) { // 13 - 19
//            System.out.println("You are teenager");
//            if (age <= 15) // Early Teen
//            {
//                System.out.println("Specifically, you are Early Teen");
//            } else {
//                System.out.println(" Specifically, you are Late Teen");
//            }
//        } else if (age <= 59) { // 20 - 59
//            System.out.println("You are adult");
//            if (age <= 35) { // Young Adult
//                System.out.println("Specifically, you are Young adult");
//            } else {
//                System.out.println("Specifically, you are Middle Aged");
//            }
//        } else if (age <= 120) { // 60 - 120 
//            System.out.println("You are Senior citizen");
//            if (age <= 75) { // Young Senior
//                System.out.println("Specifically, you are Young Senior");
//            }
//        } else {
//            System.out.println("Specifically, Elderly");
//        }
        // code minimization
    }

}
