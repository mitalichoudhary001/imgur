package com.syf.imgur.test.rest.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.syf.imgur.test.rest.entity.User;

//Interface extending CrudRepository
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}