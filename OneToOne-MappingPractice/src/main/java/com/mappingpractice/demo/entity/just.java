package com.mappingpractice.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="just_table")
public class just {

	@Id
	@Column(name ="just_id")
	private int just_id;
}
