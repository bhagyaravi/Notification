package com.example.notificationservice.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.beans.factory.annotation.Autowired;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class NotificationControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testSendNotification() throws Exception {
        mockMvc.perform(get("/notify"))
                .andExpect(status().isOk())
                .andExpect(content().string("Notification sent!"));
    }

}