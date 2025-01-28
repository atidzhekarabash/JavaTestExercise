package uni.pu.fmi;

import uni.pu.fmi.comment.models.CommentPageModel;
import uni.pu.fmi.topic.models.TopicPageModel;

public class PicoModelContainer {
    private TopicPageModel topicPageModel;
    private CommentPageModel commentPageModel;

    public void setTopicPageModel(TopicPageModel topicPageModel) {
        this.topicPageModel = topicPageModel;
    }

    public TopicPageModel getTopicPageModel() {
        return topicPageModel;
    }

    public CommentPageModel getCommentPageModel() {
        return commentPageModel;
    }

    public void setCommentPageModel(CommentPageModel commentPageModel) {
        this.commentPageModel = commentPageModel;
    }

    public TopicPageModel getActivePageModel() {
        if (commentPageModel != null) {
            return commentPageModel;
        }


        return topicPageModel;
    }
}
