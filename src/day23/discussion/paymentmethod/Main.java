
package day23.discussion.paymentmethod;


public class Main {
    public static void main(String[] args) {
        // Instantiation (Dynamic Polymorphism
        Payment cashpay = new CashPayment();
        Payment creditpay = new CreditCardPayment();
        Payment gcashpay = new GCashPayment();
        
        cashpay.pay(100);
        creditpay.pay(1000);
        gcashpay.pay(2000);
    }
        
    
}
