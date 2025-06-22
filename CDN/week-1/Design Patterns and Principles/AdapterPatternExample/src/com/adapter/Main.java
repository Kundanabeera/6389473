package com.adapter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Payment Processor!");
        System.out.print("Enter amount to pay (₹): ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.println("Select payment gateway:");
        System.out.println("1. PayPal");
        System.out.println("2. Stripe");
        System.out.print("Enter choice (1 or 2): ");
        int choice = scanner.nextInt();

        PaymentProcessor processor;

        switch (choice) {
            case 1:
                processor = new PayPalAdapter(new PayPalGateway());
                break;
            case 2:
                processor = new StripeAdapter(new StripeGateway());
                break;
            default:
                System.out.println("Invalid choice.");
                scanner.close();
                return;
        }

        processor.processPayment(amount);
        scanner.close();
    }
}
