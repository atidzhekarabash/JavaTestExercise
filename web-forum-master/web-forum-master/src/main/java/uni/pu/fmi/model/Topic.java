package uni.pu.fmi.model;

import java.util.*;

/**
 * 
 */
public class Topic {

    /**
     * Default constructor
     */
    public Topic() {
    }

    /**
     * 
     */
    private String topicTitle;

    /**
     * 
     */
    private String topicDetail;

    /**
     * 
     */


    /**
     * 
     */
    private User user;

    private Topic topic = null;

    private Set<Topic> subTopics;

    /**
    private User users;








    private Set<Comment> comments;

    private User users;

    private Set<Comment> comments;
     */



    public String getTopicTitle() {
         return topicTitle;
    }


    public void setTopicTitle(String topicTitle) {
        this.topicTitle = topicTitle;
    }


    public String getTopicDetail() {
        return topicDetail;
    }


    public void setTopicDetail(String topicDetail) {
         this.topicDetail = topicDetail;
    }





    public User getUser() {
        // TODO implement here
        return null;
    }


    public void setUser(User user) {
        // TODO implement here
    }

    public Set<Topic> getSubTopics() {
        return subTopics;
    }

    public Topic getTopic() {
        return topic;
    }

    public boolean isSubTopic() {
        return null != getTopic();
    }

}