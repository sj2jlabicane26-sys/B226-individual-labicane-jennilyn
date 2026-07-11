package day21.discussion;

public class Ballpen {
    // this -> refers ro rhe current class object
    // data hiding -> making all the data members private
    // data validation -> data use setter and getter methods
    
    // private field/ members
    private int id;
    String brand;
    String color;
    double price;
    double pointsize;
    
    // default constructor
    
    // parameterized constructor / setter constructor
    public Ballpen(String brand, String color, double price, double pointSize){
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.pointsize = pointSize;
    }
    
    //Gawa ko
    // mini activity
    public void setId(int id){
        this.id = id;
    }
     public void setPrice(double price){
        this.price = price;
     }
    
    public void setPointsize(double pointsize){
        this.pointsize = pointsize;
    }
    
    
    public int getId(){
        return id;
    }
    
     public double getPrice(){
        return price;
    }
     
    
    public double getPointsize(){
        return pointsize;
    }
    
    
    
    //Ginawa ni Sir
    
    //setter method / mutator method
    public void setBrand(String brand) {
        this.brand = brand;

    }

    public void setColor(String color) {
        this.color = color;
    }
    
    // getter method / accessor method
    public String getBrand() {
        return brand;
    }
    
    public String getColor() {
        return color;
    }
}
