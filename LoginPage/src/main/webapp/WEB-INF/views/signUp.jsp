<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign Up Page</title>
</head>
<body>
	<div>
		<h2>Sign Up</h2>
		<form action="">
		<ul>
			<li>Name : <input type="text" name="name"></li>
			<li>ID : <input type="text" name="id"></li>
			<li>PW : <input type="password" name="pw"></li>
			<li>Email : <input type="email" name="email"> <button type="button" onclick>이메일 인증</button></li>
			<li style="display: none;"><input placeholder="인증 번호 입력"></li>
			<li>HP : <input name="hp"> <button type="button" onclick="">인증</button></li>
			<li style="display: none;"><input placeholder="인증 번호 입력"></li>
		</ul>
		</form>
	</div>
</body>
</html>