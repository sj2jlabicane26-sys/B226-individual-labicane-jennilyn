package day9.discussion;
import java.util.Scanner;
public class ForLoopStatement {

    public static void main(String[] args) {

        // Mini-Activity:Calculates the product of numbers from 1 to 5
       Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = input.nextInt();
        int product = 1;
        for (int i = 1; i <= num; i++)  
        {                   //5
           product = product * i; // or use product *=i;
        }  // 1 * 2 * 3 * 4 * 5 * = 120
        {
            System.out.println("Product:" + product); // print sum

           
           
          
           //check if the number is even
           // Print the first even numbers
            for (int i = 1; i <= 10; i++){
                if (i % 2 == 0){
                    System.out.println(i);
                }
            }
    }
    }
}
        

    

//        for (int i = 0; i <= 10; i++) {
//            System.out.println(i + 1 +"Winter");}
    // calculates the sum of numbers from 1 to 5:
//        int sum = 0;
//         for (int i = 1; i <= 5; i++) {
//            //1          2
//             sum = sum + i;
    // 1 + 2 + 3 + 4 + 5 = 15
//         }
//         System.out.println(sum); // print sum
//         int sum = 0;
//         for (int i = 1; i <= 5; i++) {
//            //1          2
//             sum +=  i;
//          // 1 + 2 + 3 + 4 + 5 = 15
//         }
    //example
    // syntax
    // Print your name 10 times            
//         for (int i = 0; i <= 9; i++) {
//            System.out.println("Winter");}
    //example magkakaron ng number like 1Winter 2Winter and so on
//         for (int i = 0; i <= 9; i++) {
//            System.out.println(i + 1 +"Winter");}
    // syntax
    //               2 kapag true mag run ang code block
//         for (int i = 1; i <= 10; i++) {
//            System.out.println(i); // code block / statement
    //example    
//          for (int i = 20; i >= 1; i--) {
//            System.out.println(i);       
    //example
//        for (int i = 20; i >= 1; i--) {
//            System.out.println(i);
//        }
//          }   

