package com.techno.core.entities;

import java.io.Serializable;

import javax.persistence.*;


@SuppressWarnings("serial")
@Table(name = "User")
@Entity
public class User implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "usr_id")
	long id;
	
	@Column(name = "usr_fname", nullable = false)
	String firstName;
	
	@Column(name = "usr_lname", nullable = false)
	String lastName;
	
	@Column(name = "usr_nick", nullable = false)
	String nickName;
	
	@Column(name = "usr_pass", nullable = false)
	String password;
	
	@Column(name = "usr_urlImg")
	String img;
	
	public User() {
		
	}
	
	public User(long id, String firstName, String lastName, String nickName, String password, String img) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nickName = nickName;
		this.password = password;
		this.img = img;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getfirstName() {
		return firstName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
}
