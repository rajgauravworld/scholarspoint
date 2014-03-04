
package sp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sp.model.Registration;

public class ProcessRegistration extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("processRegistration has been Called !");
        response.setContentType("text/html;charset=UTF-8");
        String uname=request.getParameter("uname");
        String pass=request.getParameter("pass");
        String role=request.getParameter("role");
        String sq=request.getParameter("sq");
        String sqa=request.getParameter("sqa");
   
        
        String name=request.getParameter("name");
        String mobno=request.getParameter("mobno");
        String email=request.getParameter("email");
        Registration reg=new Registration();
       
        reg.storeLoginDetails(uname,pass,role,sq,sqa);
        System.out.print("storeLoginDetails() Completed !");
        
        if(role.equals("student")){
            String branch=request.getParameter("branch");
            int year=Integer.parseInt(request.getParameter("year"));
            int rollno=Integer.parseInt(request.getParameter("rno"));
            String fname=request.getParameter("fname");
            String mname=request.getParameter("mname");
            reg.storeStudentDetails(uname, name, fname, mname, mobno, branch, year, email, rollno);
            System.out.println(" storeStudentDetails() Comleted !");
        }
        else if(role.equals("staff")){
            String branch=request.getParameter("branch");
            int year=Integer.parseInt(request.getParameter("year"));
            System.out.println("storeStudentDetails Started !");
            reg.storeStaffDetails(uname, name, branch, year, mobno, email);
            System.out.println(" storeStaffDetails() completed !");
        }
        else if(role.equals("parent")){
            System.out.println("storeParentDetails Started !");
            int stu1_roll=Integer.parseInt(request.getParameter("stu1_roll"));
            int stu2_roll=Integer.parseInt(request.getParameter("stu2_roll"));
            int stu3_roll=Integer.parseInt(request.getParameter("stu3_roll"));
            int stu4_roll=Integer.parseInt(request.getParameter("stu4_roll"));
            int stu5_roll=Integer.parseInt(request.getParameter("stu5_roll"));
            System.out.println(" storeParentDetails() got the parameters !");
            reg.storeParentDetails(uname, name,stu1_roll, stu2_roll, stu3_roll, stu4_roll, stu5_roll, mobno, email);
            System.out.println(" storeParentDetails() completed !");
        }
        
        else if(role.equals("faculty")){
            //uname, name, mobno, email
            System.out.println("storeFacultyDetails started ! ");
            reg.storeFacultyDetails(uname, name, mobno, email);
            System.out.println("storeFacultyDetails Completed ! ");
        } 
        else if(role.equals("coordinator")){
        //uname, branch, year, mobno, email, name
            String branch=request.getParameter("branch");
            int year=Integer.parseInt(request.getParameter("year"));
            System.out.println("storeCoordinatorDetails started ! ");
            reg.storeCoordinatorDetails(uname, branch, year, mobno, email, name);
            System.out.println("storeCoordinatorDetails Completed ! ");
        } 
        else if(role.equals("headofdepartment")){
        //uname, name, branch, mobno, email
            String branch=request.getParameter("branch");
            System.out.println("storeHODDetails started ! ");
            reg.storeHODDetails(uname, name, branch, mobno, email);
            System.out.println("storeHODDetails Completed ! ");    
            
        }
        else if(role.equals("director")){
            //uname, name, mobno, email
            System.out.println("storeDirectorDetails started ! ");
            reg.storeDirectorDetails(uname, name, mobno, email);
            System.out.println("storeDirectorDetails Completed ! ");         
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
        return "This is for processing registration requests";
    }// </editor-fold>

}
