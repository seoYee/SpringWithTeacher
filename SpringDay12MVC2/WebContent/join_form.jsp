<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원가입화면</title>
</head>
<body>
<form action="join.do" method="post">
	<table border="1">
		<tr>
			<td>아이디</td>
			<td>
				<input type="text" name="id" size="10">
			</td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td>
				<input type="password" name="password" size="10">
			</td>
		</tr>
		<tr>
			<td> 이름</td>
			<td>
				<input type="text" name="name" size="10">
			</td>
		</tr>
		<tr>
			<td> 이메일 </td>
			<td> 
				<input type="text" name="email" size="10">
			</td>
		</tr>
		<tr>
			<td> 주소 </td>
			<td>
				<input type="text" name="address" size="10">
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="회원가입">
			</td>		
	
	</table>
</form>

</body>
</html>