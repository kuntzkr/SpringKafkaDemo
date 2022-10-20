package com.krute.KafkaProducerDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
public class KafkaProducerController {
    // Autowiring Kafka Template
    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    // The topic we will push messages to
    private static final String TOPIC = "KurtisTopic";

    // Publish messages using the GetMapping
    @GetMapping("/publish/{message}")
    public String publishMessage(@PathVariable("message") final String message) {
        // Sending the message
        kafkaTemplate.send(TOPIC, message);
        return "Published Successfully";
    }
}
