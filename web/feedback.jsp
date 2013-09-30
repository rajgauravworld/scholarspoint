<%-- 
    Document   : feedback
    Created on : Sep 28, 2013, 10:29:00 PM
    Author     : rajgaurav
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title></title>
      <link rel="icon" type="image/png" href="images/iconsp_1.png">
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <link href="css/style.css" rel="stylesheet" />
      <link href="css/feedback.css" rel="stylesheet" />
  </head>
  <body>
    <div id="wrapper">
      <%@include file="includes/header.jsp" %>
      <div id="content">
        <div id="feedbackform">
         <h1>Feedback Form</h1>
         <form name="feedback_form" method="post" action="ProcessFeedback">
          <table>
            <tr>
              <td>Name</td>
              <td>
                <input type="text" name="uname" class="text" placeholder="Name">
              </td>
            </tr>
            <tr>
              <td>Email ID</td>
              <td>
                <input type="text" name="email" class="text" placeholder="Email">
              </td>
            </tr>
            <tr>
              <td>Feedback</td>
              <td>
                <textarea cols="35" rows="5" name="feedback">
                </textarea>
              </td>
            </tr>
            <tr>
              <td></td>
              <td>
                <input type="submit" value="submit"/>
                <input type="reset" value="Reset"/>
              </td>
            </tr>
          </table>
        </form>
         </div>
      </div>
      <%@include file="includes/footer.jsp" %>
    </div>
  </body>
</html>