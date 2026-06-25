
package day7.discussion;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // Instantiation create object of Scanner
        Scanner input = new Scanner (System.in);
        System.out.print("Enter name:");
        String name = input.nextLine (); // String input
        
        System.out.print("Enter age:"); // int input
        int age = input.nextInt();
        
        System.out.print("Enter salary:");
        double salary = input.nextDouble(); // dounle input
        
        // Output input by user
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Salary:" + salary);
        
    }
    
}
