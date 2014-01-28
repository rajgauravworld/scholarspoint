<%-- 
    Document   : user_registration
    Created on : 28 Jan, 2014, 8:01:19 PM
    Author     : Raj Gaurav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title></title>
      <link rel="icon" type="image/png" href="images/iconsp_1.png">
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <link href="css/style.css" rel="stylesheet" />
      <link href="css/user_registration.css" rel="stylesheet" />
  </head>
  <body>
    <div id="wrapper">
      <%@include file="includes/header.jsp" %>
      <div id="content">
          <h2>User Registration Form</h2><hr>
          <form method="post" action="ProcessRegistration">
          <table align='center'>
              <tr>
                  <td class="subheading">Login Details</td>
                  <td></td>
              </tr>
              <tr>
                  <td>User Name</td>
                  <td><input type="text" name="uname" autocomplete="off" required></td>
              </tr>
              <tr>
                  <td>Password</td>
                  <td><input type="password" name="pass"  required></td>
              </tr>
              <tr>
                  <td>Confirm Password</td>
                  <td><input type="text" name="cpass" required></td>
              </tr>
              <tr>
                  <td>Role</td>
                  <td><input type="text" name="cpass" required></td>
              </tr>
              <tr>
                  <td class="subheading">Personal Details</td>
                  <td></td>
              </tr>  
              <tr>
                  <td>Roll Number</td>
                  <td><input type="number" name="rollno"></td>
              </tr>
              <tr>
                  <td>Name</td>
                  <td><input type="text" name="name"  required></td>
              </tr>
              <tr>
                  <td>Date of Birth</td>
                  <td><input type="date" name="dob" max="2014-01-01" min="1960-01-01"  required></td>
              </tr>
              <tr>
                  <td>Father's Name</td>
                  <td><input type="text" name="fname"  required></td>
              </tr>
              <tr>
                  <td>Mother's Name</td>
                  <td><input type="text" name="mname" required></td>
              </tr>
              <tr>
                  <td>Branch</td>
                  <td><input type="text" name="branch" required></td>
              </tr>
              <tr>
                  <td>year</td>
                  <td><input type="text" name="year" required></td>
              </tr>
              <tr>
                  <td></td>
                  <td><input type="submit" value="Submit" ><input type="reset" value="Reset"></td>
              </tr>
          </table>
          </form>
      </div>
      <%@include file="includes/footer.jsp" %>
    </div>
  </body>
</html>
