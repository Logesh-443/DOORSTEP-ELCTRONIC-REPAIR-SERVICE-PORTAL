/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.servlet.annotation.MultipartConfig;
import java.nio.file.Paths;

/**
 *
 * @author Logesh seenivasan
 */
@WebServlet("/userLog_servlet")
public class userLog_servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tech", "root", "");
            PreparedStatement ps = con.prepareStatement("SELECT username, password, email, gender, address, mobile, profile_pic FROM user_reg WHERE username=? AND password=? ");
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                HttpSession session = request.getSession();
                session.setAttribute("username", rs.getString("username"));
                session.setAttribute("password", rs.getString("password"));
//                session.setAttribute("techtype", rs.getString("techtype"));
                session.setAttribute("email", rs.getString("email"));
                session.setAttribute("gender", rs.getString("gender"));
                session.setAttribute("address", rs.getString("address"));
                session.setAttribute("mobile", rs.getString("mobile"));
                session.setAttribute("profile_pic", "C:/uploads/" + rs.getString("profile_pic"));
                
                System.out.println("User Logged In: " + rs.getString("username"));
                System.out.println("Email Stored in Session: " + rs.getString("email"));
                
                response.sendRedirect("profile_1.jsp");
            } else {
                response.sendRedirect("user_log.jsp?error=Invalid credentials");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}