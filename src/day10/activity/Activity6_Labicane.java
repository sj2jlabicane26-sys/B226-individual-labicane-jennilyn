package day10.activity;

import java.util.Scanner;

public class Activity6_Labicane {

    public static void main(String[] args) {
//Part 1: Create a Java program  that requires the use of the Scanner class.
//The program should ask the user to input which multiplication table they want to display.
//Only the chosen multiplication table will be shown (e.g., if the user inputs 5, only multiplication of 5 will be displayed).
        Scanner input = new Scanner(System.in);
        System.out.print("Input multiplication table you want to display:");
        int number = input.nextInt();
        for (int i = 1; i <= 10 ; i++) {
            System.out.println( number + " x "+ i + " = " + (number * i));
            
        } input.close ();
        
// Part 2: Create another Java program 
//(in a separate class) that displays multiplication tables using Nested For Loops.
//The output should clearly label each table (e.g., "Multiplication Table of 2).
//  Each table should list the multiples from 1 up to 10(e.g., 2 x 1 = 2, 2 x 2 = 4, … , 2 x 10 = 20).       
        
         for (int i = 1; i <= 10; i++) {

            System.out.println("Multiplication Table of " + i);
           
            // Nested loop
            for (int num = 1; num <= 10; num++) {
                System.out.println(i + " x " + num + " = " + (i * num));
                
            }

            System.out.println();
        }
        
        
        
        
        
 
    }
}
