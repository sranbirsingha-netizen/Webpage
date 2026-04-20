package com.ranabir;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Welcome to the Java Expense Tracker ---");
        System.out.println("1. Add an Expense");
        System.out.println("2. View Expenses");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");
        
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            System.out.println("Adding expense feature coming soon...");
        } else {
            System.out.println("Shutting down.");
        }
        
        scanner.close();
    }
}
