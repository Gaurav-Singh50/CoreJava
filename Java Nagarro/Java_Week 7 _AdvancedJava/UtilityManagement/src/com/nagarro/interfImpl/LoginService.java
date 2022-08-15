package com.nagarro.interfImpl;

import com.nagarro.interf.LoginServiceInterface;
import com.nagarro.model.User;
import com.nagarro.viewInterf.UserViewInterface;
import com.nagarro.viewInterfImpl.UserView;

public class LoginService implements LoginServiceInterface {

	public boolean isUser(String userName, String password) {
		UserViewInterface view = new UserView();
		boolean trueUser = view.isUser(userName, password);
		if(trueUser)
		{
			return true;
		}
		return false;	
	}

	public boolean resetPassword(String userName, String password) {
		UserViewInterface view = new UserView();
		boolean successfulReset = view.resetPassword(userName, password);
		if(successfulReset)
		{
			System.out.println("Password reset successful");
			return true;
		}
		else
		{
			System.out.println("Error ocurred in password reset");
		}
		return false;
	}

	public boolean getUser(String username, String password) {
		UserViewInterface view = new UserView();
		boolean trueUser = view.isUser(username, password);
		if(trueUser)
		{
			return true;
		}
		return false;
	}

	public User getUser(String username) {
		UserViewInterface view=new UserView();
		return view.getUser(username);
	}

	public boolean addUser(String username, String email, String firstname, String lastname, String password) {
		// TODO Auto-generated method stub
		UserViewInterface view=new UserView();
		boolean ans=view.addUser(username,email,firstname,lastname,password);
		if(ans)
			return true;
		else
			return false;
	}

}
