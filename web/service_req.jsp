<%-- 
    Document   : service_req
    Created on : 13 Mar, 2025, 10:16:30 PM
    Author     : Logesh seenivasan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="java.sql.DriverManager"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
     <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
     <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <title>Service Request</title>
    <style>
       
        body {
            background-color: #f8f9fa;  
            font-family: Arial, sans-serif; 
            text-align: center; 
        }
        .container1 { 
            width: 50%; 
            margin: auto; 
            background: white; 
            padding: 20px; 
            border-radius: 8px; 
            box-shadow: 0px 0px 10px gray; 
        }
        h2{
            text-align:center;
        }
        input, select, textarea { 
            width: 90%; 
            padding: 8px; 
            margin: 10px; }
        button { 
            background-color: blue; 
            color: white; 
            padding: 10px 20px; 
            border: none; 
            cursor: pointer; }
    </style>
    </head>
    <body>        
    <div class="container1">
        <h2 class="text-center">Submit Service Request</h2>
        <form method="post">
            <div class="form-group">
                <label>Name:</label>
                <input type="text" name="name" class="form-control" required>
            </div>
            <div class="form-group">
                <label>Contact:</label>
                <input type="text" name="contact" class="form-control" required>
            </div>
            <div class="form-group">
                <label>Service:</label>
                <select name="service" class="form-control" required>
                    <option value="">Select Service</option>
                    <option value="Laptop">Laptop</option>
                    <option value="Mobile">Mobile</option>
                    <option value="Washing Machine">Washing Machine</option>
                    <option value="AC">AC</option>
                    <option value="Television">Television</option>
                    <option value="Purifier">Purifier</option>
                </select>
            </div>
            <div class="form-group">
                <label>Issue:</label>
                <textarea name="issue" class="form-control" required></textarea>
            </div>
            <button type="submit" name="submit" class="btn btn-primary">Submit Request</button>
        </form>

        <%
            if (request.getParameter("submit") != null) {
                String name = request.getParameter("name");
                String contact = request.getParameter("contact");
                String service = request.getParameter("service");
                String issue = request.getParameter("issue");

                String url = "jdbc:mysql://localhost:3306/service_db";
                String user = "root";
                String password = "";

                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = DriverManager.getConnection(url, user, password);
                    PreparedStatement pstmt = conn.prepareStatement("INSERT INTO service_requests (Name, Contact, Services, Issues) VALUES (?, ?, ?, ?)");

                    pstmt.setString(1, name);
                    pstmt.setString(2, contact);
                    pstmt.setString(3, service);
                    pstmt.setString(4, issue);
                    pstmt.executeUpdate();

                    out.println("<div class='alert alert-success'>Request submitted successfully!</div>");
                    conn.close();
                } catch (Exception e) {
                    out.println("<div class='alert alert-danger'>Error: " + e.getMessage() + "</div>");
                }
            }
        %>
    </div>
</body>
</html>