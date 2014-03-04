
package sp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Registration {
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
    public boolean storeLoginDetails(String uname,String pass,String role,String sq,String sqa){
    try{
        Connection con;
        con = createConnection();
        PreparedStatement ps=con.prepareStatement("insert into login_details"
                + "(uname, pass, role, sq, sqa) values(?,?,?,?,?)");
        ps.setString(1, uname);
        ps.setString(2, pass);
        ps.setString(3, role);
        ps.setString(4,sq);
        ps.setString(5, sqa);
        ps.executeUpdate();//result contains the number of rows affected
        ps.close();
        con.close();
        return true;
        }
        catch(Exception ex){
        System.out.println("Registration.storeLoginDetails() Exception :" + ex);
        return false;
        }
    } 
    public boolean storeStudentDetails(String uname,String name,String fname,String mname,String mobno,String branch,int year,String email,int rollno){
    try{
        Connection con;
        con = createConnection();
        PreparedStatement ps=con.prepareStatement("insert into student_details"
        + "(uname, name, fname, mname, branch, year, mobno, email, rollno) values(?,?,?,? ,?,?,?,?, ?)");
        //uname, name, fname, mname,     branch, year, mobno, email,     rollno
        ps.setString(1, uname);
        ps.setString(2, name);
        ps.setString(3, fname);
        ps.setString(4, mname);
        ps.setString(5, branch);
        ps.setInt(6, year);
        ps.setString(7, mobno);
        ps.setString(8, email);
        ps.setInt(9, rollno);
        ps.executeUpdate();//result contains the number of rows affected
        System.out.println("Registration.storeStudentDetails() Query updated !");
        ps.close();
        con.close();
        return true;
        }
        catch(Exception ex){
        System.out.println("Registration.storeStudentDetails() Exception :" + ex);
        return false;
        }
    }
    public void storeStaffDetails(String uname, String name, String branch,int  year,String  mobno,String email){
    try{
        Connection con;
        con = createConnection();
        PreparedStatement ps=con.prepareStatement("insert into staff_details"
        + "(uname, name, branch, year, mobno, email) values(?,?,?,? ,?,?)");
        //uname, name, fname, mname,     branch, year, mobno, email,     rollno
        ps.setString(1, uname);
        ps.setString(2, name);
        ps.setString(3, branch);
        ps.setInt(4, year);
        ps.setString(5, mobno);
        ps.setString(6, email);
        ps.executeUpdate();//result contains the number of rows affected
        System.out.println("Registration.storeStaffDetails() Query updated !");
        ps.close();
        con.close();
        }
        catch(Exception ex){
        System.out.println("Registration.storeStaffDetails() Exception :" + ex);
        }
    }
    public void storeParentDetails(String uname,String name,int stu1_roll,int stu2_roll,int stu3_roll,int stu4_roll,int stu5_roll,String mobno,String email){
        try{
        Connection con;
        con = createConnection();
        PreparedStatement ps=con.prepareStatement("insert into parent_details"
        + "(uname, stu1_roll, stu2_roll, stu3_roll, stu4_roll, stu5_roll, mobno, email,name) values(?,?,?,? ,?,?,?,?,?)");
        //uname, stu1_roll, stu2_roll, stu3_roll, stu4_roll, stu5_roll, mobno, email
        ps.setString(1, uname);
        ps.setInt(2, stu1_roll);
        ps.setInt(3, stu2_roll);
        ps.setInt(4, stu3_roll);
        ps.setInt(5, stu4_roll);
        ps.setInt(6, stu5_roll);
        ps.setString(7, mobno);
        ps.setString(8, email);
        ps.setString(9, name);
        ps.executeUpdate();//result contains the number of rows affected
        System.out.println("Registration.storeParentDetails() Query updated !");
        ps.close();
        con.close();
        }
        catch(Exception ex){
        System.out.println("Registration.storeParentDetails() Exception :" + ex);
        }
}
    public void storeFacultyDetails(String uname,String name,String mobno,String email){
       try{
        Connection con;
        con = createConnection();
        PreparedStatement ps=con.prepareStatement("insert into faculty_details"
        + "(uname, name, mobno, email) values(?,?,?,?)");
        //uname, stu1_roll, stu2_roll, stu3_roll, stu4_roll, stu5_roll, mobno, email
        ps.setString(1, uname);
        ps.setString(2, name);
        ps.setString(3, mobno);
        ps.setString(4, email);
        ps.executeUpdate();//result contains the number of rows affected
        System.out.println("Registration.storeFacultyDetails() Query updated !");
        ps.close();
        con.close();
        }
        catch(Exception ex){
        System.out.println("Registration.storeFacultyDetails() Exception :" + ex);
        }
    }
    public void storeCoordinatorDetails(String uname, String branch,int year,String mobno,String email,String name){
    try{
        Connection con;
        con = createConnection();
        PreparedStatement ps=con.prepareStatement("insert into coordinator_details"
        + "(uname, branch, year, mobno, email, name) values(?,?,?,? ,?,?)");
        //uname, name, fname, mname,     branch, year, mobno, email,     rollno
        ps.setString(1, uname);
        ps.setString(2, branch);
        ps.setInt(3, year);
        ps.setString(4, mobno);
        ps.setString(5, email);
        ps.setString(6, name);
        ps.executeUpdate();//result contains the number of rows affected
        System.out.println("Registration.storeCoordinatorDetails() Query updated !");
        ps.close();
        con.close();
        }
        catch(Exception ex){
        System.out.println("Registration.storeCoordinatorDetails() Exception :" + ex);
        }
    }
    public void storeHODDetails(String uname,String name,String branch,String mobno,String email){
     try{
        Connection con;
        con = createConnection();
        PreparedStatement ps=con.prepareStatement("insert into hod_details"
        + "(uname, name, branch, mobno, email) values(?,?,?,? ,?)");
        //uname, name, fname, mname,     branch, year, mobno, email,     rollno
        ps.setString(1, uname);
        ps.setString(2, name);
        ps.setString(3, branch);
        ps.setString(4, mobno);
        ps.setString(5, email);
        ps.executeUpdate();//result contains the number of rows affected
        System.out.println("Registration.storeHODDetails() Query updated !");
        ps.close();
        con.close();
        }
        catch(Exception ex){
        System.out.println("Registration.storeHODDetails() Exception :" + ex);
        } 
    
    } 
    public void storeDirectorDetails(String uname,String name,String mobno,String email){
     try{
        Connection con;
        con = createConnection();
        PreparedStatement ps=con.prepareStatement("insert into director_details"
        + "(uname, name, mobno, email) values(?,?,?,?)");
        //uname, name, mobno, email
        ps.setString(1, uname);
        ps.setString(2, name);
        ps.setString(3, mobno);
        ps.setString(4, email);
        ps.executeUpdate();//result contains the number of rows affected
        System.out.println("Registration.storeDirectorDetails() Query updated !");
        ps.close();
        con.close();
        }
        catch(Exception ex){
        System.out.println("Registration.storeDirectorDetails() Exception :" + ex);
        } 
    }
}
