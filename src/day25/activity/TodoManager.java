package day25.activity;

import java.util.Scanner;
import java.util.ArrayList;

public class TodoManager {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        boolean running = true;

        System.out.println("Welcome to the To-Do List Manager!");

        // Loop until the user chooses to exit (Option 6)
        while (running) {
            // Display the Menu
            System.out.println("\n--- TO-DO LIST MENU ---");
            System.out.println("1. Add a task");
            System.out.println("2. View all tasks");
            System.out.println("3. Update a task");
            System.out.println("4. Remove a task");
            System.out.println("5. Clear all tasks");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");

            int choice = -1;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume the leftover newline character
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 6.");
                scanner.nextLine(); // Clear the invalid input
                continue;
            }

            // Handle user choices using a switch statement
            switch (choice) {
                case 1:
                    // Add a task
                    System.out.print("Enter the task to add: ");
                    String newTask = scanner.nextLine();
                    tasks.add(newTask);
                    System.out.println("Task added successfully!");
                    break;

                case 2:
                    // View all tasks
                    if (tasks.isEmpty()) {
                        System.out.println("Your to-do list is currently empty.");
                    } else {
                        System.out.println("\nYour Tasks:");
                        for (int i = 0; i < tasks.size(); i++) {
                            // Displaying 1-based index for user-friendliness
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 3:
                    // Update a task
                    if (tasks.isEmpty()) {
                        System.out.println("There are no tasks to update.");
                    } else {
                        System.out.print("Enter the number of the task you want to update: ");
                        if (scanner.hasNextInt()) {
                            int updateIndex = scanner.nextInt() - 1; // Convert to 0-based index
                            scanner.nextLine(); // Consume newline

                            if (updateIndex >= 0 && updateIndex < tasks.size()) {
                                System.out.print("Enter the new description: ");
                                String updatedTask = scanner.nextLine();
                                tasks.set(updateIndex, updatedTask);
                                System.out.println("Task updated successfully!");
                            } else {
                                System.out.println("Error: Invalid task number.");
                            }
                        } else {
                            System.out.println("Error: Please enter a valid number.");
                            scanner.nextLine(); // Clear scanner buffer
                        }
                    }
                    break;

                case 4:
                    // Remove a task
                    if (tasks.isEmpty()) {
                        System.out.println("There are no tasks to remove.");
                    } else {
                        System.out.print("Enter the number of the task to remove: ");
                        if (scanner.hasNextInt()) {
                            int removeIndex = scanner.nextInt() - 1; // Convert to 0-based index
                            scanner.nextLine(); // Consume newline

                            if (removeIndex >= 0 && removeIndex < tasks.size()) {
                                String removed = tasks.remove(removeIndex);
                                System.out.println("Removed: \"" + removed + "\"");
                            } else {
                                System.out.println("Error: Invalid task number.");
                            }
                        } else {
                            System.out.println("Error: Please enter a valid number.");
                            scanner.nextLine(); // Clear scanner buffer
                        }
                    }
                    break;

                case 5:
                    // Clear all tasks
                    if (tasks.isEmpty()) {
                        System.out.println("The list is already empty.");
                    } else {
                        tasks.clear();
                        System.out.println("All tasks cleared successfully!");
                    }
                    break;

                case 6:
                    // Exit the program
                    System.out.println("Exiting To-Do List Manager. Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please select an option between 1 and 6.");
                    break;
            }
        }

    }

}
