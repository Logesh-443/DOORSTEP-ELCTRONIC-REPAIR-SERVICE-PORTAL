<%-- 
    Document   : index
    Created on : 13 Mar, 2025, 12:41:19 PM
    Author     : Logesh seenivasan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Doorstep Electronic Repair Service – Fast, Reliable, and Convenient. We fix all types of electronics at your doorstep.">
    <title>Doorstep Electronic Repair Service</title>
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
    <div id="home-carousel" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
            <li data-target="#home-carousel" data-slide-to="0" class="active"></li>
            <li data-target="#home-carousel" data-slide-to="1"></li>
            <li data-target="#home-carousel" data-slide-to="2"></li>
        </ol>

        <div class="carousel-inner">
            <div class="item active">
                <img src="./images/AC.jpg" alt="Repair Service 1" width="100%">
                <div class="carousel-caption">
                    <h3>Fast & Reliable Service</h3>
                    <p>Get your electronics repaired at your doorstep!</p>
                </div>
            </div>
            <div class="item">
                <img src="./images/laptop.jpg" alt="Repair Service 2"width="100%">
                <div class="carousel-caption">
                    <h3>Experienced Technicians</h3>
                    <p>Our experts are trained to repair all kinds of electronics.</p>
                </div>
            </div>
            <div class="item">
                <img src="./images/washing_machine.jpg" alt="Repair Service 3"width="100%">
                <div class="carousel-caption">
                    <h3>Affordable Rates</h3>
                    <p>Get the best prices for high-quality service.</p>
                </div>
            </div>
        </div>

        <a class="left carousel-control" href="#home-carousel" role="button" data-slide="prev">
            <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="right carousel-control" href="#home-carousel" role="button" data-slide="next">
            <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>
   </div>
    <section id="about" class="py-5">
        <div class="container_2">
            <div class="row">
                <div class="col-12 text-center">
                    <h2>About Us</h2>
                    <p>We provide doorstep repair services for all types of electronic devices. From mobile phones to home appliances, our expert technicians are ready to solve your problems at your convenience.</p>
                </div>
            </div>
        </div>
    </section>

    <section id="services" class="bg-light py-5">
        <div class="container_2">
            <h2 class="text-center mb-4">Our Services</h2>
            <div class="row">
                <div class="col-md-4">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h3 class="panel-title">Mobile Repair</h3>
                        </div>
                        <div class="panel-body">
                            <p>We fix smartphones, tablets, and more. Screen replacements, battery issues, and more.</p>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h3 class="panel-title">Laptop Repair</h3>
                        </div>
                        <div class="panel-body">
                            <p>From screen repairs to software troubleshooting, we handle all laptop issues at your doorstep.</p>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h3 class="panel-title">Appliance Repair</h3>
                        </div>
                        <div class="panel-body">
                            <p>We repair home appliances such as refrigerators, washing machines, and microwaves.</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <section id="contact" class="py-5">
        <div class="container text-center">
            <h2>Get in Touch</h2>
            <p>Have an issue with your electronic device? Contact us now for fast and affordable repairs!</p>
            <a href="mailto:logeshseenivasan844@gmail.com" class="cta-button">Contact Us</a>
        </div>
    </section>

    <footer class="footer bg-dark text-white py-3">
        <div class="container text-center">
            <p>&copy; 2025 Doorstep Electronics Repair | All rights reserved</p>
            <p>Follow us on: 
                <a href="#" class="text-white">Facebook</a> | 
                <a href="#" class="text-white">Instagram</a> | 
                <a href="#" class="text-white">Twitter</a>
            </p>
        </div>
    </footer>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>

