package com.techno.core.entities;

import java.io.Serializable;

import javax.persistence.*;

@SuppressWarnings("serial")
@Table(name = "Cathegory")
@Entity
public class Cathegory implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cat_id")
	long id;
	
	@Column(name = "cat_name")
	String name;

	public Cathegory() {
		
	}
	
	public Cathegory(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
