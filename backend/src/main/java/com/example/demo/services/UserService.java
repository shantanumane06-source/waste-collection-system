package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;
	
	public UserEntity registerUser(UserEntity user) {
		return userRepo.save(user);
	}
	
	public List<UserEntity>getAllUsers(){
		return userRepo.findAll();
	}
	
	public Optional<UserEntity> getUserById(Long id){
		return userRepo.findById(id);
	}
	public Optional<UserEntity>getUserByName(String name){
		return userRepo.findByName(name);
	}
}
