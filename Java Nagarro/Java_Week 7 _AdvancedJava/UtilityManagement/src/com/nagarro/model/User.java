package com.nagarro.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="userDetailsTable")
public class User 
{
	@Id
	@Column(name="username")
	private String username;
	@Column(name="useremail")
	private String email;
	@Column(name="firstname")
	private String firstname;
	@Column(name="lastname")
	private String lastname;
	@Column(name="userpassword")
	private String password;
	@OneToMany(mappedBy="user", cascade=CascadeType.DETACH, fetch=FetchType.EAGER, orphanRemoval=true)
	public Set<com.nagarro.model.Image> image = new HashSet<com.nagarro.model.Image>();

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<com.nagarro.model.Image> getImage() {
		return image;
	}

	public void setImage(Set<com.nagarro.model.Image> image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", firstname=" + firstname + ", lastname=" + lastname + ", username=" + username
				+ ", password=" + password + ", image=" + image + "]";
	}

	public User(String email, String firstname, String lastname, String username, String password,
			Set<com.nagarro.model.Image> image) {
		super();
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.image = image;
	}

	public User(String firstname2, String lastname2, String username2, String email2, String password2) {
	}

	public User() {
	}	
}

