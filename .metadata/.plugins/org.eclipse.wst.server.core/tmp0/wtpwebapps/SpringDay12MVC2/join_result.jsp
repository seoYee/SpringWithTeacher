<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>join_result.jsp</title>
</head>
<body>
<h3>회원가입 (가짜로) 완료</h3>
	<table>
		<tr>
			<td>이름</td>
			<td>${joinMember.name}</td>
		</tr>
		<tr>
			<td>아이디</td>
			<td>${joinMember.id}</td>
		</tr>
		<tr>
			<td>이메일</td>
			<td>${joinMember.email}</td>
		</tr>
		<tr>
			<td>주소</td>
			<td>${joinMember.address}</td>
		</tr>
		
	</table>
</body>
</html>