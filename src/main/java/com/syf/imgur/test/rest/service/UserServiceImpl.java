package com.syf.imgur.test.rest.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syf.imgur.test.rest.dao.UserRepository;
import com.syf.imgur.test.rest.entity.User;

@Service
public class UserServiceImpl implements UserService {

	Logger logger=LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User saveUser(User user) {
		logger.info("user" +user.toString());
		return userRepository.save(user);
	}

	@Override
	public User getUser() {
		// TODO Auto-generated method stub
		return null;
	}
}
