package com.nagarro.viewInterf;

import com.nagarro.model.User;

public interface UserViewInterface {

	boolean resetPassword(String userName, String password);
	boolean isUser(String userName, String password);
	User getUser(String username);
	boolean addUser(String username, String email,  String firstname, String lastname, String password);

}
