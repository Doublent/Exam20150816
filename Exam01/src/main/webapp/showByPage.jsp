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
 		<%-- <BR>当前显示第
 		<Font color=blue>
     		<jsp:getProperty name="pageBean" property="showPage"/>
   		</Font>页,共有
   		<Font color=blue><jsp:getProperty name="pageBean" property="pageAllCount"/>
   		</Font>页。
		<BR>单击“上一页”或“下一页”按纽查看信息
		
 		<Table>
  		<tr><td><FORM action="memberServler" method=post>
        	<Input type=hidden name="showPage" value="<%=pageBean.getShowPage()-1 %>">
            <Input type=submit name="g" value="上一页">
          	</FORM>
     	 	</td>
     	 	<td><FORM action="memberServler" method=post>
     	     <Input type=hidden name="showPage" value="<%=pageBean.getShowPage()+1 %>">
     	     <Input type=submit name="g" value="下一页">
      	    </Form>
    	  	</td>
    	  	<td> <FORM action="memberServler" method=post>
    	  	<% 
    	  		int num = 0;
    	  		if((pageBean.getShowPage()+1)>pageBean.getPageAllCount()){
    	  			num = 1;
    	  		}
    	  		else num = pageBean.getShowPage()+1;
    	  	%>
    	  	
    	  	输入页码：<Input type=text name="showPage" size=5 value=<%= num%> >
           	<Input type=submit name="g" value="提交">
           	</FORM>
      		</td>
  		</tr>
  		</Table> --%>
	</div>
</BODY>
</html>