package com.Trade.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Trade.model.User;
import com.Trade.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository repo;
	@Override
	public User save(User user) {
		return repo.save(user);
	}
	@Override
	public List<User> getUserList() {
		
		return (List<User>) repo.findAll();
	}
	@Override
	public User getUser(int id) {
		
		return repo.findByUserId(id);
	}

}
