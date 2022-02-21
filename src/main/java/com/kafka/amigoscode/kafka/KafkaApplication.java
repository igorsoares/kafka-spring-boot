package com.kafka.amigoscode.kafka;

import com.kafka.amigoscode.kafka.dto.UserModel;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class KafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(KafkaTemplate<String, UserModel> kafkaTemplate) {
		return args -> {
			for (int i = 0; i < 5; i++) {
				kafkaTemplate.send("reflectoring-1", new UserModel("Igor", "Soares"));
				Thread.sleep(500);
			}
		};
	}

}
