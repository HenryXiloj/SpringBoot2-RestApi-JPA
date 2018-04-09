package com.hxiloj.test.service;

import java.util.List;

import com.hxiloj.base.service.BaseService;
import com.hxiloj.model.User;

public interface UserService extends BaseService<User, Long> {

	User findByEmailAddress(String emailAddress);
	 public List<User> findByName();
}
