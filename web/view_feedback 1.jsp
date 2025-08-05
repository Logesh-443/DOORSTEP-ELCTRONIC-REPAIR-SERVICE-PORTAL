<%-- 
    Document   : view_feedback 1
    Created on : 24 Mar, 2025, 1:06:44 PM
    Author     : Logesh seenivasan
--%>

<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Technician Feedback</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <h2 class="text-center">Your Feedback</h2>

        <table class="table table-bordered table-striped">
            <thead>
                <tr>
                    <th>User Name</th>
                    <th>Email</th>
                    <th>Rating</th>
                    <th>Comments</th>
                </tr>
            </thead>
            <tbody>
                <%
                    int technicianId = (session.getAttribute("id") != null) ? (Integer) session.getAttribute("id") : -1;

                    if (technicianId != -1) {
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tech", "root", "");
                            PreparedStatement ps = conn.prepareStatement("SELECT user_name, user_email, rating, comments FROM feedback WHERE technician_id=?");
                            ps.setInt(1, technicianId);
                            ResultSet rs = ps.executeQuery();

                            if (!rs.isBeforeFirst()) {
                                out.println("<tr><td colspan='4' class='text-center text-warning'>No feedback available</td></tr>");
                            } else {
                                while (rs.next()) {
                %>
                <tr>
                    <td><%= rs.getString("user_name") %></td>
                    <td><%= rs.getString("user_email") %></td>
                    <td><%= rs.getInt("rating") %></td>
                    <td><%= rs.getString("comments") %></td>
                </tr>
                <%
                                }
                            }
                            conn.close();
                        } catch (Exception e) {
                            out.println("<tr><td colspan='4' class='text-center text-danger'>Error: " + e.getMessage() + "</td></tr>");
                        }
                    } else {
                        out.println("<tr><td colspan='4' class='text-center text-danger'>Technician ID not found</td></tr>");
                    }
                %>
            </tbody>
        </table>
    </div>
</body>
</html>
