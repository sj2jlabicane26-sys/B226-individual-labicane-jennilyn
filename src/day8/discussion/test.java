
package day8.discussion;
import java.util.Scanner;
        
public class test { public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = input.nextInt();
        // Validation

        if (age >= 0 && age <= 120) {
            
        } else {
            System.out.println("Invalid Age Entered.");
        }
        
        
        
        
        if (age <= 12) { // 0 - 12  - outer if 
                System.out.println("You are a child");
                if (age <= 5) { // toddler - inner if
                    System.out.println("Specifically, you are Toddler.");
                } else {
                    System.out.println("Specifically, you are Pre-Teen.");
                }
            } else if (age <= 19) { // 13 - 19
                System.out.println("You are teenager");
            } else if (age <= 59) { // 20 - 59
                System.out.println("You are adult");
            } else if (age <= 120) { // 60 - 120
                System.out.println("You are senior citizen");
            } 

    }
    
}
