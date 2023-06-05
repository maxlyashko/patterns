package com.lyashko.observer;

import com.lyashko.observer.event.EventSubscriber;
import com.lyashko.observer.event.impl.ConcreteEventPublisher;
import com.lyashko.observer.event.impl.ConcreteEventSubscriber;

public class Main {
    public static void main(String[] args) {
        ConcreteEventPublisher publisher = new ConcreteEventPublisher();

        EventSubscriber subscriber1 = new ConcreteEventSubscriber("Subscriber 1");
        EventSubscriber subscriber2 = new ConcreteEventSubscriber("Subscriber 2");

        publisher.subscribe(subscriber1);
        publisher.subscribe(subscriber2);

        publisher.doSomething();

        publisher.unsubscribe(subscriber2);

        publisher.doSomething();
    }
}
