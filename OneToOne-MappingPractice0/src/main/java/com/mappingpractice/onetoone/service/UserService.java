package com.mappingpractice.onetoone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mappingpractice.onetoone.entity.UserEntity;
import com.mappingpractice.onetoone.repository.UserRepo;

@Service
public class UserService {
	@Autowired
	UserRepo userRepo;

    public void saveUser(UserEntity userEntity) {
        userRepo.save(userEntity);
    }
    
}
