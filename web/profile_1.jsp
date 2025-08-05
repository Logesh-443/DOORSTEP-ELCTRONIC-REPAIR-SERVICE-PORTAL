<%-- 
    Document   : profile_1
    Created on : 13 Mar, 2025, 10:18:51 PM
    Author     : Logesh seenivasan
--%>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    HttpSession sessionObj = request.getSession(false);
    if (sessionObj == null || sessionObj.getAttribute("username") == null) {
        response.sendRedirect("user_log.jsp");
        return;
    }

    String username = (String) sessionObj.getAttribute("username");
    String email = (String) sessionObj.getAttribute("email");
    String profile_pic = (String) sessionObj.getAttribute("profile_pic");
    String mobile = (String) sessionObj.getAttribute("mobile");
%>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>User Dashboard</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
  <div class="d-flex">
    <div class="sidebar bg-dark text-white p-3" style="width: 250px; height: 100vh;">
      <h2 class="text-center">User Dashboard</h2>
      <ul class="nav flex-column">
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
        <li class="nav-item">
          <a class="nav-link text-white" href="./logout_user.jsp">Logout</a>
        </li>
      </ul>
    </div>
    <div class="container mt-5">
      <h3 class="text-center mb-4">USER PROFILE</h3>
      <div class="row">
        <center>
          <div class="col-md-6 col-lg-3 mb-4">
            <div class="card">
              <div class="card shadow-sm">
                <center>
                  <img src="<%= profile_pic %>" class="profile-pic" alt="Profile Picture" style="width:150px;height:150px;">
                  <button type="button" class="btn btn-primary mt-2" data-bs-toggle="modal" data-bs-target="#uploadModal">
                    Upload
                  </button>
                  <p><strong>Username:</strong> <%= username %></p>
                  <p><strong>Email:</strong> <%= email %></p>
                  <p><strong>Contact:</strong> <%= mobile %></p>
                </center>
              </div>
            </div>
          </div>
        </center>
      </div>
    </div>
  </div>
  
  <!-- Modal -->
  <div class="modal fade" id="uploadModal" tabindex="-1" aria-labelledby="uploadModalLabel" aria-hidden="true">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="uploadModalLabel">Upload Profile Picture</h5>
          <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
        </div>
        <div class="modal-body">
          <form action="UploadFileServlet_1" method="post" enctype="multipart/form-data">
            <input type="file" name="profilePic" accept="image/*" required class="form-control">
            <br>
            <button type="submit" class="btn btn-primary">Upload</button>
          </form>
        </div>
      </div>
    </div>
  </div>
  
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"></script>
</body>
</html>
