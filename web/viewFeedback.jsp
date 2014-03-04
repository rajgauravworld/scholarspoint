<%-- 
    Document   : index
    Created on : Sep 28, 2013, 9:59:47 PM
    Author     : rajgaurav
--%>
<%@page import="sp.model.FeedbackInfo"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>ADMIN | Scholar's Point</title>
    <link rel="icon" type="image/png" href="images/iconsp_1.png">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="css/style.css" rel="stylesheet" />
    <link href="css/admin.css" rel="stylesheet" />
    <link href="css/feedback.css" rel="stylesheet" />
  </head>
  <body>
    <div id="wrapper">
      <%@include file="includes/header.jsp" %>
      <div id="content">
        <%@include file="includes/adminLeftMenu.jsp" %>
        <div id="middlecontent">
            <h2>Feedbacks About Scholar's Point</h2><hr>
            <%
                // retrieving ArrayList stored on controller
                ArrayList feedList = (ArrayList) request.getAttribute("feedList");
                FeedbackInfo feed = null;
                // Showing all matching records by iterating over ArrayList
                for (int i = 0; i < feedList.size(); i++) {
                  feed = (FeedbackInfo) feedList.get(i);
            %>
            <div class="feedmsg"> 
                <input type="hidden" name="id" value="<%= feed.getId()%>">
                <p><b>Name</b> : <%= feed.getName() %>     </p>
                <p><b>Email </b>:<%= feed.getEmail()%>          </p>
                <p><b>Feedback </b>:<%= feed.getFeedback() %> </p>
                <p><b>Feedback Date/</b> : <%= feed.getFdate()%>     </p>
            </div>
            <%
                  }
            %>
        </div>
        <div id="rightcontent">
            
        </div>
      </div>
      <%@include file="includes/footer.jsp" %>
    </div>
  </body>
</html>