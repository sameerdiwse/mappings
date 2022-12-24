package com.mappingpractice.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mappingpractice.demo.entity.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity, Integer> {

}
