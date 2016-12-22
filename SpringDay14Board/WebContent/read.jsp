<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>글 읽기 화면</title>
</head>
<body>
<table>
	<tr>
		<td>제목:</td>
		<td>${article.writer }</td>
	</tr>
	<tr>
		<td>조회수:</td>
		<td>${article.readCount}</td>
	</tr>
	<tr>
		<td>작성자:</td>
		<td>${article.writer }</td>
	</tr>
	<tr>
		<td>작성일:</td>
		<td>${article.writeDate }</td>
	</tr>
	<tr>
		<td>내용:</td>
		<td>${article.content} </td>
	</tr>
</table>
</body>
</html>