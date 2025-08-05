<%-- 
    Document   : tech_log1
    Created on : 13 Mar, 2025, 12:51:04 PM
    Author     : Logesh seenivasan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="java.sql.DriverManager"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>tech-login</title>
    </head>
    <body>
        <%
            String un=request.getParameter("username");
            String ps=request.getParameter("password");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tech","root","");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select id from technician where username='"+un+"'and password='"+ps+"'");
            if(rs.next()){
                session.setAttribute("user",un);
                out.print("<script>"
                +"alert('logged in successfully..!');"
                +"location.href='tech_dash.jsp';" 
                        +"</script>");
            }
            else{
                out.print("<script>"
                +"alert('Invalid Login..!');"
                +"location.href='tech_log.jsp';"
                +"</script>");            
            }
        %> 
    </body>
</html>
