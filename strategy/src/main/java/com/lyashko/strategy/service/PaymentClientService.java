package com.lyashko.strategy.service;

import com.lyashko.strategy.payment.PaymentStrategy;
import com.lyashko.strategy.payment.impl.CreditCardPaymentStrategy;
import com.lyashko.strategy.payment.impl.CryptocurrencyPaymentStrategy;
import com.lyashko.strategy.payment.impl.PayPalPaymentStrategy;

import java.util.Scanner;

public class PaymentClientService {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(Scanner scanner) {
        boolean setStrategy = false;
        while (!setStrategy) {
            System.out.println("Select a payment method:");
            switch (scanner.nextLine().replaceAll("\\s", "").toUpperCase()) {
                case "CREDITCARD" -> {
                    this.paymentStrategy = new CreditCardPaymentStrategy();
                    System.out.println("You selected Credit Card");
                    setStrategy = true;
                }
                case "PAYPAL" -> {
                    this.paymentStrategy = new PayPalPaymentStrategy();
                    System.out.println("You selected PayPal");
                    setStrategy = true;
                }
                case "CRYPTOCURRENCY" -> {
                    this.paymentStrategy = new CryptocurrencyPaymentStrategy();
                    System.out.println("You selected Cryptocurrency");
                    setStrategy = true;
                }
                default -> System.out.println("wrong input");
            }
        }
    }

    public void processOperation(Scanner scanner) {
        boolean setOperation = false;
        double amount = 100;
        while (!setOperation) {
            System.out.println("Select operation type:");
            switch (scanner.nextLine().replaceAll("\\s", "").toUpperCase()) {
                case "PAYMENT" -> {
                    paymentStrategy.pay(amount);
                    setOperation = true;
                }
                case "REFUND" -> {
                    paymentStrategy.refund(amount);
                    setOperation = true;
                }
                default -> System.out.println("wrong input");
            }
        }
    }
}
