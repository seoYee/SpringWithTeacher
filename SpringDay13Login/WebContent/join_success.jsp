<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>회원가입이 완료되었습니다.</h2>
	<table>
		<tr>
			<th>아이디</th>
			<th>전화번호</th>
			<th>이메일</th>
		</tr>
		<tr>
			<td>${joinMemberInfo.id }</td>
			<td>${joinMemberInfo.phone }</td>
			<td>${joinMemberInfo.email }</td>
		</tr>
	</table>
</body>
</html>