<%-- 
    Document   : add_user
    Created on : 13 Mar, 2025, 10:08:25 PM
    Author     : Logesh seenivasan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="java.sql.DriverManager"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ADD USER</title>
    </head>
    <body>
        <jsp:include page="./user_dash.jsp"/>
           <%
               String username=request.getParameter("username");
               String password=request.getParameter("password");
               String gender=request.getParameter("gender");
               String email=request.getParameter("email");
//               String gender=request.getParameter("gender");
               String address=request.getParameter("address");
               String mobile=request.getParameter("mobile");
//               String address=request.getParameter("address");
//               String course=request.getParameter("course");
               Class.forName("com.mysql.jdbc.Driver");
               Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tech","root","");
            Statement st=con.createStatement();
            String sql="insert into user_reg(username,password,gender,email,address,mobile)values('"+username+"','"+password+"','"+gender+"','"+email+"','"+address+"','"+mobile+"');";
            int i=st.executeUpdate(sql);
            if(i!=0){
                out.print("<script>"
                        +"alert('Data added successfully..!');"
                        +"location.href='./user_reg.jsp';"
                        +"</script>"
                );
            }
            %>  
    </body>
</html>