<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'addBrand.jsp' starting page</title>
  </head>
  
  <body>
		<h2>增加车辆基本信息</h2>
	<form action="brand-doAddAll.action" method="post">
		<table align="center" >
			<tr>
				<td>品牌:</td>
				<td><input type="text" name="brand.brandName"></td>
			</tr>
			<tr>
				<td>车牌号：</td>
				<td><input type="text" name="brand.brandNum"></td>
			</tr>
			<tr>
				<td>厂商：</td>
				<td><input type="text" name="deploy.deployName"></td>
			</tr>
			<tr>
				<td>燃料类型：</td>
				<td><input type="text" name=deploy.deployFuel"></td>
			</tr>
			<tr>
				<td>座位数:</td>
				<td><input type="text" name="deploy.deployNum"></td>
			</tr>
			<tr>
				<td>车门数:</td>
				<td><input type="text" name="deploy.deployDoor"></td>
			</tr>
			<tr>
				<td>出租价格:</td>
				<td><input type="text" name="brand.brandPrice">(天)</td>
			</tr>
			<tr>
				<td>描述:</td>
				<td><textarea name="brand.brandText" cols="17" rows="3"></textarea></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="保存车辆信息"></td>
			</tr>
			<tr>
				<td colspan="2"> <center><a href="brand-dolist.action"> 返回</a></center></td>
			</tr>
			
		</table>
	</form>
  </body>
</html>
