package com.prft.microservices.consumer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.prft.microservices.consumer.model.Client;

/**
 * @author mounika.pandiri
 *
 */
@Service("retreiveDataServiceImpl")
public class RetreiveDataServiceImpl implements RetreiveDataService {

	protected Logger log = LoggerFactory.getLogger(RetreiveDataServiceImpl.class);

	@KafkaListener(topics = "KafkaProducerTopic", groupId = "group_json", containerFactory = "clientKafkaListenerFactory")
	public void retreiveDataFromTopic(Client client) {
		log.info("Entering retreiveDataFromTopic()");
		log.info("Consumed JSON Message: Client_Name: " + client.getName() + " Client_Status:  " + client.toString());
		log.info("Exiting retreiveDataFromTopic()");
	}

}
