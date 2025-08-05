<%-- 
    Document   : feedback_user
    Created on : 13 Mar, 2025, 10:21:32 PM
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
        <h2 class="text-center">Submit Feedback for Technician</h2>
        <form method="post">
            <div class="form-group">
                <label>Technician:</label>
                <select name="technician_id" class="form-control" required>
                    <option value="">Select Technician</option>
                    <%
                        String url = "jdbc:mysql://localhost:3306/tech";
                        String user = "root";
                        String password = "";

                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn = DriverManager.getConnection(url, user, password);
                            Statement stmt = conn.createStatement();
                            ResultSet rs = stmt.executeQuery("SELECT id, username FROM technician");

                            while (rs.next()) {
                    %>
                    <option value="<%= rs.getInt("id") %>"><%= rs.getString("username") %></option>
                    <%
                            }
                            conn.close();
                        } catch (Exception e) {
                            out.println("<option>Error loading technician</option>");
                        }
                    %>
                </select>
            </div>
            <div class="form-group">
                <label>Name:</label>
                <input type="text" name="user_name" class="form-control" required>
            </div>
            <div class="form-group">
                <label>Email:</label>
                <input type="email" name="user_email" class="form-control" required>
            </div>
            <div class="form-group">
                <label>Rating:</label>
                <select name="rating" class="form-control" required>
                    <option value="">Select Rating</option>
                    <option value="1">1 - Poor</option>
                    <option value="2">2 - Fair</option>
                    <option value="3">3 - Good</option>
                    <option value="4">4 - Very Good</option>
                    <option value="5">5 - Excellent</option>
                </select>
            </div>
            <div class="form-group">
                <label>Comments:</label>
                <textarea name="comments" class="form-control" required></textarea>
            </div>
            <button type="submit" name="submit" class="btn btn-primary">Submit Feedback</button>
            <button type="submit" class="btn btn-success"><a href="./user_dash.jsp">Back</a></button>  
        </form>

        <%
            if (request.getParameter("submit") != null) {
                String technicianId = request.getParameter("technician_id");
                String userName = request.getParameter("user_name");
                String userEmail = request.getParameter("user_email");
                String rating = request.getParameter("rating");
                String comments = request.getParameter("comments");

                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = DriverManager.getConnection(url, user, password);
                    PreparedStatement pstmt = conn.prepareStatement("INSERT INTO feedback (technician_id, user_name, user_email, rating, comments) VALUES (?, ?, ?, ?, ?)");

                    pstmt.setInt(1, Integer.parseInt(technicianId));
                    pstmt.setString(2, userName);
                    pstmt.setString(3, userEmail);
                    pstmt.setString(4, rating);
                    pstmt.setString(5, comments);
                    pstmt.executeUpdate();

                    out.println("<div class='alert alert-success'>Feedback submitted successfully!</div>");
                    conn.close();
                } catch (Exception e) {
                    out.println("<div class='alert alert-danger'>Error: " + e.getMessage() + "</div>");
                }
            }
        %>
    </div>
</body>
</html>