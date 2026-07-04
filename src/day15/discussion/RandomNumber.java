package day15.discussion;

public class RandomNumber {

    public static void main(String[] args) {
        // BINGO Simulator
        
        // 1-75
        int roll = (int)(Math.random()*75) + 1;
        String letter;
        
        if (roll <= 15){
            letter = "B";
        }else if (roll <= 30){
            letter = "I";
        }else if (roll <= 45){
            letter = "N";
        }else if (roll <= 60){
            letter = "G";
        }else{
            letter = "O";
        }
        System.out.println(letter + " "+ roll);
    }

}

// Lotto Simulator ( 6 - 58 )
//        System.out.println("Lotto Numbers: ");
//        for (int i = 0; i < 6; i++) {
//        int randomNumber =(int) (Math.random() * 58) + 1;
//        System.out.println("[" + (i + 1) + "]: " + randomNumber);
//
//
//===========================================
// casting -> upcasting & downcasting
// parsing -> Converts String into primitive data or vice versa
// String x = "10";
//      
//      int num = Integer.valueOf(x);
//        System.out.println(num);
