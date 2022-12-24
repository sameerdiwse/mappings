package com.mappingpractice.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mappingpractice.demo.entity.AddressEntity;
import com.mappingpractice.demo.repo.AddressRepo;
import com.mappingpractice.demo.repo.UserRepo;

@RestController
public class Controller {
	
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	AddressRepo addressRepo;
	
	@PostMapping("/saveuser")
	public void saveUser(@RequestBody AddressEntity addressEntity)
	{
		addressRepo.save(addressEntity);
	}

}
