package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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

    HttpSession sessionObj = request.getSession(false);
    if (sessionObj == null || sessionObj.getAttribute("username") == null) {
        response.sendRedirect("user_log.jsp");
        return;
    }

    String username = (String) sessionObj.getAttribute("username");
    String email = (String) sessionObj.getAttribute("email");
    String profile_pic = (String) sessionObj.getAttribute("profile_pic");
    String mobile = (String) sessionObj.getAttribute("mobile");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("  <title>User Dashboard</title>\n");
      out.write("  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\n");
      out.write("  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  <div class=\"d-flex\">\n");
      out.write("    <div class=\"sidebar bg-dark text-white p-3\" style=\"width: 250px; height: 100vh;\">\n");
      out.write("      <h2 class=\"text-center\">User Dashboard</h2>\n");
      out.write("      <ul class=\"nav flex-column\">\n");
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
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link text-white\" href=\"./logout_user.jsp\">Logout</a>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"container mt-5\">\n");
      out.write("      <h3 class=\"text-center mb-4\">USER PROFILE</h3>\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <center>\n");
      out.write("          <div class=\"col-md-6 col-lg-3 mb-4\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("              <div class=\"card shadow-sm\">\n");
      out.write("                <center>\n");
      out.write("                  <img src=\"");
      out.print( profile_pic );
      out.write("\" class=\"profile-pic\" alt=\"Profile Picture\" style=\"width:150px;height:150px;\">\n");
      out.write("                  <button type=\"button\" class=\"btn btn-primary mt-2\" data-bs-toggle=\"modal\" data-bs-target=\"#uploadModal\">\n");
      out.write("                    Upload New Picture\n");
      out.write("                  </button>\n");
      out.write("                  <p><strong>Username:</strong> ");
      out.print( username );
      out.write("</p>\n");
      out.write("                  <p><strong>Email:</strong> ");
      out.print( email );
      out.write("</p>\n");
      out.write("                  <p><strong>Contact:</strong> ");
      out.print( mobile );
      out.write("</p>\n");
      out.write("                </center>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </center>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  <!-- Modal -->\n");
      out.write("  <div class=\"modal fade\" id=\"uploadModal\" tabindex=\"-1\" aria-labelledby=\"uploadModalLabel\" aria-hidden=\"true\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("          <h5 class=\"modal-title\" id=\"uploadModalLabel\">Upload Profile Picture</h5>\n");
      out.write("          <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\">\n");
      out.write("          <form action=\"UploadFileServlet_1\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("            <input type=\"file\" name=\"profilePic\" accept=\"image/*\" required class=\"form-control\">\n");
      out.write("            <br>\n");
      out.write("            <button type=\"submit\" class=\"btn btn-primary\">Upload</button>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  \n");
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
