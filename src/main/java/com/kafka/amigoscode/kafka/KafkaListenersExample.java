package com.kafka.amigoscode.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListenersExample {

    Logger log = LoggerFactory.getLogger(KafkaListenersExample.class);

    @KafkaListener(topics = "reflectoring-1", groupId = "reflectoring")
    void listener(String data) {
        log.info("Received on reflectoring-1 : {}", data);
    }

}
