package com.prft.microservices.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.prft.microservices.consumer.dao.UpdateClientStatusDao;
import com.prft.microservices.consumer.dao.UpdateClientStatusDaoImpl;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(exclude = KafkaAutoConfiguration.class)
@EnableMongoRepositories(basePackageClasses = UpdateClientStatusDao.class)
@EnableDiscoveryClient
@EnableSwagger2
public class ConsumerMicroServiceApplication {

	@Bean
	public UpdateClientStatusDao updateClientStatusDao() {
		return new UpdateClientStatusDaoImpl();
	}

	public static void main(String[] args) {
		SpringApplication.run(ConsumerMicroServiceApplication.class, args);
	}

}
