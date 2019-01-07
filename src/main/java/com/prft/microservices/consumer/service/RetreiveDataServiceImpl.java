/**
 * 
 */
package com.prft.microservices.consumer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.prft.microservices.consumer.model.Client;

/**
 * @author mounika.pandiri
 *
 */
public class RetreiveDataServiceImpl implements RetreiveDataService {

	protected Logger log = LoggerFactory.getLogger(RetreiveDataServiceImpl.class);

	public void retreiveDataFromTopic(Client client) {
		log.info("Entering retreiveDataFromTopic()");
		log.info("Exiting retreiveDataFromTopic()");
	}
	
}
