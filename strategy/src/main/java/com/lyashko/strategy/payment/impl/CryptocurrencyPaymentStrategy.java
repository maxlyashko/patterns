package com.lyashko.strategy.payment.impl;

import com.lyashko.strategy.payment.PaymentStrategy;

public class CryptocurrencyPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " via cryptocurrency.");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunding " + amount + " via cryptocurrency.");
    }
}
