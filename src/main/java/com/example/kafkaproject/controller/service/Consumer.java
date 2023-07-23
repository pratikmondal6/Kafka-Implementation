package com.example.kafkaproject.controller.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "messageTopic", groupId = "messageGroupId")
    public void listenToTopic(String receivedMessage) {
        System.out.println("messsage received "+receivedMessage);
    }


}
