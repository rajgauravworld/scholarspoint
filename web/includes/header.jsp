<img src="images/attendance.png"/>
<h2>Attendance Viewer</h2>
<h5>So that you can be updated... on time</h5>	 
<div class="logout">
<% if(session.getAttribute("session_user")!=null){
     out.println("<a href='includes/log_out.jsp'>LOG OUT</a>");   
 } %>
</div>