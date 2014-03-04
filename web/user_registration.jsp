<%-- 
    Document   : user_registration
    Created on : 28 Jan, 2014, 8:01:19 PM
    Author     : Raj Gaurav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>User Registration (Part-1)</title>
      <link rel="icon" type="image/png" href="images/iconsp_1.png">
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <link href="css/style.css" rel="stylesheet" />
      <link href="css/user_registration.css" rel="stylesheet" />
      <script type="text/javascript" src="jquery/FormValidation.js"></script>
  </head>
  <body>
    <div id="wrapper">
      <%@include file="includes/header.jsp" %>
      <div id="content">
          <h2>User Registration Form (Step-1)</h2><hr>
          <form method="post" action="SpecificUserRegistration">
          <table align='center'>
              <tr>
                  <td class="subheading">Login Details</td>
                  <td></td>
              </tr>
              <tr>
                  <td>User Name</td>
                  <td>
                   <input type="text" name="uname" autocomplete="off" required>
                  </td>
              </tr>
              <tr>
                  <td>Password</td>
                  <td><input type="password" name="pass" id="pass1"  required></td>
              </tr>
              <tr>
                  <td>Confirm Password</td>
                  <td><input type="password" name="cpass" id="pass2"
                             onkeyup="checkPass(); return false;" required>
                      <span id="confirmMessage" class="confirmMessage"></span>
                  </td>
              </tr>
              <tr>
                  <td>Role</td>
                          <td>
                              <select name="role">
                                  <option value="student" default>Student</option>
                                  <option value="parent">Parent</option>
                                  <option value="staff">Staff</option>
                                  <option value="faculty">Faculty</option>
                                  <option value="coordinator">Co-ordinator
                                  </option>
                                  
                                  <option value="headofdepartment">
                                      Head Of Department</option>
                                  <option value="director">Director</option>
                                </select>
                          </td>
              </tr>
              <tr>
                  <td>Security Question</td>
                  <td><select name="sq">
                          <option value="Who is your role model?">
                              Who is your role model ?</option>
                          <option value="Your First Mobile Number?">
                              Your First Mobile Number ?</option>
                          <option value="Your Favorite Teacher?">
                              Your Favorite Teacher ?</option>
                      </select>
                  </td>
              </tr>
              <tr>
                  <td>Your Answer</td>
                  <td><input type="text" name="sqa" autocomplete="off" required></td>
              </tr>
              <tr>
                  <td></td>
                  <td></td>
              </tr><tr>
                  <td></td>
                  <td></td>
              </tr><tr>
                  <td></td>
                  <td><input type="submit" value="Next Step"></td>
              </tr>
          </table>
          </form>
      </div>
      <%@include file="includes/footer.jsp" %>
    </div>
  </body>
</html>
