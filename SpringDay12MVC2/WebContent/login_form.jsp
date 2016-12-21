<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인 입력화면</title>
</head>
<body>
<!-- login_form.jsp -->
<form action="login.do" method="post">
	ID:<input type="text" name="userId" size="10"><br>
	PW:<input type="password" name="userPw" size="10"><br>
	숫자입력:<input type="number" name="num" size="10"><br>
	<input type="submit" value="로그인">

</form>

</body>
</html>