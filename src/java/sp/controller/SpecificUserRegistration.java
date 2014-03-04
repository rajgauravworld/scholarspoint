package sp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SpecificUserRegistration extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     response.setContentType("text/html;charset=UTF-8");
     PrintWriter out = response.getWriter();
     String uname=request.getParameter("uname");
     String pass=request.getParameter("pass");
     String cpass=request.getParameter("cpass");
     /*if(pass.equals(cpass)){
         out.println("<p class='warning'>Password and Re entered password are not same !</p>");
         RequestDispatcher rd=request.getRequestDispatcher("user_registration.jsp");
         rd.include(request, response);
     }*/
     String role=request.getParameter("role");
     String sq=request.getParameter("sq");
     String sqa=request.getParameter("sqa");
     HttpSession session=request.getSession();
     session.setAttribute("uname", uname);
     session.setAttribute("pass", pass);
     session.setAttribute("role", role);
     session.setAttribute("sq", sq);
     session.setAttribute("sqa", sqa);
    /* out.println("<h61>user name :</h6>" + uname +"<br>"+
     "<h61>Password :</h6>" + pass +"<br>"+
     "<h61>confirm password :</h6>" + cpass +"<br>"+
     "<h61>role :</h6>" + role +"<br>"+
     "<h61>Security Question :</h6>" + sq +"<br>"+
     "<h61>Your answer :</h6>" + sqa +"<br>"
     );*/
     if(role.equals("student")){
         response.sendRedirect("student_registration.jsp");
     }
     if(role.equals("staff")){
         response.sendRedirect("staff_registration.jsp");
     }
     if(role.equals("parent")){
         response.sendRedirect("parent_registration.jsp");
     }
     if(role.equals("faculty")){
         response.sendRedirect("faculty_registration.jsp");
     }
     if(role.equals("coordinator")){
         response.sendRedirect("coordinator_registration.jsp");
     }
     if(role.equals("headofdepartment")){
         response.sendRedirect("headofdepartment_registration.jsp");
     }
     if(role.equals("director")){
         response.sendRedirect("director_registration.jsp");
     }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    public String getServletInfo() {
        return "Short description : Redirects user to user specific registraton page";
    }// </editor-fold>

}
