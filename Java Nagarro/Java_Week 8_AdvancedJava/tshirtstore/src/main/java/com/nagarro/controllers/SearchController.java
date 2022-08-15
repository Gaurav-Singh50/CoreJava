package com.nagarro.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.checkfiles.FindFiles;
import com.nagarro.initializer.Initializer;
import com.nagarro.models.Tshirt;
import com.nagarro.tshirtstore.FindTshirts;

@Controller
public class SearchController {
	
	final ModelAndView view = new ModelAndView();
	final FindFiles files = new FindFiles();
	final FindTshirts find = new FindTshirts();
	@RequestMapping("/search")
	public ModelAndView search(HttpServletRequest request, HttpServletResponse response) {
		try {
			files.checkForUpdate(Initializer.startTime);
		} catch (IOException e) {
			e.printStackTrace();
		}
		List<Tshirt> availableTshirts = find.getAvailableTshirts(request, response);
		if(availableTshirts.size() > 0) {
			view.setViewName("home.jsp");
			view.addObject("data",availableTshirts);
		}
		else {
			view.setViewName("search.jsp");
		}
		return view;
		
		
	}
	
}
