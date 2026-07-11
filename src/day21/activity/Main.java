package day21.activity;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("********************************");
        System.out.println("*  USER ACCOUNT REGISTRATION   *");
        System.out.println("********************************");

        System.out.print("First Name: ");
        String firstName = input.nextLine();

        System.out.print("Middle Name: ");
        String middleName = input.nextLine();

        System.out.print("last Name: ");
        String lastName = input.nextLine();

        System.out.print("Address: ");
        String address = input.nextLine();

        System.out.print("Email: ");
        String email = input.nextLine();

        System.out.print("password: ");
        String password = input.nextLine();

        UserAccount useraccount = new UserAccount(firstName, middleName, lastName, address, email, password);

       
        System.out.println("--- User Account Created");
        System.out.println("FULL NAME: " + useraccount.getFirstName() + " " + useraccount.getMiddleName() + " " +useraccount.getLastName());
        System.out.println("Address: " + useraccount.getAddress());
        System.out.println("Email: " + useraccount.getEmail());
    }   

}
