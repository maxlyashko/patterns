package com.lyashko.observer.event.impl;

import com.lyashko.observer.event.EventSubscriber;

public class ConcreteEventSubscriber implements EventSubscriber {
    private String name;

    public ConcreteEventSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void receiveNotification(String event) {
        System.out.println(name + " received notification: " + event);
    }
}
