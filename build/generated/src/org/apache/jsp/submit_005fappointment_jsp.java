package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public final class submit_005fappointment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("\n");
      out.write("\n");

    String userName = request.getParameter("userName");
    String userPhone = request.getParameter("userPhone");
    String userEmail = request.getParameter("userEmail");
    String deviceType = request.getParameter("techtype");
    String issueDescription = request.getParameter("issueDescription");
    String appointmentDate = request.getParameter("appointmentDate");
    String appointmentTime = request.getParameter("appointmentTime");
    String technicianId = request.getParameter("technician");

    Connection con = null;
    PreparedStatement ps = null;

    try {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/service_db", "root", "");

        String sql = "INSERT INTO appointment (user_name, user_phone, user_email, device_type, issue_description, technician_id, status) VALUES (?, ?, ?, ?, ?, ?, 'Pending')";
        ps = con.prepareStatement(sql);
        ps.setString(1, userName);
        ps.setString(2, userPhone);
        ps.setString(3, userEmail);
        ps.setString(4, deviceType);
        ps.setString(5, issueDescription);
        ps.setInt(6, Integer.parseInt(technicianId));

        int rowsInserted = ps.executeUpdate();

        if (rowsInserted > 0) {
            response.sendRedirect("appointment_success.jsp");
        } else {
            response.sendRedirect("appointment.jsp?error=Failed to submit request");
        }
    } catch (Exception e) {
        e.printStackTrace();
        response.sendRedirect("appointment.jsp?error=Database error: " + e.getMessage());
    } finally {
        if (ps != null) ps.close();
        if (con != null) con.close();
    }

      out.write('\n');
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
