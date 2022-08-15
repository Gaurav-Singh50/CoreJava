package com.nagarro.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nagarro.interf.LoginServiceInterface;
import com.nagarro.interfImpl.LoginService;
import com.nagarro.model.User;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public LoginServlet() {
        super();
       
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter Out = response.getWriter();
		String username = request.getParameter("userName");
		String password = request.getParameter("password");
		System.out.println(username + " " + password);
		RequestDispatcher reqDispatcher;

		LoginService service = new LoginService();
		if(service.isUser(username,password))
		{
			System.out.println("Login Successful");
			LoginServiceInterface loginService = new LoginService();
			User user = loginService.getUser(username);
			System.out.println(user.getUsername());
			request.getSession().setAttribute("authorized",true);
			request.getSession().setAttribute("user",user);
			request.getRequestDispatcher("homepage.jsp").forward(request, response);
		}
		else
		{
			request.setAttribute("message","Invalid login");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		Out.close();
	}

	}


