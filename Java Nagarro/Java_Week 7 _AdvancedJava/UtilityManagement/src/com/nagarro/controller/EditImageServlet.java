package com.nagarro.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.apache.tomcat.util.http.fileupload.servlet.ServletRequestContext;

import com.nagarro.interf.ProductServiceInterface;
import com.nagarro.interf.LoginServiceInterface;
import com.nagarro.interfImpl.ProductService;
import com.nagarro.interfImpl.LoginService;
import com.nagarro.logic.ImageSizeLogic;
import com.nagarro.model.Image;
import com.nagarro.model.User;

public class EditImageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public EditImageServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Reached Edit Image Servlet");
		int serialno=(Integer) request.getSession().getAttribute("serialno");
		System.out.println(serialno);
		if(request.getSession().getAttribute("user") == null)
		{
			request.getRequestDispatcher("index.jsp").forward(request,response);
		}
		else
		{
			String title = null;
			int quantity=0;
			byte bytes[] = null;
			double size=0;

			if(ServletFileUpload.isMultipartContent(request))
			{
				try {
					DiskFileItemFactory factory = new DiskFileItemFactory();
					ServletFileUpload upload = new ServletFileUpload(factory);

					List<FileItem> fileItems = upload.parseRequest(new ServletRequestContext(request));
					for(FileItem item : fileItems)
					{
						if(item.isFormField())
						{
						
							title=item.getString();
						}
						else
						{
				
							quantity=Integer.parseInt(item.getString());
							size=item.getSize()/1024;
							bytes = item.get();
						}
					}
					request.setAttribute("message", "File Uploaded Successfully");

					User user = (User)request.getSession().getAttribute("user");
					Image img=new Image(title, quantity,size,bytes);
					img.setUser(user);

					if(user != null)
					{
						if(img.getSize()<1024)
						{
							System.out.println("Upload size limited!");
							if(ImageSizeLogic.getTotalImageSize(user.getUsername() + (img.getSize()<1024)))
							{
								ProductServiceInterface imgService = new ProductService();
								//								imgService.addImage(img);
								imgService.editImage(img, serialno);
								LoginServiceInterface lsi= new LoginService();
								User userUpdated = lsi.getUser(((User)request.getSession().getAttribute("user")).getUsername());
								request.getSession().setAttribute("user",userUpdated);
								System.out.println("Image Uplaoded Successfully");
								request.getSession().setAttribute("message","File Uploaded Successfully");

								int sno=img.getSerialNo();
								request.getSession().setAttribute("sno", sno);

								request.getRequestDispatcher("homepage.jsp").forward(request, response);


							}
							else
							{
								request.getSession().setAttribute("message","File Upload Failed");
								request.getRequestDispatcher("homepage.jsp").forward(request, response);


							}
						}
						else
						{
							request.getSession().setAttribute("message","File Upload Failed");
							request.getRequestDispatcher("homepage.jsp").forward(request, response);

						}
					}

				}catch(Exception e)
				{
					request.setAttribute("message", "File Upload Failed Due To "+e);
				}
			}
			else {
				request.setAttribute("message", "Apology!!File Upload Failed ");
			}	
		}
	}
	

}
