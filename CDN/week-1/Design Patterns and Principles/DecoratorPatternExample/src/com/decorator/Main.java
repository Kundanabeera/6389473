package com.decorator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter notification message:");
        String message = scanner.nextLine();

        Notifier notifier = new EmailNotifier();

        System.out.println("Enable SMS notification? (yes/no): ");
        String smsChoice = scanner.nextLine();

        System.out.println("Enable Slack notification? (yes/no): ");
        String slackChoice = scanner.nextLine();

        if (smsChoice.equalsIgnoreCase("yes")) {
            notifier = new SMSNotifierDecorator(notifier);
        }
        if (slackChoice.equalsIgnoreCase("yes")) {
            notifier = new SlackNotifierDecorator(notifier);
        }

        System.out.println("\n--- Notification Output ---");
        notifier.send(message);

        scanner.close();
    }
}
