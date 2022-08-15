<%@page import="org.hibernate.Session"%>
<%@page import="com.nagarro.model.Image"%>
<%@page import="com.nagarro.interfImpl.LoginService"%>
<%@page import="com.nagarro.interf.LoginServiceInterface"%>
<%@page import="com.nagarro.model.User"%>
<%@page import="com.nagarro.*"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="CSS\homepagestyle.css">

<meta charset="ISO-8859-1">
<title>HomePage</title>
</head>
<body>

	<div class="container">
		<h2>Product Management Tool</h2>
		<%
		User user = (User)session.getAttribute("user");
		/* String unm=user.getUsername(); */
		LoginServiceInterface lsi = new LoginService();
		User valid=lsi.getUser(user.getUsername());
		if(valid != null)
		{
	%>
		<h3>
			Welcome,
			<%=valid.getUsername() %>!
		</h3>
		<%
		}
	%>
	
	<a class="logout" style= "float:right" href="index.jsp">Logout</a>
	
	</div>
	
	

	<form action="ImageServletNew" method="post" id="imageBrowse"
		enctype="multipart/form-data">
		<table>
			<tr>
				<th>Title</th>
				<td><input type="text" placeholder="Enter Title" name="title"></td>
			</tr>
			<tr>
				<th>Quantity</th>
				<td><input type="text" placeholder="Enter Quantity" name="qty"></td>
			</tr>
			<tr>
				<th>Size</th>
				<td><input type="text" placeholder="Enter Size" name="size"></td>
			</tr>
			<tr>
				<th>Image(max size:1MB)</th>
				<td><input type="file" name="imagename"></td>
			</tr>
		</table>
		<input type="submit" value="Submit" id="btn"> <input
			type="button" value="Cancel" id="btn">
	</form>

	<h4>Uploaded Images</h4>

	<div id="images">
		<table style="width:100%" id="imagetable" border="1">
			<tr>
				<th class="header">S.No.</th>
				<th class="header">Title</th>
				<th class="header">Quantity</th>
				<th class="header">Size</th>
				<th class="header">Preview</th>
				<th class="header">Actions</th>
			</tr>

			<%
				/* Set<Image> img = valid.getImage(); */
				Set<Image> img=valid.getImage();
				int a=0;
				if(!img.isEmpty())
				{
					//JAVA 8
					for(Image image : img)
					{
						a++;
			%>

			<tr>
				<td class="data"><%=a%></td>
				<td class="data" id="name"><%=image.getTitle() %></td>
				<td class="data" id="qty"><%=image.getQuantity() %></td>
				<td class="data" id="size"><%=image.getProdsize()%></td>
				<td class="data" id="image"><a
					href="ImageFetcherServlet?serialNo=<%=image.getSerialNo() %>">
						<img src="ImageFetcherServlet?serialNo=<%=image.getSerialNo()%>"
						style="height: 150px;" />
				</a></td>

				<%
					session.setAttribute("serialno", image.getSerialNo());
					session.setAttribute("name", image.getTitle());
					session.setAttribute("qty", image.getQuantity());
					session.setAttribute("size", image.getProdsize());
				%>
				<%-- <%-- <td class="data"><a href="editImage.jsp?serialNo=<%=image.getSerialNo()%>">Edit</a> --%>
				<td class="data"><a href="editImage.jsp">Edit</a> <a
					href="ImageDeleteServlet?serialNo=<%=image.getSerialNo()%>">Delete</a>
				</td>

			</tr>

			<%	}
				}
					else
					{
			%>

			<tr>
				<td>No Image Found!</td>
			</tr>
			<%} %>

		</table>
	</div>

</body>
</html>
