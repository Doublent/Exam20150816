package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.hand.bean.ShowByPage;

public final class showByPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      com.hand.bean.ShowByPage pageBean = null;
      synchronized (session) {
        pageBean = (com.hand.bean.ShowByPage) _jspx_page_context.getAttribute("pageBean", PageContext.SESSION_SCOPE);
        if (pageBean == null){
          pageBean = new com.hand.bean.ShowByPage();
          _jspx_page_context.setAttribute("pageBean", pageBean, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "index.jsp", out, false);
      out.write("</head>\r\n");
      out.write("  <title>分页浏览会员</title>\r\n");
      out.write("  \r\n");
      out.write("  <Body >\r\n");
      out.write("  \t<div align=\"center\">\r\n");
      out.write("\t\t<br>当前显示的内容是：\r\n");
      out.write("        <table border=2>\r\n");
      out.write("  \t\t  <tr>\r\n");
      out.write("    \t\t<th>film_id</th>\r\n");
      out.write("    \t\t<th>title</th>\r\n");
      out.write("    \t\t<th>description</th>\r\n");
      out.write("    \t\t<th>language</th>\r\n");
      out.write("\r\n");
      out.write("  \t\t  </tr>\r\n");
      out.write("  \t\t");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.hand.bean.ShowByPage)_jspx_page_context.findAttribute("pageBean")).getPresentPageResult())));
      out.write("\r\n");
      out.write("  \t\t</table>\r\n");
      out.write("  \t\t\r\n");
      out.write(" \t\t每页最多显示");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.hand.bean.ShowByPage)_jspx_page_context.findAttribute("pageBean")).getPageSize())));
      out.write("条信息\r\n");
      out.write(" \t\t");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("</BODY>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
