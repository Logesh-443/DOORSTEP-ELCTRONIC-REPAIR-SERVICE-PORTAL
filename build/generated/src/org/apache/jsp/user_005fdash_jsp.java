package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_005fdash_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("  <title>User Dashboard</title>\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  <!-- Sidebar Menu -->\n");
      out.write("  <div class=\"d-flex\">\n");
      out.write("    <div class=\"sidebar bg-dark text-white p-3\" style=\"width: 250px; height: 100vh;\">\n");
      out.write("      <h2 class=\"text-center\">User Dashboard</h2>\n");
      out.write("      <ul class=\"nav flex-column\">\n");
      out.write("<!--        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link text-white\" href=\"./index.jsp\">Home</a>\n");
      out.write("        </li>-->\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link text-white\" href=\"./profile_1.jsp\">Profile</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link text-white\" href=\"./service_req.jsp\">Request</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link text-white\" href=\"./appointment.jsp\">Appointment</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link text-white\" href=\"./technicians.jsp\">Technician</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link text-white\" href=\"./feedback.jsp\">Feedback</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item-1\">\n");
      out.write("          <a class=\"nav-link text-white\" href=\"./logout_user.jsp\">Logout</a>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"container-fluid p-4\">\n");
      out.write("      <h1 class=\"display-4\">User Dashboard</h1>\n");
      out.write("      <p>Welcome to your user dashboard. From here, you can manage your requests, appointments, and view your profile.</p>\n");
      out.write("      \n");
      out.write("<!--      <div class=\"row\">\n");
      out.write("        <div class=\"col\">\n");
      out.write("          <h3>Home</h3>\n");
      out.write("          <p>Access your main page with the latest updates and status of your requests.</p>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"col\">\n");
      out.write("          <h3>Profile</h3>\n");
      out.write("          <p>View and edit your personal details, preferences, and account information.</p>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"col\">\n");
      out.write("          <h3>Request</h3>\n");
      out.write("          <p>Place a new repair request or view existing repair requests.</p>\n");
      out.write("        </div>\n");
      out.write("      </div>-->\n");
      out.write("\n");
      out.write("<!--      <div class=\"row mt-4\">\n");
      out.write("        <div class=\"col\">\n");
      out.write("          <h3>Appointment</h3>\n");
      out.write("          <p>Schedule an appointment for a technician to visit your location and repair your device.</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"col\">\n");
      out.write("<a href=\"tech_reg.jsp\"></a>\n");
      out.write("          <h3>Technician</h3>\n");
      out.write("          <p>View available technicians, their profiles, and select a technician for your repair.</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"col\">\n");
      out.write("          <h3>Feedback</h3>\n");
      out.write("          <p>Provide feedback for the services you received to help us improve.</p>\n");
      out.write("        </div>\n");
      out.write("      </div>-->\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js\"></script>\n");
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
