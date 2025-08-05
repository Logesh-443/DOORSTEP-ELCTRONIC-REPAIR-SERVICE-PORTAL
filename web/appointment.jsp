<%-- 
    Document   : appointment
    Created on : 13 Mar, 2025, 10:20:40 PM
    Author     : Logesh seenivasan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*, javax.servlet.http.*, javax.servlet.*" %>
<%
    // Ensure user is logged in using session attributes
    HttpSession userSession = request.getSession(false);
    if (userSession == null || userSession.getAttribute("username") == null || userSession.getAttribute("password") == null) {
        response.sendRedirect("user_log.jsp?error=Please login first");
        return;
    }

    // Fetch logged-in user details from session
    String loggedInUsername = (String) userSession.getAttribute("username");
    String loggedInMobile=(String)userSession.getAttribute("mobile");
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Appointment Form - Doorstep Electronic Repair Service</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h2 class="text-center">Schedule Your Repair Appointment</h2>
        <p class="text-center">Hello, <b><%= loggedInUsername %></b>. Please fill out the form below.</p>

        <form action="submit_appointment.jsp" method="POST">
            <!-- Hidden input to store username -->
            <input type="hidden" name="loggedInUsername" value="<%= loggedInUsername %>">

            <div class="row">
                <div class="col-md-6">
                    <!-- Full Name (Auto-Filled, Read-Only) -->
                    <div class="mb-3">
                        <label for="userName" class="form-label">Full Name</label>
                        <input type="text" class="form-control" id="userName" name="userName" value="<%= loggedInUsername %>" readonly>
                    </div>

                    <!-- Phone Number -->
                    <div class="mb-3">
                        <label for="userPhone" class="form-label">Phone Number</label>
                        <input type="tel" class="form-control" id="userPhone" name="userPhone" value="<%= loggedInMobile %>" readonly>
                    </div>

                    <!-- Preferred Appointment Time -->
                    <div class="mb-3">
                        <label for="appointmentTime" class="form-label">Preferred Appointment Time</label>
                        <input type="time" class="form-control" id="appointmentTime" name="appointmentTime" required>
                    </div>
                    <div class="mb-3">
                        <label for="appointmentDate" class="form-label">Preferred Appointment Date</label>
                        <input type="date" class="form-control" id="appointmentDate" name="appointmentDate" required>
                    </div>
                </div>

                <div class="col-md-6">
                    <!-- Select Technician -->
                    <div class="mb-3">
                        <label for="technician" class="form-label">Select Technician</label>
                        <select class="form-select" id="technician" name="technician" required onchange="updateDeviceType()">
                            <option value="" disabled selected>Select a technician</option>
                            <% 
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tech", "root", "");
                                    Statement stmt = con.createStatement();
                                    ResultSet rs = stmt.executeQuery("SELECT id, username, techtype FROM technician");

                                    while (rs.next()) {
                                        int techId = rs.getInt("id");
                                        String techName = rs.getString("username");
                                        String deviceType = rs.getString("techtype"); // Fetch device type handled by technician
                            %>
                            <option value="<%= techId %>" data-devicetype="<%= deviceType %>">
                                <%= techName %>
                            </option>
                            <% 
                                    }
                                    con.close();
                                } catch (Exception e) {
                                    out.println("<option disabled>Error fetching technicians</option>");
                                    e.printStackTrace();
                                }
                            %>
                        </select>
                    </div>

                    <!-- Device Type (Filtered based on Technician) -->
                    <div class="mb-3">
                        <label for="deviceType" class="form-label">Device Type</label>
                        <select class="form-select" id="deviceType" name="deviceType" required>
                            <option value="" disabled selected>Select your device</option>
                        </select>
                    </div>

                    <!-- Issue Description -->
                    <div class="mb-3">
                        <label for="issueDescription" class="form-label">Issue Description</label>
                        <textarea class="form-control" id="issueDescription" name="issueDescription" rows="4" required></textarea>
                    </div>

                    <!-- Preferred Appointment Date -->
                    
                </div>
            </div>

            <!-- Submit Button -->
            <div class="text-center">
                <button type="submit" class="btn btn-primary">Submit Appointment Request</button>
            </div>
        </form>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"></script>

    <script>
        // JavaScript to auto-fill Device Type based on selected Technician
        function updateDeviceType() {
            var technicianDropdown = document.getElementById("technician");
            var selectedOption = technicianDropdown.options[technicianDropdown.selectedIndex];
            var deviceTypeDropdown = document.getElementById("deviceType");

            if (selectedOption.value) {
                // Get the list of supported device types
                var deviceTypes = selectedOption.getAttribute("data-devicetype").split(",");
                
                // Clear and update the Device Type dropdown
                deviceTypeDropdown.innerHTML = '<option value="" disabled selected>Select your device</option>';
                deviceTypes.forEach(function(device) {
                    var option = document.createElement("option");
                    option.value = device.trim();
                    option.textContent = device.trim();
                    deviceTypeDropdown.appendChild(option);
                });
            } else {
                deviceTypeDropdown.innerHTML = '<option value="" disabled selected>Select your device</option>';
            }
        }
    </script>
</body>
</html>
