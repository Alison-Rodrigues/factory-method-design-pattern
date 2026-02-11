package org.example.beginner.factory;

import org.example.beginner.notification.EmailNotification;
import org.example.beginner.notification.Notification;

public class EmailNotificationFactory extends NotificationFactory{
    @Override
    Notification createNotification() {
        return new EmailNotification();
    }
}
