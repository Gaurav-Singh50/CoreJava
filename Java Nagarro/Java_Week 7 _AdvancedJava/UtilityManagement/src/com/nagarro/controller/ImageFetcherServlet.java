package com.nagarro.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nagarro.interf.ProductServiceInterface;
import com.nagarro.interfImpl.ProductService;
import com.nagarro.model.Image;

public class ImageFetcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ImageFetcherServlet() {
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
		else
		{
			ProductServiceInterface isi = new ProductService();
			Image img = isi.getImage(serialno);
			if(img != null)
			{
				response.setContentType("img/jpeg, img/png,img.jpg,img/gif");
				try {
					response.getOutputStream().flush();
					response.getOutputStream().write(img.getImage());
					response.getOutputStream().close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
	}

}
