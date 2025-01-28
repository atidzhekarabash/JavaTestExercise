package uni.pu.fmi.model;

import java.util.*;

/**
 * 
 */
public class User {

    /**
     * Default constructor
     */
    public User() {
    }

    /**
     * 
     */
    private String name;



    private String username;

    /**
     * 
     */


    /**
     * 
     */
    private String email;

    /**
     * 
     */
    private String password;

    /**
     * 
     */


    /**
     * 
     */
    private Boolean isAdmin;

    /**
     * 
     */


    /**
     * 
     */
    private List<Topic> topic;

    /**
     * 
     */
    private List<Comment> comment;

    /**

    private Set<Comment> comments;

     private Set<Topic> topics;

     private Set<Topic> topics;

    private Set<Comment> comments;
     */


    public List<Topic> getTopic() {
        // TODO implement here
        return null;
    }

    public void setTopic(List<Topic> topic) {
        // TODO implement here
    }


    public List<Comment> getComment() {
        // TODO implement here
        return null;
    }


    public void setComment(List<Comment> comment) {
        // TODO implement here
    }

    public String getUsername(){return username;}

    public void setUsername(String username){this.username = username;}

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }




    public String getEmail() {
        return  email;
    }


    public void setEmail(String email) {
            this.email = email;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
           this.password = password;
    }





    public Boolean getAdmin() {
         return isAdmin;
    }


    public void setIsAdmin(Boolean isAdmin) {
         this.isAdmin = isAdmin;
    }

}