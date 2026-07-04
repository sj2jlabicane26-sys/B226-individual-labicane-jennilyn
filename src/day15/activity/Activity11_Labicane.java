
package day15.activity;

public class Activity11_Labicane {
    public static void main(String[] args) {
////        Lotto Simulator ( 6 - 58 )
//        System.out.println("Lotto Numbers: ");
//        for (int i = 0; i < 6; i++) {
//        int randomNumber =(int) (Math.random() * 58) + 1;
//        System.out.println("[" + (i + 1) + "]: " + randomNumber);

            System.out.println("Lotto Simulator");
            int[] lottoNumbers = new int [6];
            int count = 0;
            
            while (count < 6 ){
            int randomNumbers = (int)(Math.random()*58)+ 1;
            boolean duplicate = false;
            
                for (int i = 0; i < count; i++) {
                    if (lottoNumbers[i] == randomNumbers){
                        duplicate = true;
                        break;
                    }
                    
                }
                if(!duplicate){
                    lottoNumbers[count] = randomNumbers;
                    System.out.println("[" + (count + 1) + "]:" + randomNumbers );
                    count++;
                }
            
        }
    }
    
}
