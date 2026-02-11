package org.example.beginner.factory;

import org.example.beginner.notification.Notification;

//Creator abstract class (It's a class that defines the factory method)
public abstract class NotificationFactory {

    // Factory Method
    abstract Notification createNotification();

    public void sendMessage(String message) {
        Notification notification = createNotification();
        notification.send(message);
    }
}
