package com.nagarro.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nagarro.interf.ProductServiceInterface;
import com.nagarro.interfImpl.ProductService;

public class ImageDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public ImageDeleteServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int serialno = Integer.parseInt(request.getParameter("serialNo"));
		System.err.println(serialno);
		if(request.getSession().getAttribute("user") == null)
		{
			request.getRequestDispatcher("index.jsp").forward(request,response);
		}
		else {
			ProductServiceInterface isi = new ProductService();
			boolean ans=isi.deleteImage(serialno);
			if(ans) {
				request.getRequestDispatcher("homepage.jsp").forward(request,response);
				System.out.println("image is deleted of serial no: " + serialno);
			}
			else {
				System.out.println("image can't be deleted");
			}
		}
	}

}
