<%-- 
    Document   : log_out
    Created on : Jun 28, 2013, 1:54:46 PM
    Author     : rajgaurav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Log Out</title>
    </head>
    <body>
        <%
         session.setAttribute("session_user",null);
         session.setAttribute("user_type",null);
         session.invalidate();
         response.sendRedirect("../index.jsp");
        %>
    </body>
</html>
