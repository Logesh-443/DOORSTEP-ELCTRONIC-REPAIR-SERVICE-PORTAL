<%-- 
    Document   : tech_log
    Created on : 13 Mar, 2025, 12:49:49 PM
    Author     : Logesh seenivasan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <title>TECHNICIAN</title>
    <style>
       header{
            text-align:center;
            background-color:deepskyblue;
            padding:10px;
       }
        body {
            background-color: #f8f9fa;
        }
        .login-container {
            max-width: 350px;
            margin: 50px auto;
            background: #fff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        .login-container h3 {
            text-align: center;
            margin-bottom: 20px;
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
                <li><a href="./contact_1.jsp">Contact</a></li>
                
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
    <div class="container">
        <div class="login-container">
            <h3>Technician-Login</h3>
            <form action="./techLog_servlet"method="post">
                <div class="form-group">
                    <label for="username">Username</label>
                    <input type="text" class="form-control" name="username" placeholder="Enter your username">
                </div>
                <div class="form-group">
                    <label for="password">Password</label>
                    <input type="password" class="form-control" name="password" placeholder="Enter your password">
                </div>
                <button type="submit" class="btn btn-primary btn-block">Login</button>
            </form>
            <div class="text-center" style="margin-top: 10px;">
                <a href="#">Forgot Password?</a>
            </div>
            <div class="text-center" style="margin-top: 10px;">
                <p>Don't have an account? <a href="./tech_reg.jsp">Register here</a></p>
            </div>
        </div>
    </div>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

</body>
</html>