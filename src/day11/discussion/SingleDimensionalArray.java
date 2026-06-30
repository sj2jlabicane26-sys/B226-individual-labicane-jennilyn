package day11.discussion;
import java.util.Scanner;
public class SingleDimensionalArray {

    public static void main(String[] args) {
        // syntax for single dimensional array
        // collections of ages: 24 43 35 18 28 25
        //           0    1   2  3   4   5
//        int[] ages = {24, 43, 35, 18, 28, 25};
        // Mini activity: Traverse an ages array using for loop and for each loop.

        // Traversing an array using for loop
//        System.out.println(ages.length -1);


//           Traversing an array using for loop
//        System.out.println("for loop");
//        for (int i = 0; i < ages.length; i++) {
//            System.out.println(ages[i]);
//        }
//
//        System.out.println("For-each loop");
//
//        // Traversing an array using for-each loop / enhanced for loop
//        for (int age : ages) {
//            System.out.println("age:" + " " + age);
//        }

//        System.out.println(ages[2]);// [put here the index position]
        //                     0        1       2      3       4
//        String [] names = {"Michael", "Les", "Kent", "Ray", "Winter"};
//        System.out.println(names.length -1);
        //maximum index
        // Traversing an array using for loop
//        for (int i = 0; i < names.length; i++){
//            System.out.println(names[i]);
//        }
//        
        //traversing an array using for-each loop / enhanced for loop
//        for (String name: names){
//            System.out.println(name);
//        }

// ------------------------------------------------------------------------------------------------------------------
            Scanner scanner = new Scanner (System.in); 
            String [] anime = new String [5];
            
            for (int i = 0; i < anime.length; i++){
                System.out.print("Enter anime title:");
                anime [i] = scanner.nextLine();
               
            }
            
            System.out.println("\nAnime you entered:");
            for (String title : anime){
                System.out.println(title);
            }
           
            


    }
}
