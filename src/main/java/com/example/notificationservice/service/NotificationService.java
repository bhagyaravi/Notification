package com.example.notificationservice.service;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public String notifyUser() {
        // Logic to send notification
        return "Notification sent!";
    }

}