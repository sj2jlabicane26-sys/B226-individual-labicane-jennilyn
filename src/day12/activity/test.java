
package day12.activity;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Ask for the number of students and subjects
        System.out.print("Enter the number of students: ");
        int students = input.nextInt();

        System.out.print("Enter the number of subjects: ");
        int subjects = input.nextInt();
        input.nextLine(); // Clear buffer

        // Arrays
        String[] studentNames = new String[students];
        String[] subjectNames = new String[subjects];
        double[][] grades = new double[students][subjects];
        double[] average = new double[students];

        // Input subject names
        System.out.println("\nEnter the subject names:");
        for (int i = 0; i < subjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjectNames[i] = input.nextLine();
        }

        // Input student names and grades
        for (int i = 0; i < students; i++) {

            System.out.println("\n Name of Student " + (i + 1));
            
            studentNames[i] = input.nextLine();

            double sum = 0;

            for (int j = 0; j < subjects; j++) {
                System.out.print("Enter grade in " + subjectNames[j] + ": ");
                grades[i][j] = input.nextDouble();
                sum += grades[i][j];
            }

            average[i] = sum / subjects;
            input.nextLine(); // Clear buffer
        }

        // Display Grades Report
        System.out.println("\n================== GRADES REPORT ==================");

        // Table Header
        System.out.printf("%-15s", "Student");

        for (int i = 0; i < subjects; i++) {
            System.out.printf("%-12s", subjectNames[i]);
        }

        System.out.printf("%-10s%n", "Average");

        // Table Rows
        for (int i = 0; i < students; i++) {

            System.out.printf("%-15s", studentNames[i]);

            for (int j = 0; j < subjects; j++) {
                System.out.printf("%-12.2f", grades[i][j]);
            }

            System.out.printf("%-10.2f%n", average[i]);
            
        }

        
    }
    
}
