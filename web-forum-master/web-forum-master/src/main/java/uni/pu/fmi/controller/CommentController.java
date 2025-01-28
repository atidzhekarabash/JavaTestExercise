package uni.pu.fmi.controller;

import uni.pu.fmi.DB;
import uni.pu.fmi.model.Comment;
import uni.pu.fmi.model.User;

public class CommentController {
    public String addComment(User user, String comment) {
        boolean hasComment = comment != null && comment.trim().length() > 0;

        if (!hasComment) {
            return "Моля въведете коментар!";
        }


        return "Успешно добавен коментар!";
    }

    public String removeComment(User user, Comment comment) {
        if (!user.getAdmin()) {
            return "Само админ може да изтрие тема!";
        }


        DB.getComments().remove(comment);

        return "Успешно изтрит коментар!";
    }
}
