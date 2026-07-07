
package day17.activity;


public class Main { 
    public static void main(String[] args) {
        
    
    // Syntax of Instantiation
    // ClassName objectName = new Constructor();
    
    // object 1
    Bottle bottle = new Bottle();
    bottle.brand = "Hydro Flask";
    bottle.color = "Black";
    bottle.type = "Stainless steel";
    bottle.capacity = 1000;
    bottle.weightInGrams = 30;
        System.out.println("Hydro Flask Stainless steel");
    bottle.protection();
    bottle.transportation();
    bottle.dispense();
    
    // object 2
    Bottle bottle2 = new Bottle();
    bottle2.brand = "Nature's Spring";
    bottle2.color = "clear";
    bottle2.type = "Plastic";
    bottle2.capacity = 500;
    bottle2.weightInGrams = 15;
        System.out.println("\nNature's Spring Plastic bottle");
    bottle.protection();
    bottle.transportation();
    
    
    // object 3
    Bottle bottle3 = new Bottle();
    bottle3.brand = "Dr.Brown's";
    bottle3.color = "clear";
    bottle3.type = "plastic";
    bottle3.capacity = 240;
    bottle3.weightInGrams = 10;
        System.out.println("\nDr.Brown's baby bottle");
    bottle3.preservation();
    bottle.protection();
    bottle.transportation();
    bottle.dispense();
    
}
}