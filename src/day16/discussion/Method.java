
package day16.discussion;


public class Method {
   public static void main(String[] args) {
        printName("Summer" , 26, 37000);
       
    }

    
    public static void printName(String name, int age, double salary){
        
            System.out.println(name);
            System.out.println(age);
            System.out.println(salary);
        
        
    }
    
}

/* example 4
public static void main(String[] args) {
        printName("Summer" , 26, 37000);
       
    }

    
    public static void printName(String name, int age, double salary){
        
            System.out.println(name);
            System.out.println(age);
            System.out.println(salary);
        
        
    }


example 3
 public static void main(String[] args) {
        printName("Summer");
        printName("Spring");
        printName("Winter");
        printName("Fall");
    }

    
    public static void printName(String name){
        for (int i = 0; i < 10; i++) {
            System.out.println(name);
        }
        
    }


example 2
public static void main(String[] args) {
        System.out.println(greet("Winter"));
    }
    
    public static String greet(String name) {
        return "Hello " + name;
    }

example 1
public static void main(String[] args) {
        // invoke the method
        int result = sum(50, 50);
        System.out.println("The sum of the two numbers is " + result);
    }
    
    // return type: data type
    public static int sum(int a, int b) {
        return a + b;
    }
*/
