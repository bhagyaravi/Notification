package com.example.notificationservice.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NotificationServiceTest {

    private final NotificationService notificationService = new NotificationService();

    @Test
    public void testNotifyUser() {
        String result = notificationService.notifyUser();
        assertEquals("Notification sent!", result);
    }

}