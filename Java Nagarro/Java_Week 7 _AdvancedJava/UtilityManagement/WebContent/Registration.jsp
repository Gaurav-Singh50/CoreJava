<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="RegisterServlet">
		<table>
			<tr>
				<td style="align: Right"><b>Register</b></td>
			</tr>
			<tr>
				<td>User Name*</td>
				<td><input type="text" name="userName"></td>
			</tr>
			<tr>
				<td>Email*</td>
				<td><input type="email" name="email"></td>
			</tr>
			<tr>
				<td>First Name*</td>
				<td><input type="text" name="fisrtName"></td>
			</tr>
			<tr>
				<td>Last Name*</td>
				<td><input type="text" name="lastName"></td>
			</tr>
			<tr>
				<td>Password*</td>
				<td><input type="password" id="pwd" name="password"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Register ->" id="btn"></td>
			</tr>
		</table>
	</form>
</body>
</html>