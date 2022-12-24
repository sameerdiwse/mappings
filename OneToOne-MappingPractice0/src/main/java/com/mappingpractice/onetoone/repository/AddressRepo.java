package com.mappingpractice.onetoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mappingpractice.onetoone.entity.AddressEntity;

public interface AddressRepo extends JpaRepository<AddressEntity,Integer>{
    
}