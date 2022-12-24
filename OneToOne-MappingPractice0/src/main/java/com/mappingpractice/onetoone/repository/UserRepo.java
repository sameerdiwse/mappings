package com.mappingpractice.onetoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mappingpractice.onetoone.entity.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity,Integer>{
    
}
