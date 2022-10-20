package com.krute.KafkaDemo.consumer;

// Importing required classes
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "KurtisTopic", groupId = "rgvc")
    public void consume(String message) {
        // Print statement
        System.out.println("message = " + message);
    }

}
