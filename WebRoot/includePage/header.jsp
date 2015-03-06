<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<nav class="navbar navbar-default navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="http://localhost:8080/yjps/index.jsp">易居</a>
		</div>
		<div id="navbar" class="collapse navbar-collapse">
			<ul class="nav navbar-nav">
				<li class="active"><a
					href="http://localhost:8080/yjps/index.jsp">首页</a></li>
				<li><a href="#">二手房信息</a></li>
				<li><a href="#">出租房信息</a></li>
				<li><a href="#">房产咨询</a></li>
				<li><a href="#">房产经纪人</a></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-expanded="false">更多 <span
						class="caret"></span>
				</a>
					<ul class="dropdown-menu" role="menu">
						<li><a href="http://localhost:8080/yjps/register.jsp">用户/经纪人注册</a></li>
						<li><a href="http://localhost:8080/yjps/login.jsp">用户/经纪人登录</a></li>
						<li class="divider"></li>
						<li class="dropdown-header"></li>
						<li><a href="clogin.jsp">信息管理</a></li>
					</ul></li>
			</ul>

		</div>
		<!--/.nav-collapse -->
	</div>
</nav>