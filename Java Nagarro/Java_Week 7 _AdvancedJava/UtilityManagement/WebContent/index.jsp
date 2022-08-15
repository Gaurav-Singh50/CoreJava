<html>
<link rel="stylesheet" type="text/css" href="CSS\index.css">
<body>
	<h2>Login to Product Management</h2>
	<form method="post" action="LoginServlet">
		<table>
			<tr>
				<td style="align: Right"><b>Login</b></td>
			</tr>
			<tr>
				<td>UserName*</td>
				<td><input type="text" name="userName" required></td>
			</tr>
			<tr>
				<td>Password*</td>
				<td><input type="password" id="pwd" name="password" required></td>
			</tr>
			<tr>
				<td><a href="resetPassword.jsp">Forgotten your Password?</a></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Login ->" id="btn"></td>
			</tr>
		</table>
	</form>
	<h3>
		New User <a href="Registration.jsp">Click here.....</a>
	</h3>
</body>
</html>
