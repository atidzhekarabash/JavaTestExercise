package uni.pu.fmi.topic.models;

import uni.pu.fmi.CommonPageModel;
import uni.pu.fmi.model.Topic;
import uni.pu.fmi.model.User;

import java.util.ArrayList;
import java.util.List;

public class TopicPageModel extends CommonPageModel {

    public final String DELETE_ACTION = "delete";
    private String title;
    private String description;

    private User user;

    private Topic selectedTopic;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String detail) {
        this.description = detail;
    }

    public void setSelectedTopic(Topic topic) {
        selectedTopic = topic;
    }

    public Topic getSelectedTopic() {
        return selectedTopic;
    }


    public List<String> getActions(User user)
    {
        List<String> actions = new ArrayList<>();

        if (user.getAdmin()) {
            actions.add(DELETE_ACTION);
        }

        return actions;
    }




    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
