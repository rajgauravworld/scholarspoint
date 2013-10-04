/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author rajgaurav
 */
public class Feedback {
  public void storeFeedback(String name,String email,String feedback){
     try{
        Connection con;
        con = createConnection();
        PreparedStatement ps=con.prepareStatement("insert into feedback"
                + "(name,email,feedback) values(?,?,?)");
        ps.setString(1, name);
        ps.setString(2, email);
        ps.setString(3, feedback);
        ps.executeUpdate();//result contains the number of row affected
        ps.close();
        con.close();
        }
        catch(Exception ex){
        System.out.println("Feedback.storeFeedback() Exception :" + ex);
        }
  }
  private Connection createConnection(){//returns the Connection object
try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/scholarspoint","root","1234");
    System.out.println("Feedback.createConnection() : Connection object for Scholars point created !");
    return con;
}catch(Exception ex){
    System.out.println("Feedback.createConnection() : Exception " + ex);
    return null;
  }
  }
}
