package sp.model;

public class FeedbackInfo {
   private int id;
   private String name;
   private String email;
   private String feedback;
   private String fdate;
    // no argument constructor
    public FeedbackInfo() {
       id = 0;
       name = "";
       email = "";
       feedback = "";
       fdate= "";
    }

    // setters
    public void setId(int id) {
        this.id= id;
    }

    public void setName(String name) {
        this.name= name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFdate(String fdate) {
        this.fdate = fdate;
    }
    public void setFeedback(String feedback){
        this.feedback= feedback;
    }

    // getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFeedback() {
        return feedback;
    }
    public String getEmail(){
        return email;
    }
    public String getFdate() {
        return fdate;
    }
}
