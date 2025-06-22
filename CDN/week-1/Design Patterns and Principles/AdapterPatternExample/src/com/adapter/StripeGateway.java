package com.adapter;

public class StripeGateway {
    public void makePayment(double money) {
        System.out.println("Paid ₹" + money + " via Stripe.");
    }
}
