package day11.activity;

import java.util.Scanner;

public class Activity7_Labicane {

    public static void main(String[] args) {
//1. Create a Java program named Activity7_YourLastname.java.

//2. The program should:
//Declare a single‑dimensional array of 5 integers.
//Ask the user to input 5 numbers.
//Display all the numbers entered.
//Compute and display the sum and average of the numbers.
    
//3. Stretch Goal 🌟- After completing the above, enhance the program to:
//Find and display the highest number.
//Find and display the lowest number.

Scanner input = new Scanner(System.in);
        
        // 5 integers
        int[] numbers = new int[5];
        int sum = 0;
        
        // Ask the user input
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }
        
        System.out.println();
        
        // Entered numbers and Sum
        System.out.println("You entered");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("index" +" " + (i) + ":" + numbers[i] + " ");
            sum += numbers[i]; 
        }

        
        // Average
        double average = (double) sum / numbers.length; 
        
        //highest and lowest numbers
        
        int highest = numbers[0];
        int lowest = numbers[0];
        
        // Loop through the array to compare and update highest/lowest
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > highest) {
                highest = numbers[i]; 
            }
            if (numbers[i] < lowest) {
                lowest = numbers[i];  
            }
        }
        
        System.out.println();
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Highest Number: " + highest);
        System.out.println("Lowest Number: " + lowest);
        
        input.close();

        }
}

    
