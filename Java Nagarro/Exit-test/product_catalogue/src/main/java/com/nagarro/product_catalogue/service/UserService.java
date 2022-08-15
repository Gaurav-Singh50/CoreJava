package com.nagarro.product_catalogue.service;

import java.util.Set;

import com.nagarro.product_catalogue.model.User;
import com.nagarro.product_catalogue.model.UserRole;

public interface UserService {
	//creating user
	public User createUser(User user,Set<UserRole> userRoles) throws Exception;
	//get user by userName
	public User getUser(String username);
	
	//delete user by id
	public void deleteUser(Long userId);
	
	//update user by username
	public User updateUser(User user1);
	
}
