package com.prft.microservices.consumer.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.prft.microservices.consumer.model.Client;

/**
 * @author mounika.pandiri
 *
 */
public class UpdateClientStatusDaoImpl implements UpdateClientStatusDao {

	protected Logger log = LoggerFactory.getLogger(UpdateClientStatusDaoImpl.class);

	@Override
	public long updateClientStatus(Client client) {
		log.info("Entering updateClientStatus()");
		log.info("Exiting updateClientStatus()");
		return 0;
	}

}
