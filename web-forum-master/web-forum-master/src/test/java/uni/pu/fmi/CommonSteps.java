package uni.pu.fmi;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import uni.pu.fmi.model.User;

public class CommonSteps {

    PicoModelContainer picoModelContainer;

    public CommonSteps(PicoModelContainer picoModelContainer) {
        this.picoModelContainer = picoModelContainer;
    }

    @Given("Потребителя е админ")
    public void userIsAdmin() {
        User user = new User();
        user.setIsAdmin(true);

        picoModelContainer.getActivePageModel().setUser(user);
    }

    @Given("Потребителя не е админ")
    public void userIsNotAdmin() {
        User user = new User();
        user.setIsAdmin(false);

        picoModelContainer.getActivePageModel().setUser(user);
    }

    @Then("Виждаме съобщение: {string}")
    public void viewMessage(String expectedMessage) {
        Assert.assertEquals(expectedMessage, picoModelContainer.getActivePageModel().getMessage());
    }
}
