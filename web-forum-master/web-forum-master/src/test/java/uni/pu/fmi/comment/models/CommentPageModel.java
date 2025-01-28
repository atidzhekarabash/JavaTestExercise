package uni.pu.fmi.comment.models;

import uni.pu.fmi.model.Comment;
import uni.pu.fmi.topic.models.TopicPageModel;

public class CommentPageModel extends TopicPageModel {
    private String commentMessage;
    private Comment comment;

    public void setCommentMessage(String commentMessage) {
        this.commentMessage = commentMessage;
    }

    public String getCommentMessage() {
        return commentMessage;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }
}
