 /
package day9.activity;



public class Activity5_Labicane {

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

//        int sum = 0;
//        for (int i = 1; i <= 5; i++) {
//            sum += i;
//
//            System.out.println("sum = " + sum);
//        }

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
//        int product = 1;
//        for (int i = 1; i <= 5; i++) {
//            product *= i;
//
//            System.out.println("product = " + product);
//        }

//  Activity 5.3 – Arithmetic Sequence (Sum Only)  
//  👉 Objective: Introduce arithmetic progression and updating terms (current).
//
//Task: Write a Java program that prints the first N terms of an arithmetic sequence and computes their sum.
//
//Example: startNumber = 1, commonDifference = 5, n = 5, output should be:
//1 + 6 + 11 + 16 + 21 = 55  
        int startNumber = 1;
        int commonDifference = 5;
        int n = 5;
        int sUM = 1;
        for (int i = 1; i <= n; i++) {
            if (i < n - 1);{
            System.out.println("+");
        }
            sUM += commonDifference; {
            System.out.println("=" + sUM);
        }
           

        }
    }
}
