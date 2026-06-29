package day10.activity;

import java.util.Scanner;

public class Activity6_Labicane {

    public static void main(String[] args) {
//Part 1: Create a Java program  that requires the use of the Scanner class.
//The program should ask the user to input which multiplication table they want to display.
//Only the chosen multiplication table will be shown (e.g., if the user inputs 5, only multiplication of 5 will be displayed).
        Scanner input = new Scanner(System.in);
        System.out.println("Input multiplication table you want to display");
        int number = input.nextInt();
        for (int i = 1; i <= 10 ; i++) {
            System.out.println( number + " x "+ i + " = " + (number * i));
            
        }
//        
        
        
         for (int i = 1; i <= 10; i++) {

            System.out.println("Multiplication Table of " + i);
           
            // Nested loop
            for (int num = 1; num <= 10; num++) {
                System.out.println(i + " x " + num + " = " + (i * num));
                
            }

            System.out.println();
        }
        
        
        
        
        
        
        
        
        
        
//        // Ask the user for a number
//        System.out.print("Enter the multiplication table you want to display: ");
//        int number = input.nextInt();
//
//        // Display the multiplication table
//        System.out.println("\nMultiplication Table of " + number);
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(number + " x " + i + " = " + (number * i));
//        }
//
//        input.close();
    }
}
