<%-- 
    Document   : technicians
    Created on : 21 Mar, 2025, 10:59:00 AM
    Author     : Logesh seenivasan
--%>

<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <title>Technician List</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <style>
        .card {
            border: 1px solid #ddd;
            padding: 15px;
            text-align: center;
            margin-bottom: 20px;
            border-radius: 5px;
            background-color: #f9f9f9;
        }
        .profile-pic {
            width: 100px;
            height: 100px;
            border-radius: 50%;
            object-fit: cover;
            border: 2px solid #ccc;
            margin-bottom: 10px;
        }
    </style>
</head>
<body>
<div class="container">
    <h2 class="text-center">Technicians</h2>
    <div class="row">
        <%
            Connection con = null;
            Statement stmt = null;
            ResultSet rs = null;

            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tech", "root", "");
                stmt = con.createStatement();
                rs = stmt.executeQuery("SELECT * FROM technician");

                boolean hasData = false;

                while (rs.next()) {
                    hasData = true;
        %>
                    <div class="col-md-6 col-lg-3 mb-4"> 
                          <div class="card">
                            <div class="card shadow-sm">
                            <center>
                                <img src="<%= request.getContextPath()%>/uploads/<%= rs.getString("profile_pic")%>" class="profile-pic" alt="Profile">
                            <h4><strong><%= rs.getString("username") %></strong></h4>
                            <p><strong>Tech Type:</strong> <%= rs.getString("techtype") %></p>
                            <p><strong>Email:</strong> <%= rs.getString("email") %></p>
                           <a href="contact.jsp?tech_email=<%= rs.getString("email") %>&user_email=<%= session.getAttribute("email") %>" 
                             class="btn btn-primary btn-sm">Contact</a>
                            </center>
                            </div>
                            
                    </div>
        <%
                }

                if (!hasData) {
        %>
                    <p class="text-center text-danger">No technicians found.</p>
        <%
                }

            } catch (Exception e) {
                e.printStackTrace();
        %>
                <p class="text-danger">Database error: <%= e.getMessage() %></p>
        <%
            } finally {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            }
        %>
    </div>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</body>
</html>