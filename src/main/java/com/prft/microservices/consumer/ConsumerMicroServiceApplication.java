package com.prft.microservices.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration;

@SpringBootApplication(exclude = KafkaAutoConfiguration.class)
public class ConsumerMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerMicroServiceApplication.class, args);
	}

}

