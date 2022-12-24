package com.mappingpractice.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mappingpractice.demo.entity.AddressEntity;

public interface AddressRepo extends JpaRepository<AddressEntity, Integer>{

}
