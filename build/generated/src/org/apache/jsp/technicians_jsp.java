package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class technicians_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Technician List</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
      out.write("    <style>\r\n");
      out.write("        .card {\r\n");
      out.write("            border: 1px solid #ddd;\r\n");
      out.write("            padding: 15px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            margin-bottom: 20px;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            background-color: #f9f9f9;\r\n");
      out.write("        }\r\n");
      out.write("        .profile-pic {\r\n");
      out.write("            width: 100px;\r\n");
      out.write("            height: 100px;\r\n");
      out.write("            border-radius: 50%;\r\n");
      out.write("            object-fit: cover;\r\n");
      out.write("            border: 2px solid #ccc;\r\n");
      out.write("            margin-bottom: 10px;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <h2 class=\"text-center\">Technicians</h2>\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        ");

            Connection con = null;
            Statement stmt = null;
            ResultSet rs = null;

            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tech", "root", "");
                stmt = con.createStatement();
                rs = stmt.executeQuery("SELECT * FROM technician");

                boolean hasData = false;

                while (rs.next()) {
                    hasData = true;
        
      out.write("\r\n");
      out.write("                    <div class=\"col-md-6 col-lg-3 mb-4\"> \r\n");
      out.write("                          <div class=\"card\">\r\n");
      out.write("                            <div class=\"card shadow-sm\">\r\n");
      out.write("                            <center>\r\n");
      out.write("                                <img src=\"");
      out.print( request.getContextPath());
      out.write("/uploads/");
      out.print( rs.getString("profile_pic"));
      out.write("\" class=\"profile-pic\" alt=\"Profile\">\r\n");
      out.write("                            <h4><strong>");
      out.print( rs.getString("username") );
      out.write("</strong></h4>\r\n");
      out.write("                            <p><strong>Tech Type:</strong> ");
      out.print( rs.getString("techtype") );
      out.write("</p>\r\n");
      out.write("                            <p><strong>Email:</strong> ");
      out.print( rs.getString("email") );
      out.write("</p>\r\n");
      out.write("                           <a href=\"contact.jsp?tech_email=");
      out.print( rs.getString("email") );
      out.write("&user_email=");
      out.print( session.getAttribute("email") );
      out.write("\" \r\n");
      out.write("                             class=\"btn btn-primary btn-sm\">Contact</a>\r\n");
      out.write("                            </center>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            \r\n");
      out.write("                    </div>\r\n");
      out.write("        ");

                }

                if (!hasData) {
        
      out.write("\r\n");
      out.write("                    <p class=\"text-center text-danger\">No technicians found.</p>\r\n");
      out.write("        ");

                }

            } catch (Exception e) {
                e.printStackTrace();
        
      out.write("\r\n");
      out.write("                <p class=\"text-danger\">Database error: ");
      out.print( e.getMessage() );
      out.write("</p>\r\n");
      out.write("        ");

            } finally {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            }
        
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
