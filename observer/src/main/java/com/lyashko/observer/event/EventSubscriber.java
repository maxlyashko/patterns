package com.lyashko.observer.event;

public interface EventSubscriber {
    void receiveNotification(String event);
}
