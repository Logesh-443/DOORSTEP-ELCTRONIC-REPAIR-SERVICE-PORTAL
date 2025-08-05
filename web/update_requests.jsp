<%-- 
    Document   : add_req
    Created on : 13 Mar, 2025, 10:09:14 PM
    Author     : Logesh seenivasan
--%>

<%@ page import="java.sql.*" %>
<%
    String id = request.getParameter("id");
    String status = request.getParameter("status");

    String url = "jdbc:mysql://localhost:3306/service_db";
    String user = "root";
    String password = "";

    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, user, password);
        PreparedStatement pstmt = conn.prepareStatement("UPDATE service_requests SET Status=? WHERE id=?");

        pstmt.setString(1, status);
        pstmt.setInt(2, Integer.parseInt(id));
        pstmt.executeUpdate();

        conn.close();
        response.sendRedirect("view_req.jsp");
    } catch (Exception e) {
        out.println("<div class='alert alert-danger'>Database error: " + e.getMessage() + "</div>");
    }
%>