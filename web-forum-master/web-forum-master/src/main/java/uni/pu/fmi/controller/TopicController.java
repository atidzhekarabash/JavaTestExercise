package uni.pu.fmi.controller;

import uni.pu.fmi.DB;
import uni.pu.fmi.model.Topic;
import uni.pu.fmi.model.User;

public class TopicController {
    public String addTopic(User user, String title, String description) {
        boolean hasTitle = title != null && title.trim().length() > 0;
        boolean hasDescription = description != null && description.trim().length() > 0;

        if (!hasTitle && !hasDescription) {
            return "Моля въведете тема!";
        }

        if (!hasTitle) {
            return "Моля въведете заглавие!";
        }

        if (!hasDescription) {
            return "Моля въведете описание!";
        }

        Topic topic = new Topic();
        topic.setTopicTitle(title);
        topic.setTopicDetail(description);
        topic.setUser(user);
        DB.getTopics().add(topic);

        return "Успешна добавена тема!";
    }

    public String removeTopic(User user, Topic topic) {

        if (!user.getAdmin()) {
            return "Само админ може да изтрие тема!";
        }

        if (!DB.getTopics().contains(topic)) {
            return "Темата не съществува!";
        }

        DB.getTopics().remove(topic);

        return "Успешна изтрита тема!";
    }
}
