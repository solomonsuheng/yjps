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
</head>

<body>

	<!-- Fixed navbar -->

	<jsp:include page="includePage/header.jsp"></jsp:include>
	<!-- Begin page content -->
	<div class="container">
		<div class="page-header">
			<h1>Sticky footer with fixed navbar</h1>
		</div>
		<p class="lead">
			Pin a fixed-height footer to the bottom of the viewport in desktop
			browsers with this custom HTML and CSS. A fixed navbar has been added
			with
			<code>padding-top: 60px;</code>
			on the
			<code>body &gt; .container</code>
			.
		</p>
		<p>
			Back to <a href="#">the default sticky footer</a> minus the navbar.
		</p>
	</div>

	<jsp:include page="includePage/footer.jsp"></jsp:include>
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>