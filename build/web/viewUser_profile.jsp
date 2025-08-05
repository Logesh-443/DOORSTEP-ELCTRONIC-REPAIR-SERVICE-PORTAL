<%-- 
    Document   : viewUser_profile
    Created on : 13 Mar, 2025, 10:20:02 PM
    Author     : Logesh seenivasan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="java.sql.DriverManager"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View profile</title>
    </head>
    <body>
        <h2>Uploaded image</h2>
        <%
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","");
                String sql="SELECT file_Name FROM user_profile";
                PreparedStatement stmt=con.prepareStatement(sql);
                ResultSet rs=stmt.executeQuery();
                
                while(rs.next()){
                    String fileName=rs.getString("file_Name");
                    out.print("<img src='Images/" +fileName+"'width='200'><br>");
                }
                con.close();
            }catch(Exception e){
                out.println("Error: "+ e.getMessage());
            }
            %>
    </body>
</html>
