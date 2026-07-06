package day16.activity;

import java.util.Scanner;

public class Activity12_Labicane {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Odd Number or Even Number:");
        int number = input.nextInt();
        oddOrEven(number);
        printName("Jennilyn Labicane");

        System.out.print("Square Root of: ");
        double num = input.nextDouble();
        squareRoot(num);

        System.out.println("Get the power of a number");
        System.out.print("base: ");
        double base = input.nextDouble();

        System.out.print("exponent: ");
        double exponent = input.nextDouble();
        powerOfNum(base, exponent);

        System.out.print("Random number from 1-100: ");
        printRandomNum();

        System.out.print("Enter the area of a Circle: ");
        double radius = input.nextDouble();
        areaOfCircle(radius);

        System.out.print("Identify if a person is a voter or not: ");
        int age = input.nextInt();
        voter(age);
        
        input.nextLine();

        System.out.print("Length of a word: ");
        String word = input.nextLine();
        lengthOfWord(word);

        System.out.print("Reverse Word: ");
        String reverse = input.nextLine();
        reverseWord(reverse);

        System.out.println("Enter your name: ");
        String names = input.nextLine();
        System.out.print("Enter your age: ");
        int ages = input.nextInt();
        nameAge(names, ages);
    }

    public static void oddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }

    public static void printName(String name) {
//        for (int i = 0; i < 50; i++) {
//            System.out.println(name);
//        }
    }

    public static void squareRoot(double num) {
        int squareRt = (int) Math.sqrt(num);
        System.out.println("SquareRt result: " + squareRt);
    }

    public static void powerOfNum(double base, double exponent) {
        int powerNum = (int) Math.pow(base, exponent);
        System.out.println("Power of the number: " + powerNum);
    }

    public static void printRandomNum() {
        int randomNum = (int) (Math.random() * 100) + 1;
        System.out.println(randomNum);
    }

    public static void areaOfCircle(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Result: " + area);
    }

    public static void voter(int age) {
        if (age >= 18) {
            System.out.println("The person is a voter");
        } else {
            System.out.println("The person is not a voter");
        }
    }

    public static void lengthOfWord(String word) {
        int length = word.length();
        System.out.println("Result: " + length);
    }

    public static void reverseWord(String reverse) {
        for (int i = reverse.length() - 1; i >= 0; i--) {
            System.out.print(reverse.charAt(i));

        } System.out.println(" is the reverse word");

    }

    public static void nameAge(String names, int ages) {
        System.out.println("Name: " + names);
        System.out.println("Age: " + ages);
    }
}
