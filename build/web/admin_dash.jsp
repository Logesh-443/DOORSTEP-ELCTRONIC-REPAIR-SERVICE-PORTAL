<%-- 
    Document   : admin_dash
    Created on : 13 Mar, 2025, 12:52:37 PM
    Author     : Logesh seenivasan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Admin Dashboard</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <style>
      .nav-item-1:hover{
          display: block;
      }
      </style>
</head>
<body>
  <div class="d-flex">
    <div class="sidebar bg-dark text-white p-3" style="width: 250px; height: 100vh;">
      <h2 class="text-center">Admin Dashboard</h2>
      <ul class="nav flex-column">
<!--        <li class="nav-item">
          <a class="nav-link text-white" href="./index.jsp">Home</a>
        </li>-->
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle text-white" href="#" id="technicianDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Technician
          </a>
          <ul class="dropdown-menu" aria-labelledby="technicianDropdown">
            <li><a class="dropdown-item" href="./tech_reg.jsp">Add</a></li>
            <li><a class="dropdown-item" href="./view_tech.jsp">Existing</a></li>
          </ul>
        </li>
        <li class="nav-item">
          <a class="nav-link text-white" href="./view_req.jsp">View Service</a>
        </li>
        <li class="nav-item">
          <a class="nav-link text-white" href="./view_feedback.jsp">Feedback</a>
        </li>
        <li class="nav-item-1">
          <a class="nav-link text-white" href="./logout.jsp">Logout</a>
        </li>
      </ul>
    </div>

    <div class="container-fluid p-4">
      <h1 class="display-4">Admin Dashboard</h1>
      <p>Welcome to the admin dashboard. Manage technicians, services, and feedback from this dashboard.</p>
      
<!--      <div class="row">
        <div class="col">
          <h3>Home</h3>
          <p>Access the main page to view your latest updates and quick stats about the service requests.</p>
        </div>
        
        <div class="col">
          <h3>Technician</h3>
          <p>Manage technicians by adding new ones or viewing the existing technicians.</p>
        </div>
        
        <div class="col">
          <h3>View Service</h3>
          <p>View the services provided and their statuses. You can also manage or update the service records here.</p>
        </div>
      </div>

      <div class="row mt-4">
        <div class="col">
          <h3>Feedback</h3>
          <p>View and manage customer feedback to ensure service quality and customer satisfaction.</p>
        </div>-->
      </div>
    </div>
<!--  </div>-->

  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"></script>
</body>
</html>