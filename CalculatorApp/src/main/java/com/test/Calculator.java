package com.test;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            // Display menu
            System.out.println("SIMPLE CONSOLE CALCULATOR");
            System.out.println("Choose an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");

            // Take input from the user
            System.out.print("Pick an option (1/2/3/4/5): ");
            int choice = scanner.nextInt();

            double result = 0;
            switch (choice) {
                case 1:
                    result = performAddition(scanner);
                    break;
                case 2:
                    result = performSubtraction(scanner);
                    break;
                case 3:
                    result = performMultiplication(scanner);
                    break;
                case 4:
                    result = performDivision(scanner);
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option!");
            }

            if (!exit) {
                System.out.println("Result: " + result);
                System.out.print("Do you wish to continue? (yes/no): ");
                String answer = scanner.next().toLowerCase();
                if (!answer.equals("yes")) {
                    exit = true;
                }
            }
        }

        System.out.println("Goodbye");
    }

    private static double performAddition(Scanner scanner) {
        System.out.print("Enter first number: ");
        double number1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double number2 = scanner.nextDouble();
        return number1 + number2;
    }

    private static double performSubtraction(Scanner scanner) {
        System.out.print("Enter first number: ");
        double number1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double number2 = scanner.nextDouble();
        return number1 - number2;
    }

    private static double performMultiplication(Scanner scanner) {
        System.out.print("Enter first number: ");
        double number1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double number2 = scanner.nextDouble();
        return number1 * number2;
    }

    private static double performDivision(Scanner scanner) {
        System.out.print("Enter first number: ");
        double dividend = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double divisor = scanner.nextDouble();
        if (divisor == 0) {
            System.out.println("Error: Division by zero!");
            return 0; // You can choose to return NaN or throw an exception instead
        } else {
            return dividend / divisor;
        }
    }
}