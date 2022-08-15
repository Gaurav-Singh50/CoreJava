package com.nagarro.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nagarro.interf.LoginServiceInterface;
import com.nagarro.interfImpl.LoginService;

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegisterServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter Out = response.getWriter();
		String username = request.getParameter("userName");
		String email=request.getParameter("email");
		String firstname=request.getParameter("fisrtName");
		String lastname=request.getParameter("lastName");
		String password = request.getParameter("password");

		LoginServiceInterface loginService = new LoginService();
		boolean ans= loginService.addUser(username,email,firstname,lastname,password);
		if(ans) {
			System.out.println("register successfully");
			response.sendRedirect("index.jsp");
		}
		else {
			System.out.println("register not successfully");
			response.sendRedirect("Registration.jsp");
		}
		Out.close();
	}

}
