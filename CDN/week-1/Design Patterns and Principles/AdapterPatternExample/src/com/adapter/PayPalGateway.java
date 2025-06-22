package com.adapter;

public class PayPalGateway {
    public void sendPayment(double amountInDollars) {
        System.out.println("Paid ₹" + amountInDollars + " via PayPal.");
    }
}
