/*
 * This servlet receives the feedback from client and then process that
 * feedback . 
 */
package sp.controller;

import java.io.IOException;
import java.io.PrintWriter;
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
     String name=request.getParameter("uname");
     String email=request.getParameter("email");
     String feedback=request.getParameter("feedback");
     Feedback f=new Feedback();
     f.storeFeedback(name,email,feedback);
     HttpSession session=request.getSession();
     session.setAttribute("feedbackmsg", "Feedback submitted successfully !");
     response.sendRedirect("feedback.jsp");
     /*out.println("Feedback stored successfully !");*/
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
