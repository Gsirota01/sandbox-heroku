package actions;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;

import static com.codeborne.selenide.Selenide.*;

public class HerokuElementsActions {

    @When("a new element is added")
    public void addANewElement() {
        $x("//button[text()='Add Element']").click();
    }

    @Then("verify that the new element is present")
    public void checkIfTheNewElementIsPresent() {
        $x("//button[@class='added-manually']")
                .shouldBe(Condition.visible);
    }

    @And("remove the added element")
    public void removeTheElement() {
        $x("//button[@class='added-manually']").click();
    }

    @Then("verify that the element disappears")
    public void checkIfTheElementDisappear() {
        $x("//button[@class='added-manually']")
                .shouldBe(Condition.disappear);
        closeWebDriver();
    }

    @Then("check broken images")
    public void brokenImages() {
        ArrayList<String> urlImages = new ArrayList<>();
        Integer brokenImagesCounter = 0;

        ElementsCollection images = $$x("//div[@id='content']//img");

        for (SelenideElement img : images) {
            String urlImage = img.attr("currentSrc");
            urlImages.add(urlImage);
        }

        for (String url : urlImages) {
            if (!checkUrlImage(url)) {
                brokenImagesCounter++;
            }
        }


        String message = brokenImagesCounter == 1 ? "There is 1 broken link." : "There are " + brokenImagesCounter + " broken links.";
        System.out.println(message);
    }

    private boolean checkUrlImage(String url)  {
        open(url);

        $x("//html").isDisplayed();
        ElementsCollection imageElements = $$x(("//img"));

        if (!imageElements.isEmpty() && imageElements.get(0).isDisplayed()) {
            return true;
        } else {
            return false;
        }

    }
}
