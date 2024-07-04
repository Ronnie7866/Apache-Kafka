package com.scm.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @KafkaListener(topics = "location", groupId = "user-group")
    public void deliveryBoyLocation(String location) {
        System.out.println(location);
    }
}
