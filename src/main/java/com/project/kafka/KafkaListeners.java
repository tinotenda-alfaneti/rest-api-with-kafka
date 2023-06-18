package com.project.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "atarist", groupId = "boss")
    void listener(String data) {

        System.out.println("Listener received: " + data);

    }
}

















