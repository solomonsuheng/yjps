<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>登录</title>

<link href="css/bootstrap.min.css" rel="stylesheet">

<link href="css/signin.css" rel="stylesheet">
</head>

<body>

	<div class="container">
		<form class="form-signin">
			<h2 class="form-signin-heading">易居公司信息管理</h2>
			<label for="inputEmail" class="sr-only">用户名</label> <input
				type="text" id="uname" class="form-control" placeholder="用户名"
				required="" autofocus=""> <label for="inputPassword"
				class="sr-only">密码</label> <input type="password" id="upwd"
				class="form-control" placeholder="密码" required="">
			<div class="checkbox">
				<label> <input type="checkbox" value="remember-me">
					记住我
				</label>
			</div>
			<button class="btn btn-lg btn-primary btn-block" type="submit">Sign
				in</button>
		</form>

	</div>
</body>
</html>