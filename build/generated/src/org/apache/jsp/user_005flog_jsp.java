package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_005flog_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("    <link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <title>USER</title>\n");
      out.write("    <style>\n");
      out.write("        header{\n");
      out.write("            text-align:center;\n");
      out.write("            background-color:deepskyblue;\n");
      out.write("            padding:10px;\n");
      out.write("        }\n");
      out.write("        body {\n");
      out.write("            background-color: #f8f9fa;\n");
      out.write("        }\n");
      out.write("        .login-container {\n");
      out.write("            max-width: 350px;\n");
      out.write("            margin: 50px auto;\n");
      out.write("            background: #fff;\n");
      out.write("            padding: 20px;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
      out.write("        }\n");
      out.write("        .login-container h3 {\n");
      out.write("            text-align: center;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("        .container{\n");
      out.write("            width:50%;\n");
      out.write("            height:50%;\n");
      out.write("        }\n");
      out.write("     </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("     <header>\n");
      out.write("        <h1>ELECTRONIC REPAIR SERVICE</h1>\n");
      out.write("     </header>\n");
      out.write("    <nav class=\"navbar navbar-inverse\">\n");
      out.write("        <div class=\"container_1\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\">Electronics Repair</a>\n");
      out.write("            </div>\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                <li><a href=\"./index.jsp\">Home</a></li>\n");
      out.write("                <li><a href=\"./about.jsp\">About</a></li>\n");
      out.write("                <li><a href=\"./ourservices.jsp\">Services</a></li>\n");
      out.write("                <li><a href=\"./contact_1.jsp\">Contact</a></li>\n");
      out.write("                \n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Login <span class=\"caret\"></span></a>\n");
      out.write("                    <ul class=\"dropdown-menu\">\n");
      out.write("                        <li><a href=\"./admin_log.jsp\">Admin</a></li>\n");
      out.write("                        <li><a href=\"./user_log.jsp\">User</a></li>\n");
      out.write("                        <li><a href=\"./tech_log.jsp\">Technician</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"login-container\">\n");
      out.write("            <h3>User-Login</h3>\n");
      out.write("        <form action=\"./userLog_servlet\" method=\"post\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                    <label for=\"username\">Username</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"username\" placeholder=\"Enter your username\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"password\">Password</label>\n");
      out.write("                    <input type=\"password\" class=\"form-control\" name=\"password\" placeholder=\"Enter your password\">\n");
      out.write("                </div>\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary btn-block\">Login</button>\n");
      out.write("            </form>\n");
      out.write("            <div class=\"text-center\" style=\"margin-top: 10px;\">\n");
      out.write("                <a href=\"#\">Forgot Password?</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"text-center\" style=\"margin-top: 10px;\">\n");
      out.write("                <p>Don't have an account? <a href=\"./user_reg.jsp\">Register here</a></p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("</body>\n");
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
