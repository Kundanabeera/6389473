package com.strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter amount to pay:");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        System.out.println("Select payment method: 1. Credit Card  2. PayPal");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        switch (choice) {
            case 1:
                System.out.print("Enter card number: ");
                String cardNumber = scanner.nextLine();
                context.setPaymentStrategy(new CreditCardPayment(cardNumber));
                break;
            case 2:
                System.out.print("Enter PayPal email: ");
                String email = scanner.nextLine();
                context.setPaymentStrategy(new PayPalPayment(email));
                break;
            default:
                System.out.println("Invalid choice.");
                scanner.close();
                return;
        }

        context.executePayment(amount);
        scanner.close();
    }
}
