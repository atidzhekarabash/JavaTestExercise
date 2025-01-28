package uni.pu.fmi.topic;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import uni.pu.fmi.DB;
import uni.pu.fmi.PicoModelContainer;
import uni.pu.fmi.controller.TopicController;
import uni.pu.fmi.model.Topic;
import uni.pu.fmi.model.User;
import uni.pu.fmi.topic.models.TopicPageModel;

import java.util.List;

public class TopicSteps {

    private PicoModelContainer picoModelContainer;

    public TopicSteps(PicoModelContainer picoModelContainer) {
        this.picoModelContainer = picoModelContainer;
    }

    TopicPageModel pageModel;

    @Given("Отваряне на екрана за добавяне на теми")
    public void openAddTopicPage() {
        picoModelContainer.setTopicPageModel(new TopicPageModel());
        picoModelContainer.getTopicPageModel().setUser(new User());
    }

    @When("Въвеждане на заглавие:{string}")
    public void addTitle(String title) {
        picoModelContainer.getTopicPageModel().setTitle(title);

    }
    @When("Въвеждане на описание:{string}")
    public void addDescription(String description) {
        picoModelContainer.getTopicPageModel().setDescription(description);
    }

    @When("Натискане на бутона за добавяне")
    public void clickAddButton() {
        //controller
        TopicController controller = new TopicController();
        String message = controller.addTopic(
                picoModelContainer.getTopicPageModel().getUser(),
                picoModelContainer.getTopicPageModel().getTitle(),
                picoModelContainer.getTopicPageModel().
                        getDescription()
        );
        picoModelContainer.getTopicPageModel().setMessage(message);
    }












    @Given("Отваряне на екрана с всички теми")
    public void openDeleteTopicPage() {
        picoModelContainer.setTopicPageModel(new TopicPageModel());
        DB.getTopics().add(new Topic());
    }
    @Given("Съществува поне {int} тема")
    public void atLeastOneTopicExists(Integer topicSize) {
        Assert.assertTrue(DB.getTopics().size() >= topicSize);
    }


    @When("Избиране на определена тема")
    public void selectFirstTopic() {
        picoModelContainer.getActivePageModel().setSelectedTopic(DB.getTopics().get(0));
    }


    @When("Бутона за изтриване се вижда")
    public void deleteButtonIsVisible() {
        List<String> actions = picoModelContainer.getTopicPageModel().getActions(picoModelContainer.getTopicPageModel().getUser());

        Assert.assertTrue(actions.contains(picoModelContainer.getTopicPageModel().DELETE_ACTION));
    }

    @When("Натискане на бутона за изтриване")
    public void clickDeleteButton() {
        TopicController topicController = new TopicController();

        String message = topicController.removeTopic(picoModelContainer.getTopicPageModel().getUser(), picoModelContainer.getTopicPageModel().getSelectedTopic());

        picoModelContainer.getTopicPageModel().setMessage(message);
    }







    @Then("Бутона за изтриване не се вижда")
    public void deleteButtonIsNotVisible() {
        List<String> actions = picoModelContainer.getTopicPageModel().getActions(picoModelContainer.getTopicPageModel().getUser());

        Assert.assertFalse(actions.contains(picoModelContainer.getTopicPageModel().DELETE_ACTION));
    }


    @When("Всички теми се изтриват")
    public void deleteAllTopics() {
        DB.getTopics().clear();
    }

    @When("Потребителя вече не е админ")
    public void userNoLongerAdmin() {
        picoModelContainer.getTopicPageModel().getUser().setIsAdmin(false);
    }
}
