package day25.activity;

import java.util.Scanner;
import java.util.ArrayList;

public class TodoManager {

    public static void main(String[] args) {

          Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        System.out.println("Welcome to the To-Do List Manager!");

        while (true) {

            System.out.println("\n--- TO-DO LIST MENU ---");
            System.out.println("1. Add a Task");
            System.out.println("2. View All Tasks");
            System.out.println("3. Update a Task");
            System.out.println("4. Remove a Task");
            System.out.println("5. Clear All Tasks");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter a task: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println("Task added successfully.");
                    break;

                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks found.");
                    } else {
                        System.out.println("\nYour Tasks:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 3:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks to update.");
                    } else {
                        System.out.println("\nYour Tasks:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }

                        System.out.print("Enter task number to update: ");
                        int index = scanner.nextInt();
                        scanner.nextLine();

                        if (index >= 1 && index <= tasks.size()) {
                            System.out.print("Enter new task: ");
                            String newTask = scanner.nextLine();
                            tasks.set(index - 1, newTask);
                            System.out.println("Task updated successfully.");
                        } else {
                            System.out.println("Invalid task number.");
                        }
                    }
                    break;

                case 4:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks to remove.");
                    } else {
                        System.out.println("\nYour Tasks:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }

                        System.out.print("Enter task number to remove: ");
                        int remove = scanner.nextInt();

                        if (remove >= 1 && remove <= tasks.size()) {
                            tasks.remove(remove - 1);
                            System.out.println("Task removed successfully.");
                        } else {
                            System.out.println("Invalid task number.");
                        }
                    }
                    break;

                case 5:
                    tasks.clear();
                    System.out.println("All tasks have been cleared.");
                    break;

                case 6:
                    System.out.println("Thank you for using the To-Do List Manager!");
                    scanner.close();
                    return; // Ends the program

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

    }

}
    }
