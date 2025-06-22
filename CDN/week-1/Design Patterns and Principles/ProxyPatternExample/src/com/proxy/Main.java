package com.proxy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter image filename to view:");
        String filename = scanner.nextLine();

        Image image1 = new ProxyImage(filename);
        System.out.println("\n--- First call (should load from server) ---");
        image1.display();

        System.out.println("\n--- Second call (should load from cache) ---");
        Image image2 = new ProxyImage(filename);
        image2.display();

        scanner.close();
    }
}
