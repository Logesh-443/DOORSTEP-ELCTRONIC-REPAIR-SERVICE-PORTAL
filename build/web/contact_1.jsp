<%-- 
    Document   : contact_1
    Created on : 21 Mar, 2025, 12:11:57 PM
    Author     : Logesh seenivasan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <style>
        header{
            text-align:center;
            background-color:deepskyblue;
            padding:10px;
        }
        .container{
            width:50%;
            height:50%;
        }
        .hero {
            background-color: #f7f7f7;
            padding: 80px 0;
            text-align: center;
        }

        .hero h2 {
            font-size: 3rem;
            margin-bottom: 20px;
        }

        .hero p {
            font-size: 1.2rem;
            margin-bottom: 20px;
        }

        .cta-button {
            background-color: #FF5722;
            color: white;
            padding: 15px 30px;
            font-size: 1.1rem;
            border-radius: 5px;
            text-decoration: none;
        }

        .cta-button:hover {
            background-color: #e64a19;
        }

        .footer {
            background-color: #333;
            color: white;
            padding: 20px;
            text-align: center;
        }

        .footer a {
            color: #FF5722;
            text-decoration: none;
        }

        .footer a:hover {
            text-decoration: underline;
        }
    </style>
    </head>
    <body>
        <header>
        <h1>ELECTRONIC REPAIR SERVICE</h1>
    </header>
    <nav class="navbar navbar-inverse">
        <div class="container_1">
            <div class="navbar-header">
                <a class="navbar-brand" href="#">Electronics Repair</a>
            </div>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="./index.jsp">Home</a></li>
                <li><a href="./about.jsp">About</a></li>
                <li><a href="./ourservices.jsp">Services</a></li>
                <li><a href="./contact.jsp">Contact</a></li>
                
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Login <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="./admin_log.jsp">Admin</a></li>
                        <li><a href="./user_log.jsp">User</a></li>
                        <li><a href="./tech_log.jsp">Technician</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </nav>
         <section id="contact" class="py-5">
        <div class="container text-center">
            <h2>Get in Touch</h2>
            <p>Have an issue with your electronic device? Contact us now for fast and affordable repairs!</p>
            <a href="mailto:logeshseenivasan844@gmail.com" class="cta-button">Contact Us</a>
        </div>
    </section>
    </body>
</html>
