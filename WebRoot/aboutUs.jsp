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

<title>易居|关于我们</title>

<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="css/sticky-footer-navbar.css" rel="stylesheet">

<script type="text/javascript">
	//当页面加载时调用函数
	function bodyLoad() {
		//调用后台获取信息
		$.get("newsServlet", function(data, status) {
			var dataNews = eval('(' + data + ')');
			for (var i = 0; i < dataNews.length; i++) {

				if (dataNews[i].ntype == 1) {
					$("#newsInfo").append(
							"<tr><td>公司新闻:" + dataNews[i].ntitle + "</td><td>"
									+ dataNews[i].ncontent + "</td></tr>");
				} else {
					$("#newsInfo").append(
							"<tr><td>市场动态:" + dataNews[i].ntitle + "</td><td>"
									+ dataNews[i].ncontent + "</td></tr>");
				}
			}
		});
	}
</script>


</head>

<body onload="bodyLoad()">
	<jsp:include page="includePage/header.jsp"></jsp:include>
	<!-- Begin page content -->
	<div class="container">
		<div class="row">
			<div class="col-md-6 col-md-4" id="newsInfo2"></div>
		</div>
		<hr />
		<div class="row">
			<div class="col-md-6 col-md-4" id="markInfo2"></div>
		</div>
		<div class="panel panel-default">
			<table class="table" id="newsInfo">
				<tr>
					<td>标题</td>
					<td>内容</td>
				</tr>
			</table>
		</div>
	</div>


	</div>
	<jsp:include page="includePage/footer.jsp"></jsp:include>
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>