package com.lyashko.strategy.payment.impl;

import com.lyashko.strategy.payment.PaymentStrategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " via credit card.");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunding " + amount + " via credit card.");
    }
}
