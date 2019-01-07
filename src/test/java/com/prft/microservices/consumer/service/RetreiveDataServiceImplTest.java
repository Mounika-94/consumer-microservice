/**
 * 
 */
package com.prft.microservices.consumer.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.prft.microservices.consumer.model.Client;

/**
 * @author mounika.pandiri
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RetreiveDataServiceImplTest {

	@Autowired
	private RetreiveDataService retreiveDataService;

	@Test
	public void testRetreiveDataFromTopic() {
		Client client = new Client();
		retreiveDataService.retreiveDataFromTopic(client);
		assertThat(retreiveDataService).isNotNull();
	}

}
