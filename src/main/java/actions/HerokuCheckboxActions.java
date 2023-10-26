package actions;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.*;

public class HerokuCheckboxActions {


    @When("both checkboxes are selected")
    public void checkBothCheckbox(){
        ElementsCollection checkboxes = $$x("//input[@type='checkbox']");

        for(SelenideElement checkbox : checkboxes){
            if(checkbox.attr("checked") == null){
                checkbox.click();
            }
        }

    }
    @Then("verify the status of the checkboxes")
    public void checkStatusOfCheckbox(){
        ElementsCollection checkboxes = $$x("//input[@type='checkbox']");

        for(SelenideElement checkbox : checkboxes){
            checkbox.attr("checked").equals("true");
        }

        closeWebDriver();
    }

}
