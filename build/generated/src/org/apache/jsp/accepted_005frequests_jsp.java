package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class accepted_005frequests_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>View Requests</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<style>\n");
      out.write("      .nav-item-1:hover{\n");
      out.write("          display: block;\n");
      out.write("      }\n");
      out.write("      </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"d-flex\">\n");
      out.write("    <div class=\"sidebar bg-dark text-white p-3\" style=\"width: 250px; height: 100vh;\">\n");
      out.write("      <h2 class=\"text-center\">Technician Dashboard</h2>\n");
      out.write("      <ul class=\"nav flex-column\">\n");
      out.write("<!--        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link text-white\" href=\"./index.jsp\">Home</a>\n");
      out.write("        </li>-->\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link text-white\" href=\"./profile.jsp\">Profile</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item dropdown\">\n");
      out.write("          <a class=\"nav-link dropdown-toggle text-white\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("            Request\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"./view_req.jsp\">New</a></li>\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"./accepted_requests.jsp\">Accept</a></li>\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"./rejected_requests.jsp\">Reject</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link text-white\" href=\"#\">Feedback</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item-1\">\n");
      out.write("          <a class=\"nav-link text-white\" href=\"./logout_tech.jsp\">Logout</a>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h2 class=\"text-center\">Accepted Requests</h2>\n");
      out.write("        <table class=\"table table-bordered\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>ID</th>\n");
      out.write("                    <th>Name</th>\n");
      out.write("                    <th>Contact</th>\n");
      out.write("                    <th>Service</th>\n");
      out.write("                    <th>Issue</th>\n");
      out.write("                    <!--<th>Action</th>-->\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");

                    String url = "jdbc:mysql://localhost:3306/service_db";
                    String user = "root";
                    String password = "";

                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = DriverManager.getConnection(url, user, password);
                        Statement stmt = conn.createStatement();
                        ResultSet rs = stmt.executeQuery("SELECT * FROM service_requests WHERE Status='Accepted'");
                        while (rs.next()) {
                
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
      out.print( rs.getInt("id") );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( rs.getString("Name") );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( rs.getString("Contact") );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( rs.getString("Services") );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( rs.getString("Issues") );
      out.write("</td>\n");
      out.write("                            </tr>\n");
      out.write("                ");

                        }
                        conn.close();
                    } catch (Exception e) {
                        out.println("<div class='alert alert-danger'>Database error: " + e.getMessage() + "</div>");
                    }
                
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("    </div>\n");
      out.write("            <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js\"></script>\n");
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
