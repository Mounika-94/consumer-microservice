package com.prft.microservices.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.prft.microservices.consumer.dao.UpdateClientStatusDao;
import com.prft.microservices.consumer.dao.UpdateClientStatusDaoImpl;

@SpringBootApplication(exclude = KafkaAutoConfiguration.class)
@EnableMongoRepositories(basePackageClasses = UpdateClientStatusDao.class)
@EnableDiscoveryClient 
public class ConsumerMicroServiceApplication {

	@Bean
	public UpdateClientStatusDao updateClientStatusDao() {
		return new UpdateClientStatusDaoImpl();
	}

	public static void main(String[] args) {
		SpringApplication.run(ConsumerMicroServiceApplication.class, args);
	}

}
