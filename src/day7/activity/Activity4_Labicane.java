
package day7.activity;
import java.util.Scanner;
public class Activity4_Labicane {
   public static void main(String[] args) {
       
//If the user enters 1, print "You selected Option 1: Start Game".
//If the user enters 2, print "You selected Option 2: Load Game".
//If the user enters 3, print "You selected Option 3: Settings".
//If the user enters 4, print "You selected Option 4: Exit".
//For any other number, print "Invalid choice. Please try again.".

        Scanner input = new Scanner(System.in);
        System.out.println("\t ===Main Menu ===  ");
        System.out.println("1. Start Game");
        System.out.println("2. Load Game");
        System.out.println("3. Setting");
        System.out.println("4. Exit");
        System.out.println("Enter Your Choice (1-4):");
        int choice = input.nextInt();
        
        if (choice == 1) {System.out.println("You selected Option 1: Start Game");}
        else if (choice == 2) {System.out.println("You selected Option 2: Load Game");}
        else if (choice == 3) {System.out.println("You selected Option 3: Settings");}
        else if (choice == 4) {System.out.println("You selected Option 4: Exit");}
        else {System.out.println("In Valid Choice. Please try again");}
        }
        
        

    }

