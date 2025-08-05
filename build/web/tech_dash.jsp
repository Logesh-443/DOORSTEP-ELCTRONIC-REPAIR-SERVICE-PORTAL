<%-- 
    Document   : tech_dash
    Created on : 13 Mar, 2025, 12:53:35 PM
    Author     : Logesh seenivasan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Technician Dashboard</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
  <div class="d-flex">
    <div class="sidebar bg-dark text-white p-3" style="width: 250px; height: 100vh;">
      <h2 class="text-center">Technician Dashboard</h2>
      <ul class="nav flex-column">
<!--        <li class="nav-item">
          <a class="nav-link text-white" href="./index.jsp">Home</a>
        </li>-->
        <li class="nav-item">
          <a class="nav-link text-white" href="./profile.jsp">Profile</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle text-white" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Request
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
            <li><a class="dropdown-item" href="./view_req.jsp">New</a></li>
            <li><a class="dropdown-item" href="./accepted_requests.jsp">Accept</a></li>
            <li><a class="dropdown-item" href="./rejected_requests.jsp">Reject</a></li>
          </ul>
        </li>
        <li class="nav-item">
          <a class="nav-link text-white" href="./view_feedback 1.jsp">Feedback</a>
        </li>
        <li class="nav-item-1">
          <a class="nav-link text-white" href="./logout_tech.jsp">Logout</a>
        </li>
      </ul>
    </div>

    <div class="container-fluid p-4">
      <h1 class="display-4">Technician Dashboard</h1>
      <p>Welcome to the technician dashboard. Choose an option from the sidebar to manage requests, profile, or feedback.</p>
    </div>
  </div>

  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"></script>
</body>
</html>
