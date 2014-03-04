<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Parent Registration (Part-2)</title>
      <link rel="icon" type="image/png" href="images/iconsp_1.png">
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <link href="css/style.css" rel="stylesheet" />
      <link href="css/user_registration.css" rel="stylesheet" />
  </head>
  <body>
    <div id="wrapper">
      <%@include file="includes/header.jsp" %>
      <%
      String uname=(String)session.getAttribute("uname");
      String pass=(String)session.getAttribute("pass");
      String role=(String)session.getAttribute("role");
      String sq=(String)session.getAttribute("sq");
      String sqa=(String)session.getAttribute("sqa");      
      %>
      <div id="content">
          <form method="post" action="ProcessRegistration">
              <h2>User Registration Form (Step-2)</h2><hr>
              <input type="text" name="uname" value="<%=uname%>">
              <input type="text" name="pass" value="<%=pass%>">
              <input type="text" name="role" value="<%=role%>">
              <input type="text" name="sq" value="<%=sq%>">
              <input type="text" name="sqa" value="<%=sqa%>">
              <table align="center">
                  <tr>
                      <td class="subheading">other Details</td>
                  <td></td>
                  </tr>
                  <tr>
                      <td>Name</td>
                      <td><input type="text" name="name" required></td>
                  </tr>
                  <tr>
                      <td>Ward 1's Roll No.</td>
                      <td><input type="number" name="stu1_roll" required></td>
                  </tr>
                  <tr>
                      <td>Ward 2's Roll No.</td>
                      <td><input type="number" name="stu2_roll" required></td>
                  </tr>
                  <tr>
                      <td>Ward 3's Roll No.</td>
                      <td><input type="number" name="stu3_roll" required></td>
                  </tr>
                  <tr>
                      <td>Ward 4's Roll No.</td>
                      <td><input type="number" name="stu4_roll" required></td>
                  </tr>
                  <tr>
                      <td>Ward 5's Roll No.</td>
                      <td><input type="number" name="stu5_roll" required></td>
                  </tr>
                  <tr>
                      <td>Mobile Number</td>
                      <td><input type="text" name="mobno" pattern="[0-9]{10}"
                                 title="Invalid Mobile Number" required></td>
                  </tr>
                  <tr>
                      <td>E-Mail</td>
                      <td><input type="email" name="email" required></td>
                  </tr>
                  <tr>
                      <td></td>
                      <td><input type="submit" value="Submit">
                          <input type="reset" value="reset"></td>
                  </tr>
              </table>
              
          </form>
      </div>
      <%@include file="includes/footer.jsp" %>
    </div>
  </body>
</html>