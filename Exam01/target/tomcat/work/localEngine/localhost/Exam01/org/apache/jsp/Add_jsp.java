package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class Add_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("\r\n");
      com.hand.bean.Add addBean = null;
      synchronized (request) {
        addBean = (com.hand.bean.Add) _jspx_page_context.getAttribute("addBean", PageContext.REQUEST_SCOPE);
        if (addBean == null){
          addBean = new com.hand.bean.Add();
          _jspx_page_context.setAttribute("addBean", addBean, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("  <head>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "index.jsp", out, false);
      out.write("</head>\r\n");
      out.write("  <title>新增页面</title>\r\n");
      out.write("  <div align=\"center\">\r\n");
      out.write("  <br>\r\n");
      out.write("  <form action=\"addServlet\" method=\"post\" ><!-- name=form> -->\r\n");
      out.write("  <table> \r\n");
      out.write("    <tr><td width=\"260\"><font size=\"3\">请输入要新增的记录：</font></td></tr>\r\n");
      out.write("    <tr><td><font size=\"4\">add title：</font><Input type=text name=\"title\"></td></tr>\r\n");
      out.write("    <tr><td><font size=\"4\">add description：</font><Input type=text name=\"description\"></td></tr>\r\n");
      out.write("    <tr><td><font size=\"4\">add language：</font><Input type=text name=\"language\"></td></tr>\r\n");
      out.write("    \r\n");
      out.write("    <tr><td><Input type=submit name=\"g\" value=\"提交\"></td></tr>\r\n");
      out.write("  </table>    \r\n");
      out.write("  </form>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div align=\"center\">  \r\n");
      out.write("       <font color=blue>\r\n");
      out.write("       ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.hand.bean.Add)_jspx_page_context.findAttribute("addBean")).getBackNews())));
      out.write("\r\n");
      out.write("       </font>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
