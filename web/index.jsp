<%-- 
    Document   : index
    Created on : Sep 28, 2013, 9:59:47 PM
    Author     : rajgaurav
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Home | Scholar's Point</title>
      <link rel="icon" type="image/png" href="images/iconsp_1.png">
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <link href="css/style.css" rel="stylesheet" />
  </head>
  <body>
    <div id="wrapper">
      <%@include file="includes/header.jsp" %>
      <div id="content">
        <div id="left_content">
          <img src="images/home-image.png">
          <P>
            &nbsp;&nbsp;&nbsp;&nbsp;<b>This Web application aims to provide
            the information that
            is needed in college days. We are including more and more
            services to make it useful for every student.Raj </b>
          </P>
        </div>
        <div id="right_content">
          <%@include file="includes/login_form.jsp" %>
        </div>
      </div>
      <%@include file="includes/footer.jsp" %>
    </div>
  </body>
</html>