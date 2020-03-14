package com.vivo.controller;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
 
@Component
public class OrderConsumer {
 
    @KafkaListener(topics = "${order.topic}", groupId = "${spring.kafka.consumer.group-id}")
    public void consumer(String order) {
        //log.info("Order: " + order);
        System.out.println("Order: " + order);
    }
}
