package com.scm.deliveryboy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class DeliveryBoyService {

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    public boolean send(String message) {
        kafkaTemplate.send("location", message);
        return true;
    }
}
