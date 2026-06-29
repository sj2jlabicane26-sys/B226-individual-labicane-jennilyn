package day10.discussion;

import java.util.Scanner;

public class doWhile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // When to use Do - while : if you must have to execute the loop at least once
        String color = "Black";
        do {
            System.out.println(color);
        }
        while (color.equals("white")); {
          
            
        }
        
        
        // Syntax
        // infinite loop / has no fixed of itereations
//        int choice;
//        choice = input.nextInt();
//
//        while (choice != 4){
//            System.out.println("=== Main Menu ===");
//            System.out.println("    [1] Start Game");
//            System.out.println("    [2] Load Game");
//            System.out.println("    [3] Settings");
//            System.out.println("    [4] exit");
//            System.out.println("Enter your choice:");
//            choice = input.nextInt();
//        } 
        
        
        
        
        
        
//        
//        int choice;
//
//        do {
//            System.out.println("=== Main Menu ===");
//            System.out.println("    [1] Start Game");
//            System.out.println("    [2] Load Game");
//            System.out.println("    [3] Settings");
//            System.out.println("    [4] exit");
//            System.out.println("Enter your choice:");
//            choice = input.nextInt();
//        } while (choice !=4); // Keep looping until user choosen
//        
//        input.close(); // close the Scanner to free resources

        // Common Real-World Uses of DO while
        /*
            Menu-driven programs
            User input validation
            Repetitive Task with guarenteed first run -> Do you want to continue
         */
    }
}
