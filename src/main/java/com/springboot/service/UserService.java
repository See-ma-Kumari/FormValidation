package com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.UserRepository;
import com.springboot.model.User;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	public void saveUser(User u) {
		userRepository.save(u);
	}

}
