package com.lyashko.observer.event.impl;

import com.lyashko.observer.event.EventPublisher;
import com.lyashko.observer.event.EventSubscriber;

import java.util.ArrayList;
import java.util.List;

public class ConcreteEventPublisher implements EventPublisher {
    private List<EventSubscriber> subscribers = new ArrayList<>();

    @Override
    public void subscribe(EventSubscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(EventSubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifyObservers(String event) {
        for (EventSubscriber subscriber : subscribers) {
            subscriber.receiveNotification(event);
        }
    }

    public void doSomething() {
        notifyObservers("Event occurred!");
    }
}
