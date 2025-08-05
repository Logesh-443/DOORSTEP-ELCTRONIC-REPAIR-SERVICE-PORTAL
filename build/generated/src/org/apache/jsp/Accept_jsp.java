package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.DriverManager;

public final class Accept_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>accept Page</title>\n");
      out.write("<!--         <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("     <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js\"></script>\n");
      out.write("     <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("     <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js\"></script>  -->\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\">    \n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");
      out.write("\n");
      out.write("         <div class=\"container\">\n");
      out.write("             <table class=\"table table-bordered\">\n");
      out.write("                 <h2 style=\"text-align:center;color:red;\">Accepted request</h2>\n");
      out.write("                 <br>\n");
      out.write("                 <tr bgcolor=\"red\">\n");
      out.write("                     <th>ID</th>\n");
      out.write("                     <th>Name</th>\n");
      out.write("                     <th>Contact</th>\n");
      out.write("                     <th>Service</th>\n");
      out.write("                     <th>Issues</th>\n");
      out.write("                 </tr>\n");
      out.write("                 ");

                     Class.forName("com.mysql.jdbc.Driver");
                     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tech","root","");
                     Statement st=con.createStatement();
                     ResultSet rs=st.executeQuery("select*from register");
                     while(rs.next())
                     out.print("<tr>"
                     +"<form method='post' action='Accept_1.jsp'>"
                         +"<td><input type='text'name='Id'value='"+rs.getString(1)+"' class='form-control'></td>"
                         +"<td><input type='text'name='Name'value='"+rs.getString(2)+"'class='form-control'</td>"
                         +"<td><input type='text'name='Contact'value='"+rs.getString(3)+"'class='form-control'</td>"
                         +"<td><input type='text'name='Services'value='"+rs.getString(4)+"'class='form-control'</td>"
                         +"<td><input type='text'name='Issues'value='"+rs.getString(5)+"'class='form-control'</td>"
                         +"<td><input type='submit'name='Update'value='Accept'class='btn btn-info'</td>");
                     
      out.write("\n");
      out.write("             </table>\n");
      out.write("         </div>\n");
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
