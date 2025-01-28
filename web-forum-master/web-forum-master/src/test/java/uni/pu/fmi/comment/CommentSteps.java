package uni.pu.fmi.comment;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import uni.pu.fmi.DB;
import uni.pu.fmi.PicoModelContainer;
import uni.pu.fmi.comment.models.CommentPageModel;
import uni.pu.fmi.controller.CommentController;
import uni.pu.fmi.model.Comment;
import uni.pu.fmi.model.Topic;
import uni.pu.fmi.model.User;

public class CommentSteps {

    PicoModelContainer picoModelContainer;

    public CommentSteps(PicoModelContainer picoModelContainer) {
        this.picoModelContainer = picoModelContainer;
    }

    @Given("Отваряне на екрана с теми за коментиране")
    public void openPageWithTopicsComment() {
        picoModelContainer.setCommentPageModel(new CommentPageModel());
        picoModelContainer.getCommentPageModel().setUser(new User());
        DB.getTopics().add(new Topic());
    }

    @Given("Съществува поне 1 коментар")
    public void commentExists() {
        Comment comment = new Comment();
        picoModelContainer.getCommentPageModel().setComment(comment);
        DB.getComments().add(comment);
    }

    @Given("Натискане на бутона за изтриване на коментар")
    public void clickDeleteCommentButton() {
        CommentController commentController = new CommentController();
        String message = commentController.removeComment(picoModelContainer.getCommentPageModel().getUser(), picoModelContainer.getCommentPageModel().getComment());
        picoModelContainer.getCommentPageModel().setMessage(message);
    }






    @When("Избиране на определена тема за коментиране")
    public void selectFirstTopic() {
        picoModelContainer.getCommentPageModel().setSelectedTopic(DB.getTopics().get(0));
    }

    @When("Въвеждане на коментар:{string}")
    public void addComment(String comment) {
        this.picoModelContainer.getCommentPageModel().setCommentMessage(comment);
    }

    @When("Натискане на бутона за добавяне на коментар")
    public void clickAddCommentButton() {
        CommentController commentController = new CommentController();

        String message = commentController.addComment(picoModelContainer.getCommentPageModel().getUser(), picoModelContainer.getCommentPageModel().getCommentMessage());

        picoModelContainer.getCommentPageModel().setMessage(message);
    }
}
