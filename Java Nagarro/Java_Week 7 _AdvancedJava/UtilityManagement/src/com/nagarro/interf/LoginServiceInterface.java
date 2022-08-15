package com.nagarro.interf;

import com.nagarro.model.User;

public interface LoginServiceInterface {

	boolean isUser(String userName, String password);
	boolean resetPassword(String userName, String password);
	User getUser(String username);
	boolean getUser(String username, String password);
	boolean addUser(String username, String email, String firstname, String lastname, String password);

}
