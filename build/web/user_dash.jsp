<%-- 
    Document   : user_dash
    Created on : 13 Mar, 2025, 12:54:26 PM
    Author     : Logesh seenivasan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>User Dashboard</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
  <!-- Sidebar Menu -->
  <div class="d-flex">
    <div class="sidebar bg-dark text-white p-3" style="width: 250px; height: 100vh;">
      <h2 class="text-center">User Dashboard</h2>
      <ul class="nav flex-column">
<!--        <li class="nav-item">
          <a class="nav-link text-white" href="./index.jsp">Home</a>
        </li>-->
        <li class="nav-item">
          <a class="nav-link text-white" href="./profile_1.jsp">Profile</a>
        </li>
        <li class="nav-item">
          <a class="nav-link text-white" href="./service_req.jsp">Request</a>
        </li>
        <li class="nav-item">
          <a class="nav-link text-white" href="./appointment.jsp">Appointment</a>
        </li>
        <li class="nav-item">
          <a class="nav-link text-white" href="./technicians.jsp">Technician</a>
        </li>
        <li class="nav-item">
          <a class="nav-link text-white" href="./feedback.jsp">Feedback</a>
        </li>
        <li class="nav-item-1">
          <a class="nav-link text-white" href="./logout_user.jsp">Logout</a>
        </li>
      </ul>
    </div>

    <div class="container-fluid p-4">
      <h1 class="display-4">User Dashboard</h1>
      <p>Welcome to your user dashboard. From here, you can manage your requests, appointments, and view your profile.</p>
      
<!--      <div class="row">
        <div class="col">
          <h3>Home</h3>
          <p>Access your main page with the latest updates and status of your requests.</p>
        </div>
        
        <div class="col">
          <h3>Profile</h3>
          <p>View and edit your personal details, preferences, and account information.</p>
        </div>
        
        <div class="col">
          <h3>Request</h3>
          <p>Place a new repair request or view existing repair requests.</p>
        </div>
      </div>-->

<!--      <div class="row mt-4">
        <div class="col">
          <h3>Appointment</h3>
          <p>Schedule an appointment for a technician to visit your location and repair your device.</p>
        </div>

        <div class="col">
<a href="tech_reg.jsp"></a>
          <h3>Technician</h3>
          <p>View available technicians, their profiles, and select a technician for your repair.</p>
        </div>

        <div class="col">
          <h3>Feedback</h3>
          <p>Provide feedback for the services you received to help us improve.</p>
        </div>
      </div>-->
    </div>
  </div>

  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"></script>
</body>
</html>
