/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sp.bean.FeedbackFacadeLocal;
import sp.model.Feedback;

/**
 *
 * @author rajgaurav
 */
public class ProcessFeedback extends HttpServlet {
  @EJB
  private FeedbackFacadeLocal feedbackFacade;
  
  protected void processRequest(HttpServletRequest request, 
          HttpServletResponse response)
          throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    try {
      Feedback f=new Feedback();
      String uname=request.getParameter("uname");
      String email=request.getParameter("email");
      String feedback=request.getParameter("feedback");
      f.setName(uname);
      f.setEmail(email);
      f.setFeedback(feedback);
      out.println("name " + uname +"\n email " + email +"\n feedback"+
              feedback +"\n");
      feedbackFacade.create(f);
      out.println("Feedback submitted successfully !");
    } 
    catch(Exception ex){
      out.println("Exception " + ex);
    }finally {      
      out.close();
    }
  }

  // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
  /**
   * Handles the HTTP
   * <code>GET</code> method.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    processRequest(request, response);
  }

  /**
   * Handles the HTTP
   * <code>POST</code> method.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    processRequest(request, response);
  }

  /**
   * Returns a short description of the servlet.
   *
   * @return a String containing servlet description
   */
  @Override
  public String getServletInfo() {
    return "Short description";
  }// </editor-fold>
}
