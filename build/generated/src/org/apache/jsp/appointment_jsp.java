package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.servlet.http.*;
import javax.servlet.*;

public final class appointment_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    // Ensure user is logged in using session attributes
    HttpSession userSession = request.getSession(false);
    if (userSession == null || userSession.getAttribute("username") == null || userSession.getAttribute("password") == null) {
        response.sendRedirect("user_log.jsp?error=Please login first");
        return;
    }

    // Fetch logged-in user details from session
    String loggedInUsername = (String) userSession.getAttribute("username");
    String loggedInMobile=(String)userSession.getAttribute("mobile");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Appointment Form - Doorstep Electronic Repair Service</title>\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container mt-5\">\n");
      out.write("        <h2 class=\"text-center\">Schedule Your Repair Appointment</h2>\n");
      out.write("        <p class=\"text-center\">Hello, <b>");
      out.print( loggedInUsername );
      out.write("</b>. Please fill out the form below.</p>\n");
      out.write("\n");
      out.write("        <form action=\"submit_appointment.jsp\" method=\"POST\">\n");
      out.write("            <!-- Hidden input to store username -->\n");
      out.write("            <input type=\"hidden\" name=\"loggedInUsername\" value=\"");
      out.print( loggedInUsername );
      out.write("\">\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <!-- Full Name (Auto-Filled, Read-Only) -->\n");
      out.write("                    <div class=\"mb-3\">\n");
      out.write("                        <label for=\"userName\" class=\"form-label\">Full Name</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"userName\" name=\"userName\" value=\"");
      out.print( loggedInUsername );
      out.write("\" readonly>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- Phone Number -->\n");
      out.write("                    <div class=\"mb-3\">\n");
      out.write("                        <label for=\"userPhone\" class=\"form-label\">Phone Number</label>\n");
      out.write("                        <input type=\"tel\" class=\"form-control\" id=\"userPhone\" name=\"userPhone\" value=\"");
      out.print( loggedInMobile );
      out.write("\" readonly>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- Preferred Appointment Time -->\n");
      out.write("                    <div class=\"mb-3\">\n");
      out.write("                        <label for=\"appointmentTime\" class=\"form-label\">Preferred Appointment Time</label>\n");
      out.write("                        <input type=\"time\" class=\"form-control\" id=\"appointmentTime\" name=\"appointmentTime\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"mb-3\">\n");
      out.write("                        <label for=\"appointmentDate\" class=\"form-label\">Preferred Appointment Date</label>\n");
      out.write("                        <input type=\"date\" class=\"form-control\" id=\"appointmentDate\" name=\"appointmentDate\" required>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <!-- Select Technician -->\n");
      out.write("                    <div class=\"mb-3\">\n");
      out.write("                        <label for=\"technician\" class=\"form-label\">Select Technician</label>\n");
      out.write("                        <select class=\"form-select\" id=\"technician\" name=\"technician\" required onchange=\"updateDeviceType()\">\n");
      out.write("                            <option value=\"\" disabled selected>Select a technician</option>\n");
      out.write("                            ");
 
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tech", "root", "");
                                    Statement stmt = con.createStatement();
                                    ResultSet rs = stmt.executeQuery("SELECT id, username, techtype FROM technician");

                                    while (rs.next()) {
                                        int techId = rs.getInt("id");
                                        String techName = rs.getString("username");
                                        String deviceType = rs.getString("techtype"); // Fetch device type handled by technician
                            
      out.write("\n");
      out.write("                            <option value=\"");
      out.print( techId );
      out.write("\" data-devicetype=\"");
      out.print( deviceType );
      out.write("\">\n");
      out.write("                                ");
      out.print( techName );
      out.write("\n");
      out.write("                            </option>\n");
      out.write("                            ");
 
                                    }
                                    con.close();
                                } catch (Exception e) {
                                    out.println("<option disabled>Error fetching technicians</option>");
                                    e.printStackTrace();
                                }
                            
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- Device Type (Filtered based on Technician) -->\n");
      out.write("                    <div class=\"mb-3\">\n");
      out.write("                        <label for=\"deviceType\" class=\"form-label\">Device Type</label>\n");
      out.write("                        <select class=\"form-select\" id=\"deviceType\" name=\"deviceType\" required>\n");
      out.write("                            <option value=\"\" disabled selected>Select your device</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- Issue Description -->\n");
      out.write("                    <div class=\"mb-3\">\n");
      out.write("                        <label for=\"issueDescription\" class=\"form-label\">Issue Description</label>\n");
      out.write("                        <textarea class=\"form-control\" id=\"issueDescription\" name=\"issueDescription\" rows=\"4\" required></textarea>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- Preferred Appointment Date -->\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Submit Button -->\n");
      out.write("            <div class=\"text-center\">\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\">Submit Appointment Request</button>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        // JavaScript to auto-fill Device Type based on selected Technician\n");
      out.write("        function updateDeviceType() {\n");
      out.write("            var technicianDropdown = document.getElementById(\"technician\");\n");
      out.write("            var selectedOption = technicianDropdown.options[technicianDropdown.selectedIndex];\n");
      out.write("            var deviceTypeDropdown = document.getElementById(\"deviceType\");\n");
      out.write("\n");
      out.write("            if (selectedOption.value) {\n");
      out.write("                // Get the list of supported device types\n");
      out.write("                var deviceTypes = selectedOption.getAttribute(\"data-devicetype\").split(\",\");\n");
      out.write("                \n");
      out.write("                // Clear and update the Device Type dropdown\n");
      out.write("                deviceTypeDropdown.innerHTML = '<option value=\"\" disabled selected>Select your device</option>';\n");
      out.write("                deviceTypes.forEach(function(device) {\n");
      out.write("                    var option = document.createElement(\"option\");\n");
      out.write("                    option.value = device.trim();\n");
      out.write("                    option.textContent = device.trim();\n");
      out.write("                    deviceTypeDropdown.appendChild(option);\n");
      out.write("                });\n");
      out.write("            } else {\n");
      out.write("                deviceTypeDropdown.innerHTML = '<option value=\"\" disabled selected>Select your device</option>';\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </script>\n");
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
