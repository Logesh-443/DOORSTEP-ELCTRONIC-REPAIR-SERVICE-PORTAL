<%-- 
    Document   : contact
    Created on : 26 Mar, 2025, 10:59:58 AM
    Author     : Logesh seenivasan
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Contact Technician</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <h2 class="text-center">Contact Technician</h2>
    <form method="post" action="SendEmailServlet">
        <div class="form-group">
            <label>To (Technician Email):</label>
            <input type="email" class="form-control" name="tech_email" value="<%= request.getParameter("tech_email") %>" readonly>
        </div>
        <div class="form-group">
            <label>From (Your Email):</label>
            <input type="email" class="form-control" name="user_email" value="<%= request.getParameter("user_email") %>" readonly>
        </div>
        <div class="form-group">
            <label>Subject:</label>
            <input type="text" class="form-control" name="subject" required>
        </div>
        <div class="form-group">
            <label>Message:</label>
            <textarea class="form-control" name="message" rows="4" required></textarea>
        </div>
        <button type="submit" class="btn btn-success">Send Email</button>
        <a href="user_dash.jsp" class="btn btn-danger">Cancel</a>
    </form>
</div>
</body>
</html>
