package org.example.beginner.factory;

import org.example.beginner.notification.Notification;
import org.example.beginner.notification.SmsNotification;

public class SmsNotificationFactory extends NotificationFactory {
    @Override
    Notification createNotification() {
        return new SmsNotification();
    }
}
