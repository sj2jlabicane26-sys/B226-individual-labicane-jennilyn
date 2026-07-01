
package day12.discussion;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        // syntax on how to declare a multi-dimensional array    
        
        String[][] colors = { 
            // 0          1         2
            {"white", "yellow", "pink"}, // 0
            {"black", "brown", "gray"},  // 1
            {"green"}// 2
        };
         
        // coordinates       row  column
//        System.out.println(colors[1][1]);
//        System.out.println(colors[2].length);

//         Traverse a multi-dimensional array using nested for-loop
//         for + tab
//                          0 < 3
//            for (int i = 0; i < colors.length; i++) {// outer loop ... row
//             //                 0 <    3   0
//                for (int j = 0; j < colors[i].length; j++) { // inner loop ... column
//                    //                        0  0
//                    System.out.println(colors[i][j]);
//                    
//                }
//                System.out.println(""); // new line
            
//        }
            // Traverse a multi-dimensional array using nested for-each loop
            // from multi gawin munang single dimensional array
            // printing a multi-dimensional array using mested for-each loop // for print lang
            for (String[] row : colors) {
                for (String column : row){
                    System.out.println(column);
                }
                System.out.println("");
            }
    }
}
    


