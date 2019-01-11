package com.prft.microservices.consumer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.prft.microservices.consumer.dao.UpdateClientStatusDao;
import com.prft.microservices.consumer.model.Client;

/**
 * @author mounika.pandiri
 *
 */
@Service("retreiveDataServiceImpl")
public class RetreiveDataServiceImpl implements RetreiveDataService {

	protected Logger log = LoggerFactory.getLogger(RetreiveDataServiceImpl.class);

	@Autowired
	private UpdateClientStatusDao updateClientStatusDao;
	
	@KafkaListener(topics = "KafkaProducerTopic", groupId = "group_json", containerFactory = "clientKafkaListenerFactory")
	public void retreiveDataFromTopic(Client client) {
		log.info("Entering retreiveDataFromTopic()");
		log.info("Consumed JSON Message: Client_Name: " + client.getName() + " Client_Status:  " + client.toString());
		long updatedClientRecordCount = updateClientStatusDao.updateClientStatus(client);
		if (updatedClientRecordCount == 1) {
			log.info("Record with Name - '" + client.getName() + "' is updated with Status - '" + client.getStatus()
					+ "'");
		} else {
			log.info("No record found with Name - '" + client.getName() + "'");
		}
		log.info("Exiting retreiveDataFromTopic()");
	}

}
