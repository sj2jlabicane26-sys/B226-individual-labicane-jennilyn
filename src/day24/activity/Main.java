
package day24.activity;


public class Main {
    public static void main(String[] args) {
       SavingsAccount savings = new SavingsAccount("123", "Jen", 5000.0, 0.05);
        savings.displayAccountInfo();
        savings.deposit(1500.0);
        savings.withdraw(500.0);

        System.out.println();

        CheckingAccount checking = new CheckingAccount("321", "Lab", 500, 2000.0);
        checking.displayAccountInfo();
        checking.deposit(500);
        checking.withdraw(2000);
    }
    }

