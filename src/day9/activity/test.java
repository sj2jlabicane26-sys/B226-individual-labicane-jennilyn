package day9.activity;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
// Activity 5.1 -   Summation of 1 to N
//  👉 Objective: Learn to update a variable (sum) inside a loop. 
//
//Task: Write a Java program that computes the sum of numbers from 1 up to N. 
// Example: If N = 5, output should be: 
//i = 1, sum = 1 
//i = 2, sum = 3 
//i = 3, sum = 6 
//i = 4, sum = 10
//i = 5, sum = 15 
//Final Sum: 15  

        int sum = 0;
        for (int i = 1; i <= 5; i++) {

            sum += i;
            System.out.println("i = " + i + ", sum = " + sum);
        }
        System.out.println("Final Sum: " + sum);
//   Activity 5.2 - Product of 1 to N
//  👉 Objective: Learn to update a variable (product) inside a loop.  
//
//  Task: Write a Java program that computes the product of numbers from 1 up to N.  
//  Example: If N = 5, output should be:
//
//i = 1, product = 1
//i = 2, product = 2
//i = 3, product = 6 
//i = 4, product = 24
//i = 5, product = 120 
//Final Product: 120
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
            System.out.println("i = " + i + ", product = " + product);
           }  System.out.println("Final Product: " + product);
//           Activity 5.3 – Arithmetic Sequence (Sum Only)  
//  👉 Objective: Introduce arithmetic progression and updating terms (current).
//
//Task: Write a Java program that prints the first N terms of an arithmetic sequence and computes their sum.
//
//Example: startNumber = 1, commonDifference = 5, n = 5, output should be:
//1 + 6 + 11 + 16 + 21 = 55    
        int startNumber = 1;
        int commonDifference = 5;
        int n = 5;

        int sumOnly = 0;
        
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number:");
//        int num = input.nextInt();
        
        for (int i = 1; i <= 5; i++) {
            System.out.print( startNumber + " ");
            sumOnly += startNumber;
            startNumber += commonDifference;
        } System.out.println(" = " + sumOnly); 
//Activity 5.4 – Arithmetic Sequence (Sum and Product)  
//  👉 Objective: Combine both sum and product in the arithmetic sequence.
//
//Task: Write a Java program that prints the first N terms of an arithmetic sequence, shows the process, and computes both sum and product. 
//Example: startNumber = 1, commonDifference = 10, n = 10, output should be:   
//Sum: 1 + 6 + 11 + 16 + 21 + 26 + 31 + 36 + 41 + 46 = 235
//Product: 1 * 6 * 11 * 16 * 21 * 26 * 31 * 36 * 41 * 46 = 1213563326976
        int startNum = 1;
        int commonDif = 5;
        int N = 10;
        int totalSum = 0;
        for (int i = 1; i <= N; i++) {
            System.out.print(startNum + " ");
            totalSum += startNum;
            startNum += commonDif;
            
        } System.out.println(" = " + totalSum);

        int startN = 1;
        int commonD = 5;
        int num = 10;
        long totalProduct = 1;

        for (long i = 1; i <= num; i++) {
            System.out.print(startN + " ");
            totalProduct *= startN;
            startN += commonD;
        }
        System.out.println(" = " + totalProduct);

    }
}
