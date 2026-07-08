
package day18.discussion;


public class MethodInvocation {
    public static void main(String[] args) {
        MethodInvocation obj = new MethodInvocation();
        obj.b();
        MethodInvocation.a();
    }
    
    // static method
    public static void a(){
        System.out.println("Acess static method...");
        
    }
    
    // instance method
    public void b() {
        System.out.println("Access instand method...");
        
    }
    
}
