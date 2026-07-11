
package day21.discussion;


public class Main {
    public static void main(String[] args) {
        Ballpen ballpen = new Ballpen("Panda", "Black", 25, 0.5);
        ballpen.setBrand("Pilot");
        ballpen.setColor("Black");
        ballpen.setId(123);
        ballpen.setPrice(10);
        ballpen.setPointsize(.1);
        
        System.out.println("ID: " + ballpen.getId());
        System.out.println("Price: " + ballpen.getPrice());
        System.out.println("POINT SIZE: " + ballpen.getPointsize());
        
        System.out.println("BRAND: " + ballpen.getBrand());
        System.out.println("COLOR: " + ballpen.getColor());
    }
}
