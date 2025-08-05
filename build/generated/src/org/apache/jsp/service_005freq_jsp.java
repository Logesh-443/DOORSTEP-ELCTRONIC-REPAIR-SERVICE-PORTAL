package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.DriverManager;

public final class service_005freq_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("     <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js\"></script>\n");
      out.write("     <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("    <title>Service Request</title>\n");
      out.write("    <style>\n");
      out.write("       \n");
      out.write("        body {\n");
      out.write("            background-color: #f8f9fa;  \n");
      out.write("            font-family: Arial, sans-serif; \n");
      out.write("            text-align: center; \n");
      out.write("        }\n");
      out.write("        .container1 { \n");
      out.write("            width: 50%; \n");
      out.write("            margin: auto; \n");
      out.write("            background: white; \n");
      out.write("            padding: 20px; \n");
      out.write("            border-radius: 8px; \n");
      out.write("            box-shadow: 0px 0px 10px gray; \n");
      out.write("        }\n");
      out.write("        h2{\n");
      out.write("            text-align:center;\n");
      out.write("        }\n");
      out.write("        input, select, textarea { \n");
      out.write("            width: 90%; \n");
      out.write("            padding: 8px; \n");
      out.write("            margin: 10px; }\n");
      out.write("        button { \n");
      out.write("            background-color: blue; \n");
      out.write("            color: white; \n");
      out.write("            padding: 10px 20px; \n");
      out.write("            border: none; \n");
      out.write("            cursor: pointer; }\n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    <body>        \n");
      out.write("    <div class=\"container1\">\n");
      out.write("        <h2 class=\"text-center\">Submit Service Request</h2>\n");
      out.write("        <form method=\"post\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label>Name:</label>\n");
      out.write("                <input type=\"text\" name=\"name\" class=\"form-control\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label>Contact:</label>\n");
      out.write("                <input type=\"text\" name=\"contact\" class=\"form-control\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label>Service:</label>\n");
      out.write("                <select name=\"service\" class=\"form-control\" required>\n");
      out.write("                    <option value=\"\">Select Service</option>\n");
      out.write("                    <option value=\"Laptop\">Laptop</option>\n");
      out.write("                    <option value=\"Mobile\">Mobile</option>\n");
      out.write("                    <option value=\"Washing Machine\">Washing Machine</option>\n");
      out.write("                    <option value=\"AC\">AC</option>\n");
      out.write("                    <option value=\"Television\">Television</option>\n");
      out.write("                    <option value=\"Purifier\">Purifier</option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label>Issue:</label>\n");
      out.write("                <textarea name=\"issue\" class=\"form-control\" required></textarea>\n");
      out.write("            </div>\n");
      out.write("            <button type=\"submit\" name=\"submit\" class=\"btn btn-primary\">Submit Request</button>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        ");

            if (request.getParameter("submit") != null) {
                String name = request.getParameter("name");
                String contact = request.getParameter("contact");
                String service = request.getParameter("service");
                String issue = request.getParameter("issue");

                String url = "jdbc:mysql://localhost:3306/service_db";
                String user = "root";
                String password = "";

                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = DriverManager.getConnection(url, user, password);
                    PreparedStatement pstmt = conn.prepareStatement("INSERT INTO service_requests (Name, Contact, Services, Issues) VALUES (?, ?, ?, ?)");

                    pstmt.setString(1, name);
                    pstmt.setString(2, contact);
                    pstmt.setString(3, service);
                    pstmt.setString(4, issue);
                    pstmt.executeUpdate();

                    out.println("<div class='alert alert-success'>Request submitted successfully!</div>");
                    conn.close();
                } catch (Exception e) {
                    out.println("<div class='alert alert-danger'>Error: " + e.getMessage() + "</div>");
                }
            }
        
      out.write("\n");
      out.write("    </div>\n");
      out.write("</body>\n");
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
