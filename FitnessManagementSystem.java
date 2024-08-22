package com.evergent.corejava.abhi.application4;

import java.util.Scanner;

public class FitnessManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String module;

        ExerciseModule exerciseModule = new ExerciseModule();
        NutritionModule nutritionModule = new NutritionModule();
        PaymentModule paymentModule = new PaymentModule(0);

        System.out.println("Welcome to FITNESS MANAGEMENT SYSTEM");

        while (true) {
            System.out.println("======================");
            System.out.println(" Fitness Main Menu");
            System.out.println("======================");
            System.out.println("E - Exercise Module");
            System.out.println("N - Nutrition Module");
            System.out.println("M - Payment Module");
            System.out.println("Q - Quit");
            System.out.println("======================");
            System.out.print("Enter your Module code: ");

            module = scanner.nextLine().toUpperCase();
            switch (module) {
                case "E":
                    exerciseModule.moduleDetails();
                    exerciseModule.displayOptions();
                    int exerciseOption = scanner.nextInt();
                    exerciseModule.processOption(exerciseOption);
                    paymentModule = new PaymentModule(exerciseModule.cost);
                    //paymentModule.displayCost(); // Show cost after selection
                    break;

                case "N":
                    nutritionModule.moduleDetails();
                    nutritionModule.displayOptions();
                    int nutritionOption = scanner.nextInt();
                    nutritionModule.processOption(nutritionOption);
                    paymentModule = new PaymentModule(nutritionModule.cost);
                    // Show cost after selection
                    break;

                case "M":
                    paymentModule.moduleDetails();
                    paymentModule.displayOptions();
                    int paymentOption = scanner.nextInt();
                    paymentModule.processOption(paymentOption);
                    break;

                case "Q":
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid module code. Please try again.");
                    break;
            }

            scanner.nextLine(); // Consume newline
        }
    }
}
