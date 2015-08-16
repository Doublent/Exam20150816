<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<jsp:useBean id="loginBean" class="com.hand.bean.Login" scope="session"></jsp:useBean> 
<html>
<%--  <head><jsp:include page="index.jsp"></jsp:include></head> --%>
  <title>用户登录</title>
  <br><br>
  <body>
  <div align="center">
  <form action="loginServlet" method="post">
  	<table border=2>
  		<tr><th>请您登录</th></tr>
  		<tr><td>登录名称：<input type=text name="logname"></td></tr>
  	</table>
  	<br>
  	<input type="submit" name="g" value="提交">
  	</form>
  </div>  
  </body>
</html>
