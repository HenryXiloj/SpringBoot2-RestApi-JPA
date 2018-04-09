package com.hxiloj.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hxiloj.base.service.impl.BaseServiceImpl;
import com.hxiloj.model.User;
import com.hxiloj.test.dao.UserRepository;
import com.hxiloj.test.service.UserService;

@Service
public class UserServiceImpl extends BaseServiceImpl<User, Long> implements UserService{

	@Autowired(required=true)
	UserRepository userRepository;
	
	@Override
	public User findByEmailAddress(String emailAddress) {
		return userRepository.findByEmailAddress(emailAddress);
	}

	@Override
	public List<User> findByName() {
		// TODO Auto-generated method stub
		return userRepository.findByName();
	}

}
