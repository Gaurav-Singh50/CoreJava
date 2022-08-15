package com.nagarro.controllers;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.initializer.Initializer;
import com.nagarro.models.User;
import com.nagarro.services.LoginSignupService;

@Controller
public class LoginSignUpController {
	
	final LoginSignupService service = new LoginSignupService();
	
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView view = new ModelAndView();
		
		String username = request.getParameter("userName");
		String password = request.getParameter("password");
		
		if(service.isUser(username,password))
		{
			System.out.println("Login Successful");
			User user = service.getUser(username);
			request.getSession().setAttribute("authorized",true);
			request.getSession().setAttribute("user",user);
			new Initializer().initialize();
			view.setViewName("search.jsp");
			view.addObject("User",username);
		}
		else
		{
			request.setAttribute("message","Invalid login");
			view.setViewName("index.jsp");
		}
		return view;
		
	}
	
	@RequestMapping("/register")
	public ModelAndView signup(HttpServletRequest request, HttpServletResponse response) {
		
		ModelAndView view = new ModelAndView(); 
			
		String username = request.getParameter("userName");
		String password = request.getParameter("password");


		boolean ans= service.addUser(username,password);
		if(ans) {
			System.out.println("registered successfully");
			view.setViewName("index.jsp");
		}
		else {
			System.out.println("not registered successfully");
			view.setViewName("registration.jsp");
		}
		
		return view;
		
	}
}
