<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="tologin1.do" method="POST" >
	账号:<input type="text" placeholder="请输入账号"  name="name"><br>
	密码:<input type="password" placeholder="请输入密码"  name="password"><br>
	<input type="submit" value="登录">${msg}
	</form>
</body>
</html>