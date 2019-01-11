/**
 * 
 */
package com.prft.microservices.consumer.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.prft.microservices.consumer.dao.UpdateClientStatusDao;
import com.prft.microservices.consumer.model.Client;

/**
 * @author mounika.pandiri
 *
 */
@RunWith(SpringRunner.class)
// @SpringBootTest
@ContextConfiguration("/applicationContext.xml")
public class RetreiveDataServiceImplTest {

	@Autowired
	private RetreiveDataService retreiveDataService;

	@Mock
	UpdateClientStatusDao updateClientStatusDao;

	@InjectMocks
	RetreiveDataServiceImpl retreiveDataServiceImpl;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testRetreiveDataFromTopic() {
		Client client = new Client();
		retreiveDataService.retreiveDataFromTopic(client);
		assertThat(retreiveDataService).isNotNull();
	}

	@Test
	public void testRetreiveDataFromTopic_MockDB() {
		Client client = new Client();
		Mockito.when(updateClientStatusDao.updateClientStatus(client)).thenReturn(Mockito.anyLong());
		retreiveDataServiceImpl.retreiveDataFromTopic(client);
		Mockito.verify(updateClientStatusDao).updateClientStatus(client);
		assertThat(retreiveDataService).isNotNull();
	}

}
