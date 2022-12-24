package com.mappingpractice.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "user_address")
public class AddressEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="address_id")
	private int addId;
	
	@Column(name = "add_city")
	private String addCity;
	
	@Column(name = "add_colony")
	private String addColony;
	
	@JoinColumn(name="user_id")
	@OneToOne(cascade = CascadeType.ALL)
	private UserEntity userEntity;

}
