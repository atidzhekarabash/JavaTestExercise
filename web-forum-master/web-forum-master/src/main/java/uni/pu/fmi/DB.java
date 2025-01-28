package uni.pu.fmi;

import uni.pu.fmi.model.Comment;
import uni.pu.fmi.model.Topic;
import uni.pu.fmi.model.User;

import java.util.ArrayList;
import java.util.List;

public class DB {
    private static final List<Topic> topics = new ArrayList<>();
    private static final List<User> users = new ArrayList<>();
    private static final List<Comment> comments = new ArrayList<>();

    public DB() {
    }

    public static List<User> getUsers() {
        return users;
    }

    public static List<Topic> getTopics() {
        return topics;
    }

    public static List<Comment> getComments() {
        return comments;
    }
}