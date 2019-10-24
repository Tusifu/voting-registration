package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>voting pagee</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            Object o=session.getAttribute("message");
            if(o != null){
            String message=session.getAttribute("message").toString();
            out.println(message);
            session.removeAttribute("message");
            }
        
      out.write("\n");
      out.write("        <h1>VOTING</h1>\n");
      out.write("        <form action=\"recordVoting.jsp\" method=\"POST\">\n");
      out.write("            <table>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>NationalID:</td>\n");
      out.write("                                <td><input type=\"text\" name=\"NationalID\" required=\"true\" minlength=\"16\" maxlength=\"16\"></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>firstName:</td>\n");
      out.write("                                <td><input type=\"text\" name=\"firstName\" required=\"true\" minlength=\"3\"></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>lastName:</td>\n");
      out.write("                                <td><input type=\"text\" name=\"lastName\" required=\"true\" minlength=\"3\"></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>sex:</td>\n");
      out.write("                                <td><select name=\"sex\" required=\"true\">\n");
      out.write("                                        <option></option>\n");
      out.write("\t\t\t\t\t<option>male</option>\n");
      out.write("\t\t\t\t\t<option>female</option></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>DateOfBirth:</td>\n");
      out.write("                                <td><input type=\"Date\" name=\"DateOfBirth\" placeholder=\"yyyy-mm-dd\" required=\"true\"></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>District:</td>\n");
      out.write("                                <td><select name=\"District\" required=\"true\">\n");
      out.write("                                        <option></option>\n");
      out.write("\t\t\t\t\t<option>Nyarugenge</option>\n");
      out.write("\t\t\t\t\t<option>Gasabo</option>\n");
      out.write("\t\t\t\t\t<option>Kicukiro</option>\n");
      out.write("\t\t\t\t\t<option>Rubavu</option>\n");
      out.write("\t\t\t\t\t<option>Musanze</option>\n");
      out.write("\t\t\t\t</select></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("                        \n");
      out.write("\t\t</table>\n");
      out.write("            <br>\n");
      out.write("\t\t<input type=\"submit\" name=\"submit\" value=\"submit\">\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
