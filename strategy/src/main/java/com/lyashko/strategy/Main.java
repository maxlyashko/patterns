package com.lyashko.strategy;

import com.lyashko.strategy.service.PaymentClientService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PaymentClientService client = new PaymentClientService();
        Scanner scanner = new Scanner(System.in);
        client.setPaymentStrategy(scanner);
        client.processOperation(scanner);
    }
}
