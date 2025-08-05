<%-- 
    Document   : submit_appointment
    Created on : 1 Apr, 2025, 10:54:57 AM
    Author     : Logesh seenivasan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*, javax.servlet.http.*, javax.servlet.*" %>

<%
    // Ensure user is logged in
    HttpSession userSession = request.getSession(false);
    if (userSession == null || userSession.getAttribute("username") == null) {
        response.sendRedirect("user_log.jsp?error=Please login first");
        return;
    }

    // Get form data from request
    String username = request.getParameter("loggedInUsername");
    String userPhone = request.getParameter("userPhone");
    String appointmentTime = request.getParameter("appointmentTime");
    String appointmentDate = request.getParameter("appointmentDate");
    String technicianId = request.getParameter("technician");
    String deviceType = request.getParameter("deviceType");
    String issueDescription = request.getParameter("issueDescription");

    // Database connection variables
    Connection con = null;
    PreparedStatement pstmt = null;

    try {
        Class.forName("com.mysql.jdbc.Driver");

        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tech", "root", "");

        String sql = "INSERT INTO appointment (username,phone, appointment_time, appointment_date, technician_id, device_type, issue_description) VALUES (?, ?, ?, ?, ?, ?, ?)";
        pstmt = con.prepareStatement(sql);
        pstmt.setString(1, username);
        pstmt.setString(2, userPhone);
        pstmt.setString(3, appointmentTime);
        pstmt.setString(4, appointmentDate);
        pstmt.setString(5, technicianId);
        pstmt.setString(6, deviceType);
        pstmt.setString(7, issueDescription);

        int rowsInserted = pstmt.executeUpdate();

        if (rowsInserted > 0) {
            response.sendRedirect("appointment_success.jsp");
        } else {
            response.sendRedirect("appointment.jsp?error=Failed to submit appointment. Please try again.");
        }
    } catch (Exception e) {
        e.printStackTrace(); // Log error in Tomcat logs

        // Show error message directly in browser
        out.println("<h3 style='color:red;'>⚠️ Database Error: " + e.getMessage() + "</h3>");
    } finally {
        if (pstmt != null) pstmt.close();
        if (con != null) con.close();
    }
%>
