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
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="http://v3.bootcss.com/favicon.ico">

<title>易居后台管理系统</title>

<!-- Bootstrap core CSS -->
<link href="../css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="../css/dashboard.css" rel="stylesheet">
<script type="text/javascript">
	//当页面加载时调用函数
	function bodyLoad() {
		//调用后台获取信息
		$.post("http://localhost:8080/yjps/resumeServlet", function(data,
				status) {
			var dataNews = eval('(' + data + ')');
			for (var i = 0; i < dataNews.length; i++) {

				if (dataNews[i].ntype == 1) {

				} else {
					$("#newsInfo").append(
							"<tr><td>" + dataNews[i].rposition + "</td><td>"
									+ dataNews[i].rname + "</td><td>$"
									+ dataNews[i].rmoney + "</td></tr>");
				}
			}
		});
	}
</script>
</head>

<body onload="bodyLoad()">
	<jsp:include page="header.jsp"></jsp:include>

	<div class="container-fluid">
		<div class="row">
			<jsp:include page="content.jsp"></jsp:include>
			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
				<h1 class="page-header">招聘信息管理</h1>

				<div class="table-responsive">
					<table class="table table-striped">
						<thead>
							<tr>
								<th>职位</th>
								<th>姓名</th>
								<th>要求薪资</th>
							</tr>
						</thead>
						<tbody id="newsInfo">
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>

	<script src="../js/jquery.min.js"></script>
	<script src="../js/bootstrap.min.js"></script>
</body>
</html>