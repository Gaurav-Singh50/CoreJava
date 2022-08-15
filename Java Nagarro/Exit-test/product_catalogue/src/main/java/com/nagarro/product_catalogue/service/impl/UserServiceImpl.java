package com.nagarro.product_catalogue.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.product_catalogue.model.User;
import com.nagarro.product_catalogue.model.UserRole;
import com.nagarro.product_catalogue.repositry.RoleRepositry;
import com.nagarro.product_catalogue.repositry.UserRepositry;
import com.nagarro.product_catalogue.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepositry userRepositry;
	@Autowired
	private RoleRepositry roleRepositry;
	
	@Override
	public User createUser(User user, Set<UserRole> userRoles) throws Exception {
		// TODO Auto-generated method stub
		User local=this.userRepositry.findByusername(user.getUsername());
		if(local!=null)
		{
			System.out.println("User is already there!!");
			throw new Exception("User is already present!!!");
		}
		else
		{
			//create user
			for(UserRole ur:userRoles)
			{
				roleRepositry.save(ur.getRole());
			}
			user.getUserRoles().addAll(userRoles);
			local=this.userRepositry.save(user);
			
		}
		return local;
	}
	//gettng user by username
	@Override
	public User getUser(String username) {
		// TODO Auto-generated method stub
		
		return this.userRepositry.findByusername(username);
	}
	@Override
	public void deleteUser(Long userId) {
		// TODO Auto-generated method stub
		this.userRepositry.deleteById(userId);
		
	}
	@Override
	public User updateUser(User user1) {
		// TODO Auto-generated method stub
		User user=userRepositry.findByusername(user1.getUsername());
		user.setFirstName(user1.getFirstName());
		user.setLastName(user1.getLastName());
		user.setEmail(user1.getEmail());
		user.setPhone(user1.getPhone());
		
		return this.userRepositry.save(user);
		
		
		
	}

}
