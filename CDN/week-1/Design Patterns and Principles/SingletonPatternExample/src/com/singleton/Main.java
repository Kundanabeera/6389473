package com.singleton;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("Application started.");

        Logger logger2 = Logger.getInstance();
        logger2.log("Application running...");

        if (logger1 == logger2) {
            System.out.println("Singleton verified");
        } else {
            System.out.println("Singleton failed");
        }
    }
}
