/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day24.activity;

/**
 *
 * @author Labicane
 */
public class SavingsAccount extends Account implements Transaction {
   
    
double interestRate;

    public SavingsAccount(String number, String holder, double balance, double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountInfo() {
        System.out.println("SAVINGS");
        System.out.println("Account number: " + accountNumber + "| accountHolder: " + accountHolder + " | Balance: P" + balance + " | Interest: " + interestRate);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: P" + amount + " | Balance: P" + balance);
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrew: P" + amount + " | Balance: P" + balance);
    }
    
}
    
    
    
    
   
        
      
        
    

