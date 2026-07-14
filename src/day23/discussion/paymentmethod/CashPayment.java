/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day23.discussion.paymentmethod;

/**
 *
 * @author Labicane
 */
public class CashPayment extends Payment {
    public void pay (double amount){
        System.out.println("Paid P " + amount + "using CashPayment");
    }
}
