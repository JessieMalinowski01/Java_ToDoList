package com.todolist;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    private ArrayList<String> items = new ArrayList<String>();
    private Scanner scanner = new Scanner(System.in);

    public void addItem() {
        System.out.println("Enter the task you want to add:");
        String item = scanner.nextLine();
        items.add(item);
        System.out.println(item + " has been added to the list.");
    }

    public void removeItem() {
        System.out.println("Enter the task you want to remove:");
        String item = scanner.nextLine();
        boolean removed = items.remove(item);
        if (removed) {
            System.out.println(item + " has been removed from the list.");
        } else {
            System.out.println(item + " was not found in the list.");
        }
    }

    public void displayList() {
        if (items.size() == 0) {
            System.out.println("The list is empty.");
        } else {
            System.out.println("Todo list:");
            for (int i = 0; i < items.size(); i++) {
                System.out.println(i + 1 + ". " + items.get(i));
            }
        }
    }

    public void start() {
        String choice = "";
        while (!choice.equals("exit")) {
            System.out.println("Enter 'add' to add a task, 'remove' to remove a task, 'display' to display the list, or 'exit' to quit:");
            choice = scanner.nextLine();
            switch (choice) {
                case "add":
                    addItem();
                    break;
                case "remove":
                    removeItem();
                    break;
                case "display":
                    displayList();
                    break;
                case "exit":
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
