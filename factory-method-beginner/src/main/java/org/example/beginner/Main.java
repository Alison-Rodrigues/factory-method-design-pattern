package org.example.beginner;

import org.example.beginner.factory.EmailNotificationFactory;
import org.example.beginner.factory.NotificationFactory;
import org.example.beginner.factory.SmsNotificationFactory;

public class Main {
    public static void main(String[] args) {
        NotificationFactory emailNotificationFactory = new EmailNotificationFactory();
        NotificationFactory smsNotificationFactory = new SmsNotificationFactory();

        emailNotificationFactory.sendMessage("Enviando Email Notification");
        smsNotificationFactory.sendMessage("Enviando SMS Notification");

    }
}