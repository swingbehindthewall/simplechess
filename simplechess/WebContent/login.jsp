<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<STYLE type="text/css">
		#login {
			width: 400px;
			height: 280px;
			position: absolute;
			left: 50%;
			top: 50%;
			margin-left: -200px;
			margin-top: -140px;
			border: 1px;
			align: center;
		}

		#form {
			width: 300px;
			height: 160px;
			position: relative;
			left: 50%;
			top: 50%;
			margin-left: -150px;
			margin-top: -80px;
		}
	</STYLE>
</head>
<body>

	<div align="center">
		<%
			try{
			if((Integer)request.getAttribute("flag")==1)
				out.write("注册成功！");
			}
			catch(Exception e){
			}
		%>
	</div>
	<!-- <div>
		<input type="button" value="开始一次游戏" onclick="">
	</div> -->
	<div id="login">
		<div id="form">
		<form action="login.action" style="height: 100%" method="post">
			昵称:<input type="text" name="nickname" size="30"> <br/><br/><br/>
			密码:<input type="password"name="password" size="30"> <br/><br/><br/>
			<div align="center">
				<input type="button" style="vertical-align: middle;" value="没有账号，注册" onclick="location='register.jsp'">
				<input type="submit" style="vertical-align: middle;" value="登录">
			</div>
		</form>
		</div>
	</div>
</body>
</html>