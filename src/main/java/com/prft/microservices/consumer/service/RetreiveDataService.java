/**
 * 
 */
package com.prft.microservices.consumer.service;

import com.prft.microservices.consumer.model.Client;

/**
 * @author mounika.pandiri
 *
 */
public interface RetreiveDataService {
	public void retreiveDataFromTopic(Client client);
}
