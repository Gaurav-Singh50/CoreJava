package com.nagarro.product_catalogue.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.nagarro.product_catalogue.model.User;
import com.nagarro.product_catalogue.repositry.UserRepositry;
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private UserRepositry userRepositry;
	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		User user=userRepositry.findByusername(username);
		if(user==null)
		{
			System.out.println("User Not Found");
			throw new UsernameNotFoundException("No user found !!");
			
		}
		return user;
	}
	

}
