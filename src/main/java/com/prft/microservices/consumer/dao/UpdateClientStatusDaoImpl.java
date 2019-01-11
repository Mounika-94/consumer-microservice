package com.prft.microservices.consumer.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.mongodb.client.result.UpdateResult;
import com.prft.microservices.consumer.model.Client;

/**
 * @author mounika.pandiri
 *
 */
public class UpdateClientStatusDaoImpl implements UpdateClientStatusDao {

	@Autowired
	private MongoOperations mongoOperation;

	protected Logger log = LoggerFactory.getLogger(UpdateClientStatusDaoImpl.class);

	@Override
	public long updateClientStatus(Client client) {
		log.info("Entering updateClientStatus()");
		Query query = new Query();
		query.addCriteria(Criteria.where("name").is(client.getName()));
		Update update = new Update();
		update.set("status", client.getStatus());
		UpdateResult updatedClientRecord = mongoOperation.upsert(query, update, Client.class);
		log.info("Exiting updateClientStatus()");
		return updatedClientRecord.getModifiedCount();
	}
}
