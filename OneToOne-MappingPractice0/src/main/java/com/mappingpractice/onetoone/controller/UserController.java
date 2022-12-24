package com.mappingpractice.onetoone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mappingpractice.onetoone.entity.UserEntity;
import com.mappingpractice.onetoone.service.UserService;

@RestController
public class UserController 
{
    @Autowired
    UserService userService;
    
    @PostMapping("/saveuser")
    public void saveUser(@RequestBody UserEntity userEntity)
    {
        userService.saveUser(userEntity);
    }
}
