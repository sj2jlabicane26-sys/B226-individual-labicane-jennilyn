package day12.activity;

import java.util.Scanner;

public class Activity8_Labicane {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of student: ");
        int student = input.nextInt();

        System.out.print("Enter the number of subject: ");
        int subject = input.nextInt();

        input.nextLine();

        String[] studentNames = new String[student];
        String[] subjectNames = new String[subject];
        double[][] grades = new double[student][subject];
        double[] average = new double[student];

        System.out.println("");

        System.out.println("Enter subject Names: ");
        for (int i = 0; i < subject; i++) {
            System.out.print("Subject" + (i + 1) + ": ");
            subjectNames[i] = input.nextLine();

        }
        System.out.println("");

        for (int i = 0; i < student; i++) {
            System.out.print("Name of student " + (i + 1) + ": ");
            studentNames[i] = input.nextLine();

            double sum = 0;
            System.out.println("Enter grades for each subject: ");
            for (int j = 0; j < subject; j++) {
                System.out.print(subjectNames[j] + ": ");
                
                grades[i][j] = input.nextDouble();
                sum = sum + grades[i][j]; // or sum += grades[i][j];

                average[i] = sum / subject; // Average = Total Grades / subject

                input.nextLine();
            }

        }
        
        System.out.println("======Grades Report ======");
        System.out.printf("%-15s", "Student");
        

        for (int i = 0; i < subject; i++) {
            System.out.printf("%-12s", subjectNames[i]);
        }

        System.out.printf("%-10s%n", "Average");

        // Table Rows
        for (int i = 0; i < student; i++) {

            System.out.printf("%-15s", studentNames[i]);

            for (int j = 0; j < subject; j++) {
                System.out.printf("%-12.2f", grades[i][j]);
            }

            System.out.printf("%-10.2f%n", average[i]);

        }

        input.close();


    }
}
