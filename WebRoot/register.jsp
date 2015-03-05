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
<script src="js/jquery.min.js"></script>
<script>
	$(document).ready(function() {
		$("#submit").click(function() {
			//点击注册按钮,判断是否为空
			if ($("#uname").val() == "") {
				$("#status1").text("用户名不能为空");
				return;
			}
			if ($("#upwd1").val() == "") {
				$("#status2").text("密码不能为空");
				return;
			}

			if ($("#upwd1").val() != $("#upwd2").val()) {
				$("#status3").text("两次密码不匹配");
				return;
			}

			//收入检测成功发送注册请求
			$.post("visitorRegisterServlet", {
				uname : $("#uname").val(),
				upwd1 : $("#upwd1").val(),
				upwd2 : $("#upwd2").val()
			}, function(data, status) {
				//注册成功直接进入主页
				self.location = "index.jsp";
			});
		});
	});
</script>
</head>

<body>

	<div class="container">

		<div class="form-signin">
			<h2 class="form-signin-heading">易居用户注册</h2>
			<label for="inputEmail" class="sr-only">用户名</label> <input
				type="text" id="uname" class="form-control" placeholder="用户名"
				required="" autofocus=""> <span id="status1"></span><label
				for="inputPassword" class="sr-only">密码</label> <input
				type="password" id="upwd1" class="form-control" placeholder="密码"
				required=""> <span id="status2"></span><input
				type="password" id="upwd2" class="form-control" placeholder="确认密码"
				required=""><span id="status3"></span>
			<button class="btn btn-lg btn-primary btn-block" onclick="return"
				id="submit">注册</button>
		</div>

	</div>
</body>
</html>