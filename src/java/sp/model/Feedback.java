/*
 * Model class for feedback relation
 * @author rajgaurav
 */
package sp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Feedback {
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
   public ArrayList fetchAllFeedback(){
    try{
        Connection con;
        con = createConnection();
        PreparedStatement ps=con.prepareStatement("select * from feedback order by fdate desc");
        ResultSet rs=ps.executeQuery();       
        //testing code for using ArrayList
     ArrayList feedList = new ArrayList();
    // id, name, email, feedback, fdate
     int id;
     String name,email,feedback,fdate;
     while(rs.next()){
         id=rs.getInt("id");
         name=rs.getString("name");
         email=rs.getString("email");
         feedback=rs.getString("feedback");
         fdate=rs.getString("fdate");
         FeedbackInfo feed = new FeedbackInfo();
            feed.setId(id);
            feed.setName(name);
            feed.setEmail(email);
            feed.setFeedback(feedback);
            feed.setFdate(fdate);
  
            // adding a bean to arraylist
            feedList.add(feed);
     }
     return feedList;
     
  // testing code ends here      
        
        
      //  ps.close();
       // con.close();
    }catch(Exception ex){
      System.out.println("Feedback.fetchAllFeedback() Exception : " + ex);
      return null;
    }
  }

}
