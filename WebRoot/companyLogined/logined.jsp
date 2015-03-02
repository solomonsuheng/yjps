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

<title>易居</title>

<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="css/sticky-footer-navbar.css" rel="stylesheet">

<script>
	function bodyload() {
		//调用后台获取信息
		$.get("newsServlet", function(data, status) {
			var dataNews = eval('(' + data + ')');
			for (var i = 0; i < dataNews.length; i++) {

				if (dataNews[i].ntype == 1) {
					$("#newsInfo").append(
							"<tr><td>公司新闻:" + dataNews[i].ntitle + "</td><td>"
									+ dataNews[i].ncontent
									+ "</td><td>add</td><td>delete</td></tr>");
				} else {
					$("#newsInfo").append(
							"<tr><td>市场动态:" + dataNews[i].ntitle + "</td><td>"
									+ dataNews[i].ncontent
									+ "</td><td>add</td><td>delete</td></tr>");
				}
			}
		});
	}
</script>
</head>

<body onload="bodyload()">

	<!-- Fixed navbar -->
	<jsp:include page="../includePage/header.jsp"></jsp:include>
	<!-- Begin page content -->
	<hr />
	<div class="container">
		<div class="panel panel-default">
			<table class="table" id="newsInfo">
				<tr>
					<td>标题</td>
					<td>内容</td>
					<td>操作</td>
				</tr>
			</table>
		</div>
	</div>

	<jsp:include page="../includePage/footer.jsp"></jsp:include>
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>