package com.lyashko.observer.event;

public interface EventPublisher {
    void subscribe(EventSubscriber subscriber);

    void unsubscribe(EventSubscriber subscriber);

    void notifyObservers(String event);
}
