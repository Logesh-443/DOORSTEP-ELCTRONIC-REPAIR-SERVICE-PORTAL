<%-- 
    Document   : view_user
    Created on : 13 Mar, 2025, 10:10:57 PM
    Author     : Logesh seenivasan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="java.sql.DriverManager"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>view user page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
     <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
     <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
     <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script> 
    </head>
    <body>
        <jsp:include page="./user_dash.jsp"/>
        <div class="container">
            <table class='table table-bordered'>
                <h2 style="text-align:center;color:red;">View student</h2>
                <br>
                <tr bgcolor="red">
                    <th>ID</th>
                    <th>Username</th>
                    <th>Password</th>
                    <th>Gender</th>
                    <th>Email</th>
                    <th>Address</th>
                    <th>Mobile</th>
<!--                    <th>Course</th>-->
                    <!--<th>Reg.date</th>-->
                </tr>
                <%
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tech","root","");
                    Statement st=con.createStatement();
                    ResultSet rs=st.executeQuery("select*from user_reg");
                    while(rs.next())
                        out.print("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"</td><td>"+rs.getString(7)+"</td></tr>");
                    con.close();
                %>
            </table>
        </div>
    </body>
</html>