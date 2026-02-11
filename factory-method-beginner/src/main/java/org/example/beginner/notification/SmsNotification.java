package org.example.beginner.notification;

public class SmsNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println(message);
        System.out.println("Enviou SMS Notification");
        System.out.println("Mas agora teve uma mudança apenas no SMS, lógica única");
    }
}
