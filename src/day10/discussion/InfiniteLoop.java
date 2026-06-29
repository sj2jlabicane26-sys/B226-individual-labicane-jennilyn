package day10.discussion;

import java.util.Scanner;

public class InfiniteLoop {

    public static void main(String[] args) {

       
 

        // Program for ATM PIN Entry -> max attempts 3
        Scanner input = new Scanner(System.in);

        int maxAttempts = 5;

        int pin = 123456; // registered pin / PIN set in the system
        int enteredPin;

        System.out.println("* Welcome to BDO *");
        
        boolean accessGranted = false; // Flag to track if PIN is correct

        // Allow up to 3 attempts
        for (int attempt = 1; attempt <= 3; attempt++) {
            System.out.print("Enter your PIN! (Attempt "  + attempt + " of 3): "); // Feedback if wrong
            enteredPin = input.nextInt(); // Read new input
            
            if (pin != enteredPin) {

                System.out.print("\nIncorrect PIN. "); 
                
            } else {
                System.out.println("\nAccess Granted!");
                accessGranted = true;
                break; // Exit the loop immediately
            }
        }
        
        
        // After loop, check if access was granted
        if (false) {
            System.out.println("Too many failed attempts. Your account is locked");
        }

        input.close(); // Close the Scanner to free resources

        // If the loop ends, it means the PIN is correct
        //System.out.println("Access Granted!");

            // syntax of while loop
////        int counter = 1;
////        while (true) {
////            System.out.println(counter + "Hello");
////            counter++;
////        }
//
//        // print your name 10 times using while loop
////        int i = 0;
////        while (i < 10){
////            System.out.println("Winter");
////            i++;
////        }
//        // Program for ATM PIN Entry
//        Scanner input = new Scanner(System.in);
//
//        int pin = 123456; // registered pin // PIN set in the system
//        int enteredPin;
//
//        System.out.print("Enter your PIN"); // Ask the user to input a PIN
//        enteredPin = input.nextInt(); // Read the PIN entered by the user
//
////      if you want repeating use while
////      Validation check: compared entered PIN with the correct PIN
////      Keep asking until the user enters the correct PIN
//        while (pin != enteredPin) {
//            System.out.println("Incorrect PIN! Try again"); // Feedback if wrong
//            System.out.println("Enter your Pin: "); // Prompt again
//            enteredPin = input.nextInt(); // Read new input
//        }
//        // if the loops end, it means the PIN is correct
//        System.out.println("Access Grantend");
//        input.close(); // close the Scanner to free resources
//
//        
//        
//        //if kapag isa lang babalik
////        if (pin == enteredPin) {
////            System.out.println("Access granted");
////        }
////        if (pin != enteredPin) {
////            System.out.println("Access granted");
//        }
        

    }
}
