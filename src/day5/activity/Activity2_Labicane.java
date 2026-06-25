
package day5.activity;

public class Activity2_Labicane {
    public static void main(String[] args) {
        double income = 50000; 
        double foodAllowance = 15000;
        double transportation = 2500;  
        double rent = 4500;  
        double utilityBill = 3500;
        
        
        double foodPercentage = (foodAllowance / income) * 100;
        double transPercentage = (transportation / income) * 100;
        double rentPercentage = (rent / income) * 100;
        double utilitybillPercentage = (utilityBill / income) *100;
        double totalExpenses = foodAllowance + transportation + rent + utilityBill;
        double Remaining = income - totalExpenses;
        
         System.out.printf("income:" + "%.0f\n",income);
         System.out.printf("foodAllowance:" + " " + "%.1f%%\n",foodPercentage);
         System.out.printf("transportation" + " " + "%.1f%%\n",transPercentage); 
         System.out.printf("rent" + " " + "%.1f%%%n",rentPercentage);  
         System.out.printf("utilityBill" + " " + "%.1f%%\n",utilitybillPercentage);
         System.out.printf("total:" + " " + "%.0f\n", totalExpenses);
         System.out.printf("RemainingBalance:" + " " + "%.0f",Remaining);
       
        
    }
    
}
