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
public class CheckingAccount extends Account implements Transaction {
      double overdraftLimit;

    public CheckingAccount(String number, String holder, double balance, double overdraftLimit) {
        super(number, holder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void displayAccountInfo() {
        System.out.println("-- CHECKING ACCOUNT INFO --");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println("Overdraft Limit: " + overdraftLimit);
        
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " into Checking Account new Balance: P" + balance);
    }
    
    public void withdraw(double amount) {
    if (amount <= 500) {
        System.out.println("Error: Withdraw amount must be greater than 500");
        return;
    }

    // The maximum money the user can withdraw
    double maxWithdrawable = balance + overdraftLimit;

    if (amount <= maxWithdrawable) {
        balance -= amount; // Deduction: The balance can become negative
        System.out.println("Withdrew: P" + amount + " | New Balance: P" + balance);
        
        // overdraft
        if (balance < 0) {
            System.out.println("Warning: Overdraft protection used! Your current debt is: P" + balance);
        }
    } else {
        double shortage = amount - maxWithdrawable;
        // the amount exceeds what the bank can lend
        System.out.println("");
        System.out.println("== TRANSACTION ALLOWED USING OVERDRAFT ==");
        System.out.println(""); 
        balance =- overdraftLimit;
        System.out.println("ACCOUNT OVERDRAFT IS NOW MAX OUT: P " + overdraftLimit);
        System.out.println("Withdrew: " + shortage + " from checking Account");
        System.out.println("TOTAL AMOUNT RECIEVED BY USER: " + amount);
        
    }
}
    }

