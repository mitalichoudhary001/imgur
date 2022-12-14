package com.syf.imgur.test.rest.messaging;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSender {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	@Value("${com.syf.test.imgur.user.name}")
	private String userName;
	public Logger logger=org.slf4j.LoggerFactory.getLogger(KafkaSender.class);
	
	public void send(String imageName) {
		logger.info("send:{}",userName,imageName);
		kafkaTemplate.send(userName, imageName);
		logger.info("Kafka message send username:{},imageName:{}",userName,imageName);
	}
}