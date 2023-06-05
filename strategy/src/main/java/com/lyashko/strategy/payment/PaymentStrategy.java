package com.lyashko.strategy.payment;

public interface PaymentStrategy {
    void pay(double amount);

    void refund(double amount);
}
