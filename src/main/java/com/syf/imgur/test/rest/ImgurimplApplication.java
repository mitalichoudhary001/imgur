package com.syf.imgur.test.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ImgurimplApplication {
	
	static Logger logger=LoggerFactory.getLogger(ImgurimplApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(ImgurimplApplication.class, args);
		logger.info("Test");
	}

}
