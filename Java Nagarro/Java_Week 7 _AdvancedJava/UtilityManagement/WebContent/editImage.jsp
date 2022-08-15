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
<meta charset="ISO-8859-1">
<title>edit Image</title>
<link rel="stylesheet" type="text/css" href="CSS\homepagestyle.css">

</head>
<body>

	<div class="container">
		<h2>Image Management Tool<h2>
		<%
		User user = (User)session.getAttribute("user");
		String username = user.getUsername();
		LoginServiceInterface lsi = new LoginService();
		/* User valid = lsi.getUser(username); */
		User valid=lsi.getUser(username);
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

	</div>


	<%
		System.out.println(session.getAttribute("serialno"));
	System.out.println(session.getAttribute("name"));
	System.out.println(session.getAttribute("size"));
	%>

	<form action="EditImageServletNew" method="post" id="imageBrowse"
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
		<!-- </form> -->

		<h4>Uploaded Images</h4>

		<div id="images">
			<table style="width:100%" border="" id="imagetable">
				<tr>
					<th class="header">S.No.</th>
					<th class="header">Title</th>
					<th class="header">Quantity</th>
					<th class="header">Size</th>
					<th class="header">Preview</th>
				<tr>
					<td class="data"><%=session.getAttribute("serialno") %></td>
					<td class="data"><%=session.getAttribute("name") %></td>
					<td class="data"><%=session.getAttribute("qty") %></td>
					<td class="data"><%=session.getAttribute("size")%></td>
					<td class="data"><a
						href="ImageFetcherServlet?serialNo=<%=session.getAttribute("serialno") %>">
							<img
							src="ImageFetcherServlet?serialNo=<%=session.getAttribute("serialno")%>"
							style="height: 150px;" />
					</a></td>
			</table>
		</div>
	</form>

</body>
</html>