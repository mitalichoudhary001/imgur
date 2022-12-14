package com.syf.imgur.test.rest.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.syf.imgur.test.rest.entity.User;


public interface UserService {

	Logger logger = LoggerFactory.getLogger(UserService.class);

	// Save operation
	User saveUser(User user);

	// Read operation
	User getUser();

}
