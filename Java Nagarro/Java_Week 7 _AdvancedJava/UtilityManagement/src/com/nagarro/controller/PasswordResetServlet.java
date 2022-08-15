package com.nagarro.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nagarro.interf.LoginServiceInterface;
import com.nagarro.interfImpl.LoginService;

public class PasswordResetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PasswordResetServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Welcome in Password Reset Servlet");	
		response.setContentType("text/html");
		String userName = request.getParameter("userName");
		String newPassword = request.getParameter("newPassword");
		String confirmPassword = request.getParameter("confirmPassword");
		if(newPassword.equals(confirmPassword))
		{
			LoginServiceInterface serv = new LoginService();
			boolean isSuccessfulReset = serv.resetPassword(userName, newPassword);
			if(isSuccessfulReset)
			{
				response.sendRedirect("index.jsp");
			}
			else
			{
				response.sendRedirect("resetPassword.jsp");
			}	
		}
		else
		{
			response.sendRedirect("resetPassword.jsp");
		}
	}

}
