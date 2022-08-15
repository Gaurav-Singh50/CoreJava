<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Available Tshirts</title>
</head>
<body>
	<h2>Available Tshirts</h2>

	<div id="images">
		<table style="width:100%" id="imagetable" border="1">
			<tr>
				<th class="header">TShirtID</th>
				<th class="header">Name</th>
				<th class="header">Brand</th>
				<th class="header">Price</th>
				<th class="header">Rating</th>
				<th class="header">Availability</th>
			</tr>

			<c:forEach items="${data}" var="item">
				<tr>
					<td>${item.id}</td>
					<td>${item.name}</td>
					<td>${item.brand}</td>
					<td>${item.price}</td>
					<td>${item.rating}</td>
					<td>${item.available}</td>
				</tr>
				
			</c:forEach>

		</table>
	</div>

</body>
</html>