package com.techno.core.entities;

import java.io.Serializable;

import javax.persistence.*;

@SuppressWarnings("serial")
@Table(name = "Artist")
@Entity
public class Artist implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "art_id")
	long id;

	@Column(name = "art_name", nullable = false)
	String name;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "art_cathegory")
	Cathegory cathegory;

	@Column(name = "art_urlImg")
	String img;

	@Column(name = "art_description")
	String description;
	
	public Artist() {

	}

	public Artist(long id, String name, Cathegory cathegory, String img, String description) {
		this.id = id;
		this.name = name;
		this.cathegory = cathegory;
		this.img = img;
		this.description = description;
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

	public Cathegory getCathegory() {
		return cathegory;
	}

	public void setCathegory(Cathegory cathegory) {
		this.cathegory = cathegory;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
