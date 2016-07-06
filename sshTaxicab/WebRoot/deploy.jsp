<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'deploy.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
			<h2><center><s:property value="#b.brandName"/>轿车配置信息</h2></center> 
  		<table align="center" width="35%" border="1">
  			<tr>
  				<td>厂商:</td>
  				<td><s:property value="deploy.deployName"/> </td>
  			</tr>
  			<tr>
  				<td>燃料类型:</td>
  				<td><s:property value="deploy.deployFuel"/> </td>
  			</tr>
  			<tr>
  				<td>排量:</td>
  				<td>1396 </td>
  			</tr>
  			<tr>
  				<td>座位数:</td>
  				<td><s:property value="deploy.deployNum"/></td>
  			</tr>
  			<tr>
  				<td>车门数:</td>
  				<td><s:property value="deploy.deployDoor"/></td>
  			</tr>
  			
  			
  		</table>
  </body>
</html>
