package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_005freg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Insert Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("     <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js\"></script>\n");
      out.write("     <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("     <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("     <style>\n");
      out.write("     header{\n");
      out.write("            text-align:center;\n");
      out.write("            background-color:deepskyblue;\n");
      out.write("            padding:10px;\n");
      out.write("        }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <header>\n");
      out.write("        <h1>ELECTRONIC REPAIR SERVICE</h1>\n");
      out.write("    </header>\n");
      out.write("    <nav class=\"navbar navbar-inverse\">\n");
      out.write("        <div class=\"container_1\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\">Electronics Repair</a>\n");
      out.write("            </div>\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                <li><a href=\"./index.jsp\">Home</a></li>\n");
      out.write("                <li><a href=\"#about\">About</a></li>\n");
      out.write("                <li><a href=\"#services\">Services</a></li>\n");
      out.write("                <li><a href=\"#contact\">Contact</a></li>\n");
      out.write("            <li class=\"dropdown\">\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Sign-Up <span class=\"caret\"></span></a>\n");
      out.write("                    <ul class=\"dropdown-menu\">\n");
      out.write("                        <li><a href=\"./user_reg.jsp\">User</a></li>\n");
      out.write("                        <li><a href=\"./tech_reg.jsp\">Technician</a></li>\n");
      out.write("                    </ul>\n");
      out.write("            </li>\n");
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
      out.write("        <div class=\"container\">\n");
      out.write("            <h3 style=\"text-align:center;color:red;\">USER</h3>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3\"></div>\n");
      out.write("                <div class=\"col-md-8\"></div>\n");
      out.write("                <form method=\"post\" action=\"./user_servlet\"enctype=\"multipart/form-data\">\n");
      out.write("      \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"username\">USERNAME</label>\n");
      out.write("                        <input type=\"text\"id=\"username\"name=\"username\"class=\"form-control\"placeholder=\"Enter your name\"required>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"password\">PASSWORD</label>\n");
      out.write("                        <input type=\"password\"id=\"password\"name=\"password\"class=\"form-control\"placeholder=\"Enter your password\"required>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"gender\">GENDER</label>\n");
      out.write("                        <label for=\"Male\"style=\"margin-left:50px\">Male\n");
      out.write("                            <input type=\"radio\"name=\"gender\"id=\"Male\"value=\"Male\"required/></label>\n");
      out.write("                        <label for=\"Female\"style=\"margin-left:100px\">Female\n");
      out.write("                            <input type=\"radio\"name=\"gender\"id=\"Female\"value=\"Female\"required/></label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                         <label for=\"email\">EMAIL</label>\n");
      out.write("                        <input type=\"email\"name=\"email\"class=\"form-control\"placeholder=\"Enter your email\"required>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                         <label for=\"address\">ADDRESS</label>\n");
      out.write("                         <input type=\"text\"name=\"address\"class=\"form-control\"placeholder=\"Enter your Address\"required>   \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"mobile\">PHONE NO</label>\n");
      out.write("                         <input type=\"number\"name=\"mobile\"class=\"form-control\"pattern=\"[0-9]{10}\"placeholder=\"Enter your phone no\"required> \n");
      out.write("                    </div>\n");
      out.write("                     <div class=\"form-group\">\n");
      out.write("                        <label for=\"Profile_pic\">Profile_pic</label>\n");
      out.write("                        <input type=\"file\" name=\"profile_pic\" accept=\"image/*\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <input type=\"Submit\"name=\"add\"class=\"btn-btn-success\"value=\"register\"/>\n");
      out.write("                    </div>\n");
      out.write("                    </div>   \n");
      out.write("                </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
