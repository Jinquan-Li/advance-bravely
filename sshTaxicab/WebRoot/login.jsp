<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
     <script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
	<script type="text/javascript" src="js/jquery-ui.min.js"></script>
	<link rel="stylesheet" type="text/css" href="jquery-ui.min.css">
	<script type="text/javascript">
		function check(){
			var userName = $("#user").val();
			var userPass = $("#userPass").val();
			if(userName==""){
				alert("用户名不能为空");
				return false ;
			}else if(userPass.length==0){
				alert("密码不能为空");
				return false ;
			}else{
				document.car.submit();
			}
		}
		</script>  
  </head>
  
  <body>
  	<form action="user-doLogin.action" name="car"  onsubmit="return check()" method="post">
			<tr>
				<center><td><b>汽车租赁管理系统</b></td></center>
			</tr>
  		<table align="center" width="40%" height="20%" border="1">
  			<tr>
  				<td>用户名：</td>
  				<td><input type="text" id="user" name="user.userName"></td>
  			</tr>
  			<tr>
  				<td>密码：</td>
  				<td><input type="password" id="userPass"  name="user.userPass"></td>
  			</tr>
  			<tr>
  				<td><input type="submit" value="登录" onclick="check()" size="40"></td>
  				<td><input type="reset" value="重置" size="40"></td>
  			</tr>
  		</table>
  	</form>
  </body>
</html>
