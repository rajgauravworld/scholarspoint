/*
 * This servlet receives the feedback from client and then process that
 * feedback . 
 */
package sp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sp.model.Feedback;

public class ProcessFeedback extends HttpServlet {

  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    try {
     Feedback f=new Feedback();
     String formAction=request.getParameter("formAction");
     if(formAction.equals("save")){
        String name=request.getParameter("uname");
        String email=request.getParameter("email");
        String feedback=request.getParameter("feedback");
        System.out.println("storeFeedback() Started !");

        f.storeFeedback(name,email,feedback);
        System.out.println("storeFeedback() Comleted !");

        HttpSession session=request.getSession();
        session.setAttribute("feedbackmsg", "<font color='green'>Feedback submitted successfully !</font>");
        response.sendRedirect("feedback.jsp");
     }
     if(formAction.equals("display")){
       //ResultSet rs=f.fetchAllFeedback();
            System.out.println("Feedback has got the display Command !");
            ArrayList feedList = f.fetchAllFeedback();
            request.setAttribute("feedList", feedList);                 
            // forwarding request to viewFeedback, so it can render feedList
            RequestDispatcher rd =request.getRequestDispatcher("viewFeedback.jsp");
            rd.forward(request, response);
     }
    } finally {      
      out.close();
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
    return "Short description";
  }// </editor-fold>
}
