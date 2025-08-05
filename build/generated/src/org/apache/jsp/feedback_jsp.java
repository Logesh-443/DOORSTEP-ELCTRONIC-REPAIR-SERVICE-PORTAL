package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class feedback_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <h2 class=\"text-center\">Submit Feedback for Technician</h2>\n");
      out.write("        <form method=\"post\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label>Technician:</label>\n");
      out.write("                <select name=\"technician_id\" class=\"form-control\" required>\n");
      out.write("                    <option value=\"\">Select Technician</option>\n");
      out.write("                    ");

                        String url = "jdbc:mysql://localhost:3306/tech";
                        String user = "root";
                        String password = "";

                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn = DriverManager.getConnection(url, user, password);
                            Statement stmt = conn.createStatement();
                            ResultSet rs = stmt.executeQuery("SELECT id, username FROM technician");

                            while (rs.next()) {
                    
      out.write("\n");
      out.write("                    <option value=\"");
      out.print( rs.getInt("id") );
      out.write('"');
      out.write('>');
      out.print( rs.getString("username") );
      out.write("</option>\n");
      out.write("                    ");

                            }
                            conn.close();
                        } catch (Exception e) {
                            out.println("<option>Error loading technician</option>");
                        }
                    
      out.write("\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label>Name:</label>\n");
      out.write("                <input type=\"text\" name=\"user_name\" class=\"form-control\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label>Email:</label>\n");
      out.write("                <input type=\"email\" name=\"user_email\" class=\"form-control\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label>Rating:</label>\n");
      out.write("                <select name=\"rating\" class=\"form-control\" required>\n");
      out.write("                    <option value=\"\">Select Rating</option>\n");
      out.write("                    <option value=\"1\">1 - Poor</option>\n");
      out.write("                    <option value=\"2\">2 - Fair</option>\n");
      out.write("                    <option value=\"3\">3 - Good</option>\n");
      out.write("                    <option value=\"4\">4 - Very Good</option>\n");
      out.write("                    <option value=\"5\">5 - Excellent</option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label>Comments:</label>\n");
      out.write("                <textarea name=\"comments\" class=\"form-control\" required></textarea>\n");
      out.write("            </div>\n");
      out.write("            <button type=\"submit\" name=\"submit\" class=\"btn btn-primary\">Submit Feedback</button>\n");
      out.write("            <button type=\"submit\" class=\"btn btn-success\"><a href=\"./user_dash.jsp\">Back</a></button>  \n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        ");

            if (request.getParameter("submit") != null) {
                String technicianId = request.getParameter("technician_id");
                String userName = request.getParameter("user_name");
                String userEmail = request.getParameter("user_email");
                String rating = request.getParameter("rating");
                String comments = request.getParameter("comments");

                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = DriverManager.getConnection(url, user, password);
                    PreparedStatement pstmt = conn.prepareStatement("INSERT INTO feedback (technician_id, user_name, user_email, rating, comments) VALUES (?, ?, ?, ?, ?)");

                    pstmt.setInt(1, Integer.parseInt(technicianId));
                    pstmt.setString(2, userName);
                    pstmt.setString(3, userEmail);
                    pstmt.setString(4, rating);
                    pstmt.setString(5, comments);
                    pstmt.executeUpdate();

                    out.println("<div class='alert alert-success'>Feedback submitted successfully!</div>");
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
