/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.IOException;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/tech_servlet")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, 
                 maxFileSize = 1024 * 1024 * 10,      
                 maxRequestSize = 1024 * 1024 * 50)   
public class tech_servlet extends HttpServlet {
    private static final String UPLOAD_DIRECTORY = "uploads"; 

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String techtype = request.getParameter("techtype");       
        String email = request.getParameter("email");       
        String gender=request.getParameter("gender");
        String address=request.getParameter("address");
        String mobile=request.getParameter("mobile");

        Part filePart = request.getPart("profile_pic"); 
        String profile_pic = filePart.getSubmittedFileName();

        String uploadPath = getServletContext().getRealPath("") + File.separator + UPLOAD_DIRECTORY;
        File uploadDir = new File(uploadPath);
        if (!uploadDir.exists()) {
            uploadDir.mkdir(); 
        }

        String filePath = uploadPath + File.separator + profile_pic;
        filePart.write(filePath);

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tech", "root", "");

            String sql = "INSERT INTO technician ( username, password,techtype,email,gender,address,mobile, profile_pic) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, techtype);                      
            ps.setString(4, email);
            ps.setString(5, gender);
            ps.setString(6, address);
            ps.setString(7, mobile);
            ps.setString(8, profile_pic); 

            ps.executeUpdate();
            con.close();

            
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            session.setAttribute("password", password);
            session.setAttribute("techtype", techtype);            
            session.setAttribute("email", email);            
            session.setAttribute("gender", gender);
            session.setAttribute("address", address);
            session.setAttribute("mobile", mobile);
            session.setAttribute("profile_pic", UPLOAD_DIRECTORY + "/" + profile_pic);

            response.sendRedirect("./tech_log.jsp"); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}