package com.prft.microservices.consumer.dao;

import org.springframework.stereotype.Repository;

import com.prft.microservices.consumer.model.Client;

/**
 * @author mounika.pandiri
 *
 */
@Repository("updateClientStatusDao")
public interface UpdateClientStatusDao {
	public long updateClientStatus(Client client);
}
