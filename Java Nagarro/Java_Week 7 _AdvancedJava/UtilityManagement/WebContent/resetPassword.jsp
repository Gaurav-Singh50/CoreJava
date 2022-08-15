<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="CSS\index.css">
</head>
<body>
	<h3>Reset your password</h3>
	<form method="post" action="PasswordResetServlet">
		<table style="text-align: center">
			<tr>
				<td>UserName</td>
				<td><input type="text" name="userName"></td>
			</tr>
			<tr>
				<td>Enter new Password</td>
				<td><input type="password" name="newPassword"></td>
			</tr>
			<tr>
				<td>Confirm Password</td>
				<td><input type="password" name="confirmPassword"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" id="btn"></td>
			</tr>
		</table>
	</form>
</body>
</html>