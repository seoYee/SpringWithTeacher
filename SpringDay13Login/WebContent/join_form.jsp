<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="join.do" method="post">
	<table border="1">
		<tr>
			<td>ID</td>
			<td><input type="text" name="id" size="10"></td>
		</tr>
		<tr>
			<td>PASSWORD</td>
			<td><input type="password" name="password" size="10"></td> 
		</tr>
		<tr>
			<td>E-MAIL</td>
			<td><input type="text" name="email"></td>
		</tr>
		<tr>
			<td>PHONE</td>
			<td><input type="text" name="phone"></td>
	</table>
	</form>
</body>
</html>