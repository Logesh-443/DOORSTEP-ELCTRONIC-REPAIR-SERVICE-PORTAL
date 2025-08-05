<%-- 
    Document   : logout_user
    Created on : 19 Mar, 2025, 11:48:49 AM
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
        window.location.href = "user_log.jsp";
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
