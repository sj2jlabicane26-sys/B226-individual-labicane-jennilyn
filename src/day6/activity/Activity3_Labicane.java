
package day6.activity;

public class Activity3_Labicane {
    public static void main(String[] args) {
        //Using the logical AND operator (&&), determine if the person is allowed to enter an event. 
        //Create a Java program that uses the following variables:
 
       int age = 20;
       boolean hasValidID = true;
        String above18 = age >= 18 && hasValidID ? "Access Granted" : "Access Not Granted";
        System.out.println(above18);
        
        //condition
        //Age must be 18 or above.
        //Must have a valid ID.
       
       //Using the logical OR operator (||), determine if there are no classes today.
       //Create a Java program that uses the following variables:  
            boolean isWeekend = true;
            boolean isHoliday = false;
          String Classes = isWeekend || isHoliday ? "No Classes Today" : "Has Classes Today";
          System.out.println(Classes);
          
        //Condition
        // No classes if it is a weekend OR a holiday.  
       
           
        //Use the ternary operator (? :) to determine if the student passed or failed.  
        // Create a Java program that uses the following variable:
    
            int score = 85;
          
            
            String result = score > 74 ? "Passed" : "Failed";
            System.out.println(result);

        //Condition:  
        //75 and above = Passed
        //Below 75 = Failed
            
        //Use the ternary operator (? :) to determine the larger number.
        // Create a Java program that uses the following variables:
          int num1 = 10;
          int num2 = 25;
          
         
         String largerNum = (num1 > num2) ? "10" : "25";
         System.out.println("The larger Number is:" + " " + largerNum);
      
    }
    
    
}
