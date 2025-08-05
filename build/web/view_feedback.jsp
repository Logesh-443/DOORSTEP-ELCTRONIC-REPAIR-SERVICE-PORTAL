<%-- 
    Document   : view_feedback
    Created on : 24 Mar, 2025, 10:31:15 AM
    Author     : Logesh seenivasan
--%>

<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>View Technician Feedback</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <h2 class="text-center">Technician Feedback</h2>
        <table class="table table-bordered table-striped">
            <thead>
                <tr bgcolor="blue">
                    <th>Technician</th>
                    <th>User Name</th>
                    <th>Email</th>
                    <th>Rating</th>
                    <th>Comments</th>
                </tr>
            </thead>
            <tbody>
                <%
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tech", "root", "");
                        Statement stmt = conn.createStatement();
                        ResultSet rs = stmt.executeQuery("SELECT f.id, t.username AS technician, f.user_name, f.user_email, f.rating, f.comments FROM feedback f JOIN technician t ON f.technician_id = t.id");

                        while (rs.next()) {
                %>
                <tr>
                    <td><%= rs.getString("technician") %></td>
                    <td><%= rs.getString("user_name") %></td>
                    <td><%= rs.getString("user_email") %></td>
                    <td><%= rs.getInt("rating") %></td>
                    <td><%= rs.getString("comments") %></td>
                </tr>
                <%
                        }
                        conn.close();
                    } catch (Exception e) {
                        out.println("<tr><td colspan='5' class='text-center text-danger'>Error: " + e.getMessage() + "</td></tr>");
                    }
                %>
            </tbody>
        </table>
    </div>
</body>
</html>
