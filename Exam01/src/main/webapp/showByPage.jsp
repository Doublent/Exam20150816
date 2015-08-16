<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="com.hand.bean.ShowByPage" %>
<jsp:useBean id="pageBean" class="com.hand.bean.ShowByPage" scope="session"/>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head><jsp:include page="index.jsp"></jsp:include></head>
  <title>分页浏览会员</title>
  
  <Body >
  	<div align="center">
		<br>当前显示的内容是：
        <table border=2>
  		  <tr>
    		<th>film_id</th>
    		<th>title</th>
    		<th>description</th>
    		<th>language</th>

  		  </tr>
  		<jsp:getProperty name="pageBean" property="presentPageResult"/>
  		</table>
  		
 		每页最多显示<jsp:getProperty name="pageBean" property="pageSize"/>条信息
 		
	</div>
</BODY>
</html>