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

<title>易居|加入我们</title>

<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="css/sticky-footer-navbar.css" rel="stylesheet">

<script src="js/jquery.min.js"></script>

<script>
	$(document).ready(function() {
		$("#goResume").click(function() {
			$("#rname").val();
		});
	});
</script>


</head>

<body>

	<!-- Fixed navbar -->

	<jsp:include page="includePage/header.jsp"></jsp:include>
	<!-- Begin page content -->
	<div class="container">
		<div class="page-header">
			<h1>简历建立</h1>
		</div>
		<p class="lead">
		<div class="input-group">
			<input type="text" class="form-control" placeholder="用户名" id="rname">
			<input type="text" class="form-control" placeholder="职位"
				id="rposition"> <input type="text" class="form-control"
				placeholder="期望资金" id="rmoney"> <input type="text"
				class="form-control" placeholder="性别" id="rsex"> <input
				type="text" class="form-control" placeholder="年龄" id="rbirthday">
			<input type="text" class="form-control" placeholder="ID卡"
				id="ridcard"> <input type="text" class="form-control"
				placeholder="电话" id="rtel">
		</div>
		</p>

		<p>
			<button type="button" class="btn btn-primary" id="goResume">提交</button>
		</p>
	</div>

	<jsp:include page="includePage/footer.jsp"></jsp:include>

	<script src="js/bootstrap.min.js"></script>
</body>
</html>