
package day6.discussion;

public class TernaryOperator {
    public static void main(String[] args) {
        // syntax
        // (cond) ? true block : false block;
        // Posotive or Negative
       
       
       int num = -1;
       
       //kung string ang isa, string din ang isa
       String result = (num > 0) ? "Positive" : "Negative"; 
        System.out.println(result);
        
        //String result = (num == 0) ? "Neutral" : (num > 0) ? "Positive" : (num > 100) ? "Number is greater than 100" : "Negative";
              
        //Fever or Normal Temp
        //float temp = 38.5f;
        
      //  String tempResult = temp >= 38.5 ? "Fever" : "Normal Temp";
       // System.out.println(tempResult);
    }
    
}
