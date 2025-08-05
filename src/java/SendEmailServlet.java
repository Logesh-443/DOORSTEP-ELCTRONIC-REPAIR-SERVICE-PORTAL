/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SendEmailServlet")
public class SendEmailServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        String recipientEmail = request.getParameter("tech_email"); // Technician Email
        String senderEmail = request.getParameter("user_email"); // User Email
        String subject = request.getParameter("subject");
        String messageContent = request.getParameter("message");

        final String senderAccount = "iniyalnatarajan30@gmail.com"; // Change to your email
        final String senderPassword = "xolm bkds wyrn mgzp"; // Use app password if needed

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        // Authenticate and create mail session
        Session sessionMail = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderAccount, senderPassword);
            }
        });

        try {
            Message msg = new MimeMessage(sessionMail);
            msg.setFrom(new InternetAddress(senderEmail)); // Set user's email as sender
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail)); // Technician Email
            msg.setSubject(subject);
            msg.setText("From: " + senderEmail + "\n\n" + messageContent);

            Transport.send(msg);

            response.sendRedirect("user_dash.jsp?emailStatus=success");
        } catch (MessagingException e) {
            e.printStackTrace();
            response.sendRedirect("contact.jsp?emailStatus=error&message=" + e.getMessage());
        }
    }
}
