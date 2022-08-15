package com.nagarro.product_catalogue.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.product_catalogue.model.User;

public interface UserRepositry extends JpaRepository<User,Long>{
	
	
	public User findByusername(String username);
	
	

}
