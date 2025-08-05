package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class view_005ffeedback_00201_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Technician Feedback</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h2 class=\"text-center\">Your Feedback</h2>\n");
      out.write("\n");
      out.write("        <table class=\"table table-bordered table-striped\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>User Name</th>\n");
      out.write("                    <th>Email</th>\n");
      out.write("                    <th>Rating</th>\n");
      out.write("                    <th>Comments</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");

                    int technicianId = (session.getAttribute("technician_id") != null) ? (Integer) session.getAttribute("technician_id") : -1;

                    if (technicianId != -1) {
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tech", "root", "");
                            PreparedStatement ps = conn.prepareStatement("SELECT user_name, user_email, rating, comments FROM feedback WHERE technician_id=?");
                            ps.setInt(1, technicianId);
                            ResultSet rs = ps.executeQuery();

                            if (!rs.isBeforeFirst()) {
                                out.println("<tr><td colspan='4' class='text-center text-warning'>No feedback available</td></tr>");
                            } else {
                                while (rs.next()) {
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print( rs.getString("user_name") );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( rs.getString("user_email") );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( rs.getInt("rating") );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( rs.getString("comments") );
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                                }
                            }
                            conn.close();
                        } catch (Exception e) {
                            out.println("<tr><td colspan='4' class='text-center text-danger'>Error: " + e.getMessage() + "</td></tr>");
                        }
                    } else {
                        out.println("<tr><td colspan='4' class='text-center text-danger'>Technician ID not found</td></tr>");
                    }
                
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("    </div>\n");
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
