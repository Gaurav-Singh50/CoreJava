package com.nagarro.controller;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nagarro.interf.LoginServiceInterface;
import com.nagarro.interfImpl.LoginService;
import com.nagarro.logic.HibernateLogic;
import com.nagarro.model.Image;
import com.nagarro.model.User;

@MultipartConfig
public class ImageServletNew extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ImageServletNew() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Reached Edit Image Servlet");
		Session session=HibernateLogic.sf.openSession();
//		int serialno=(Integer) request.getSession().getAttribute("serialno");
//		System.out.println(serialno);
		if(request.getSession().getAttribute("user") == null)
		{
			request.getRequestDispatcher("index.jsp").forward(request,response);
		}
		else {
			Image img=new Image();
			String title=request.getParameter("title");
			String qty=request.getParameter("qty");
			String size=request.getParameter("size");
			System.out.println(title + " " + qty + " " + size);
			img.setTitle(title);
			img.setQuantity(qty);
			img.setProdsize(size);

			Part part=request.getPart("imagename");

			InputStream is=null;
			if(part != null) 
				is=part.getInputStream();
			byte[] data=new byte[is.available()];
			is.read(data);
			img.setImage(data);

			User user = (User)request.getSession().getAttribute("user");
			img.setUser(user);

			Transaction tx=null;
			try {
				tx=session.beginTransaction();
				session.persist(img);
				LoginServiceInterface lsi= new LoginService();
				User userUpdated = lsi.getUser(((User)request.getSession().getAttribute("user")).getUsername());
				request.getSession().setAttribute("user",userUpdated);
				System.out.println("Image Uplaoded Successfully");
				request.getSession().setAttribute("message","File Uploaded Successfully");

				int sno=img.getSerialNo();
				request.getSession().setAttribute("sno", sno);

				tx.commit();

				request.setAttribute("message", "file uploaded");
			} catch (Exception e) {
				request.setAttribute("message", "problem");
			}
			request.getRequestDispatcher("homepage.jsp").forward(request, response);
		}


	}

}
