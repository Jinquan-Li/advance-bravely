<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
  <head>
    <title>汽车租赁查询</title>
    <script type="text/javascript">
    	$("#select").click(function (){
				var num1 = $("#num1").val();
				var num2 = $("#num2").val();
				var p = /^[0-9]{1,}$/;
				if(!p.test(num1) || !p.test(num2)){
					alert("请输入正确输入价格");
				}
			});
			
			function clickStatus(p){
    		var str = "租车";
    		if(p==1){
    			str = "还车";
    		}
    		window.event.returnValue = confirm("你确定"+str);
    	}
    </script>
  </head>
  
  <body>
  	  <center><h2>欢迎  <s:property value="#session.user.userName"/>登录</h2></center></br></br></br>
  	  	<form action="brand-doSelect.action" method="post">
  	  <table align="center"  width="50%" height="20%">
  	  		<tr>	
  	  			<td colspan="2">出租车查询条件</td>
  	  			<td colspan="2" align="right"><a href="addAll.jsp">新增车辆信息</a></td>
  	  			
  	  		</tr>
  	  		
  	  		<tr>
  	  			<td>车品牌：</td>
  	  			<td><input type="text" name="brandName"></td>
  	  		</tr>
  	  		<tr>
  	  			<td>价格范围</td>
  	  			<td><input type="text" id="num1" name="begien">至 </td>
  	  			<td><input type="text"  id="num2" name="last"></td>
  	  		</tr>
  	  		<tr>
  	  			<td colspan="3"> 
  	  				<input type="submit"  id="select" value="查询">
  	  				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  	  				<input type="reset" value="取消">
  	  			</td>
  	  		</tr>
  	  </table>
 </form>
  	  <table  align="center" border="1" width="50%" height="15%">
  	  		<tr>
  	  			<td>编号</td>
  	  			<td>车牌号</td>
  	  			<td>品牌</td>
  	  			<td>租赁价格(天)</td>
  	  			<td>租赁状态</td>
  	  			<td>描述</td>
  	  		</tr>
  	  			<s:if test="#request.list.size()==0">
				 		<tr>
				 			<td colspan="6">暂无文件信息!</td>
				 		</tr>
				 	</s:if>
  	  		<s:else>
				 		<s:iterator value="#request.list" var="b">
				 			<tr>
					 			<td><s:property value="#b.brandId"/></td>
					 			<td><s:property value="#b.brandNum"/></td>
					 			<td><a href="deploy-getselect.action?deployId=<s:property value='#b.deployId'/>"><s:property value="#b.brandName"/></a></td>
					 			<td><s:property value="#b.brandPrice"/></td>
					 			
					 			<td>
					 				<s:if test="#b.brandProof==1">
					 					<a href="brand-updateBrand.action?brandId=<s:property value='#b.brandId'/>" onclick="clickStatus('<s:property value="#b.brandProof"/>')" >已出租</a>	
					 				</s:if>
					 				<s:else>
					 					<a href="brand-updateBrand.action?brandId=<s:property value='#b.brandId'/> "  onclick="clickStatus('<s:property value="#b.brandProof"/>')" >未出租</a>
					 				</s:else>
					 			
					 			</td>
					 			<td><s:property value="#b.brandText"/></td>
					 		</tr>
				 		</s:iterator>
			</s:else>
  	  </table>
  </body>
</html>
