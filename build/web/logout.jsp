<%-- 
    Document   : logout
    Created on : 18 Mar, 2025, 12:52:05 PM
    Author     : Logesh seenivasan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Logout</title>
<script>
    function showAlert() {
        alert("Logout successful!");
        window.location.href = "admin_log.jsp"; // Redirect to login page
    }
</script>
</head>
<body>

<%
    if (session != null && !session.isNew()) {
        session.invalidate();
    }
%>
<script>
    showAlert();
</script>

</body>
</html>
