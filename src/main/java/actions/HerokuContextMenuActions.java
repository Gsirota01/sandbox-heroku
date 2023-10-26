package actions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;


public class HerokuContextMenuActions {
    @When("right-clicking inside the box")
    public void doRightClickInTheBox() {
        Actions actions = new Actions(getWebDriver());
        actions.contextClick($(byId("hot-spot"))).perform();
    }

    @Then("verify that an alert appears")
    public void checkTheAlertAppear() {
        switchTo().alert().accept();
        closeWebDriver();
    }
}
