package org.example;

public class NotificationService {

    private String message;

    public NotificationService(String message) {
        this.message = message;
    }

    public void send() {
        if (message == null) {
            message = "Standard message";
        }
        System.out.println(message);
    }


}
