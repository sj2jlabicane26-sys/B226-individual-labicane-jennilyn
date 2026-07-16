
package day24.activity;


public abstract class Account {

    String accountNumber;
    String accountHolder;
    double balance;
    
     public abstract void displayAccountInfo();

    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

   
}


