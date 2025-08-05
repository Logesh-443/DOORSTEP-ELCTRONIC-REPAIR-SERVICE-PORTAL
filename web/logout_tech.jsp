<%-- 
    Document   : logout_tech
    Created on : 19 Mar, 2025, 11:49:41 AM
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
        window.location.href = "tech_log.jsp"; // Redirect to login page
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
