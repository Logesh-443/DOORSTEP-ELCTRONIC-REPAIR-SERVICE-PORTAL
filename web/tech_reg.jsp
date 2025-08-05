<%-- 
    Document   : tech_reg
    Created on : 13 Mar, 2025, 12:56:07 PM
    Author     : Logesh seenivasan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
     <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
     <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
     <!--<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>-->
    <style>
     header{
            text-align:center;
            background-color:deepskyblue;
            padding:10px;
        }
        </style>
    </head>
    <body>
        <%--<jsp:include page="./admin_dash.jsp"/>--%>
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
                <li><a href="#about">About</a></li>
                <li><a href="#services">Services</a></li>
                <li><a href="#contact">Contact</a></li>
            <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Sign-Up <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="./user_reg.jsp">User</a></li>
                        <li><a href="./tech_reg.jsp">Technician</a></li>
                    </ul>
            </li>
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
            <h3 style="text-align:center;color:red;">TECHNICIAN</h3>
            <div class="row">
                <div class="col-md-3"></div>
                <div class="col-md-8"></div>
                <form method="post" action="tech_servlet"enctype="multipart/form-data">
      
                    <div class="form-group">
                        <label for="username">USERNAME</label>
                        <input type="text"name="username"class="form-control"placeholder="Enter your name"required>
                    </div>
                    <div class="form-group">
                        <label for="password">PASSWORD</label>
                        <input type="password"name="password"class="form-control"placeholder="Enter your name"required>
                    </div>
                    <div class="form-group">
                         <label for="course">TECHNICIAN TYPE</label>
                         <select name="techtype"class="form-control">
                             <option disabled selected>Technician type</option>
                             <option value="Laptop">Laptop</option>
                             <option value="Mobile">Mobile</option>
                             <option value="AC">AC</option>
                             <option value="Refrigerator">Refrigerator</option>
                             <option value="Washing Machine">Washing Machine</option>

                         </select>
                    </div>
                    <div class="form-group">
                         <label for="email">EMAIL</label>
                        <input type="email"name="email"class="form-control"placeholder="Enter your email"required>
                    </div>
                    <div class="form-group">
                        <label for="gender">GENDER</label>
                        <label for="Male"style="margin-left:50px">Male
                            <input type="radio"name="gender"id="Male"value="Male"required/></label>
                        <label for="Female"style="margin-left:100px">Female
                            <input type="radio"name="gender"id="Female"value="Female"required/></label>
                    </div>
                    <div class="form-group">
                         <label for="address">ADDRESS</label>
                         <input type="text"name="address"class="form-control"placeholder="Enter your Address"required>   
                    </div>
                    <div class="form-group">
                        <label for="mobile">PHONE NO</label>
                         <input type="number"name="mobile"class="form-control"pattern="[0-9]{10}"placeholder="Enter your phone no"required> 
                    </div>
                    <div class="form-group">
                        <label for="Profile_pic">Profile_pic</label>
                        <input type="file" name="profile_pic" accept="image/*" required>
                    </div>
                    <div class="form-group">
                        <input type="Submit"class="btn-btn-success"value="Register"/>
                    </div>
                    </div>   
                </form>
        </div>
    </body>
</html>

