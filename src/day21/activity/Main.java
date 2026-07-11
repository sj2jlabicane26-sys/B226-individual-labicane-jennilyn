package day21.activity;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("First Name: ");
        String firstName = input.nextLine();

        System.out.println("Middle Name: ");
        String middleName = input.nextLine();

        System.out.println("last Name: ");
        String lastName = input.nextLine();

        System.out.println("Address: ");
        String address = input.nextLine();

        System.out.println("Email: ");
        String email = input.nextLine();

        System.out.println("password: ");
        String password = input.nextLine();
        
        
        UserAccount user = new UserAccount("Jennilyn", "Melida", "Labicane",
                "block 29 Lot 100 Mapagmahal", "labicanejennilyn@gmail.com", "jen123");

          System.out.println("\n===== USER ACCOUNT INFORMATION =====");
        System.out.println("Full Name: " +
                user.getFirstName() + " " +
                user.getMiddleName() + " " +
                user.getLastName());

        System.out.println("Email: " + user.getEmail());
        System.out.println("Address: " + user.getAddress());
        System.out.println("Password: " + user.getPassword());
    }

}
