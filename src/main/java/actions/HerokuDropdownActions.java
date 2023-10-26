package actions;

import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Selenide.$;


public class HerokuDropdownActions {


    @Then("select the {string}")
    public void checkBothCheckbox(String option){
        $("#dropdown").selectOption(option);
    }

}
