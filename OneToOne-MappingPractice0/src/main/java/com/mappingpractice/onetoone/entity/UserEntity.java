package com.mappingpractice.onetoone.entity;

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
@Table(name="user_table")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private int userId;
    
    @Column(name="user_name")
    private String userName;
    
    @Column(name="user_education")
    private String userEducation;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="address_id")
    private AddressEntity addressEntity;
    
}
