<%-- 
    Document   : Accept
    Created on : 15 Mar, 2025, 11:06:29 AM
    Author     : Logesh seenivasan
--%>

<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>View Requests</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<style>
      .nav-item-1:hover{
          display: block;
      }
      </style>
</head>
<body>
    <div class="d-flex">
    <div class="sidebar bg-dark text-white p-3" style="width: 250px; height: 100vh;">
      <h2 class="text-center">Technician Dashboard</h2>
      <ul class="nav flex-column">
<!--        <li class="nav-item">
          <a class="nav-link text-white" href="./index.jsp">Home</a>
        </li>-->
        <li class="nav-item">
          <a class="nav-link text-white" href="./profile.jsp">Profile</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle text-white" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Request
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
            <li><a class="dropdown-item" href="./view_req.jsp">New</a></li>
            <li><a class="dropdown-item" href="./accepted_requests.jsp">Accept</a></li>
            <li><a class="dropdown-item" href="./rejected_requests.jsp">Reject</a></li>
          </ul>
        </li>
        <li class="nav-item">
          <a class="nav-link text-white" href="#">Feedback</a>
        </li>
        <li class="nav-item-1">
          <a class="nav-link text-white" href="./logout_tech.jsp">Logout</a>
        </li>
      </ul>
    </div>
    <div class="container">
        <h2 class="text-center">Accepted Requests</h2>
        <table class="table table-bordered">
            <thead>
                <tr bgcolor="blue">
                    <th>ID</th>
                    <th>Name</th>
                    <th>Contact</th>
                    <th>Service</th>
                    <th>Issue</th>
                    <!--<th>Action</th>-->
                </tr>
            </thead>
            <tbody>
                <%
                    String url = "jdbc:mysql://localhost:3306/service_db";
                    String user = "root";
                    String password = "";

                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = DriverManager.getConnection(url, user, password);
                        Statement stmt = conn.createStatement();
                        ResultSet rs = stmt.executeQuery("SELECT * FROM service_requests WHERE Status='Accepted'");
                        while (rs.next()) {
                %>
                            <tr>
                                <td><%= rs.getInt("id") %></td>
                                <td><%= rs.getString("Name") %></td>
                                <td><%= rs.getString("Contact") %></td>
                                <td><%= rs.getString("Services") %></td>
                                <td><%= rs.getString("Issues") %></td>
                            </tr>
                <%
                        }
                        conn.close();
                    } catch (Exception e) {
                        out.println("<div class='alert alert-danger'>Database error: " + e.getMessage() + "</div>");
                    }
                %>
            </tbody>
        </table>
    </div>
            <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"></script>
</body>
</html>