package com.scm.deliveryboy.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class DeliveryBoyConfig {

    @Bean
    public NewTopic deliveryBoyTopic() {
        return TopicBuilder
                .name("location")
                .build();
    }
}
