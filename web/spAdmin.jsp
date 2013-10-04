<%-- 
    Document   : index
    Created on : Sep 28, 2013, 9:59:47 PM
    Author     : rajgaurav
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>ADMIN | Scholar's Point</title>
      <link rel="icon" type="image/png" href="images/iconsp_1.png">
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <link href="css/style.css" rel="stylesheet" />
      <link href="css/admin.css" rel="stylesheet" />
  </head>
  <body>
    <div id="wrapper">
      <%@include file="includes/header.jsp" %>
      <div id="content">
        <div id="leftcontent">
          <p><a href="viewFeedback.jsp">View Feedbacks</a></p>
        </div>
        <div id="middlecontent"></div>
        <div id="rightcontent"></div>
      </div>
      <%@include file="includes/footer.jsp" %>
    </div>
  </body>
</html>