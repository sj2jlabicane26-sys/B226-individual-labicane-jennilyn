package day9.activity;

import java.util.Scanner;

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
//
//            sum += i;
//            System.out.println("i = " + i + ", sum = " + sum);

        }
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
            System.out.println("product = " + product);
        }
//  Activity 5.3 – Arithmetic Sequence (Sum Only)  
//  👉 Objective: Introduce arithmetic progression and updating terms (current).
//
//Task: Write a Java program that prints the first N terms of an arithmetic sequence and computes their sum.
//
//Example: startNumber = 1, commonDifference = 5, n = 5, output should be:
//1 + 6 + 11 + 16 + 21 = 55    

//        int startNumber = 1;
//        int commonDifference = 5;
//        int n = 5;
//
//        Scanner input = new Scanner (System.in);
//        System.out.println("Enter a number:");
//        int num = input.nextInt();
//        
//        for (int i = 1; i <= num; i++) {
//            startNumber += commonDifference ;
    }

}
//        System.out.println("Arithmetic sequence:");
//        for (int start : sequence) {
//            System.out.println(start + " ");
//Activity 5.4 – Arithmetic Sequence (Sum and Product)  
//  👉 Objective: Combine both sum and product in the arithmetic sequence.
//
//Task: Write a Java program that prints the first N terms of an arithmetic sequence, shows the process, and computes both sum and product. 
//Example: startNumber = 1, commonDifference = 10, n = 10, output should be:   
//Sum: 1 + 6 + 11 + 16 + 21 + 26 + 31 + 36 + 41 + 46 = 235
//Product: 1 * 6 * 11 * 16 * 21 * 26 * 31 * 36 * 41 * 46 = 1213563326976
//        int startNum = 1;
//        int commonDif = 5;
//        int N = 10;
//        long[] terms = new long[10];
//        String[] processes = new String[10];
//        
//        for (int i = 0; i < 10; i++) {
//            terms[i] = startNum + ((long) i * commonDif);
//            processes[i] = startNum + " + (" + i + " * " + commonDif + ")";
//        }
//        
//        long sum = 0;
//        for (long term : terms) {
//            sum += term;
//        }
//        
//        BigInteger product = BigInteger.ONE;
//        for (long term : terms) {
//            product = product.multiply(BigInteger.valueOf(term));
//        }
//        
//        System.out.println("--- Arithmetic Sequence Generation ---");
//        for (int i = 0; i < 10; i++) {
//            System.out.printf("Term %2d: %s = %d%n", (i + 1), processes[i], terms[i]);
//           
//        }
//        
//        System.out.println("\n--- Final Results ---");
//        System.out.print("Sequence: [");
//        for (int i = 0; i < 10; i++) {
//            System.out.print(terms[i] + (i < 10 - 1 ? ", " : ""));
//        }
//        System.out.println("]");
//        
//        System.out.println("Total Sum: " + sum);
//        System.out.println("Total Product: " + product);
//            int[] productnum = new int[10];
//
//            for (int i = 1; i < 10; i++) {
//                productnum[i] = startNum;
//                startNum *= commonDif;
//
//            }
//            System.out.println("Product Arithmetic sequence:");
//            for (int productresult : productnum) {
//                System.out.println(productresult + " ");
}
}
