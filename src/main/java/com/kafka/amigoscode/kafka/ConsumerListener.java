package com.kafka.amigoscode.kafka;

import com.kafka.amigoscode.kafka.dto.Greeting;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerListener {

    private static final Logger log = LoggerFactory.getLogger(ConsumerListener.class);

    @KafkaListener(topics = "amigoscode", groupId = "foo", containerFactory = "greetingKafkaListenerContainerFactory")
    public void greetingListener(Greeting greeting) {
        log.info("Listener greeting : {}", greeting);
        // process greeting message
    }
}
