package actions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class HerokuLoginActions {

    @When("realize the login with the credentials")
    public void loginWithCredentials() {
        String username= "admin";
        String currentUrl = getWebDriver().getCurrentUrl();
        String[] url = currentUrl.split("//");
        String urlAux = url[1];
        url[1]=username+":"+username+"@"+urlAux;

        getWebDriver().navigate().to((String.join(url[0],url[1])));


    }
    @Then("the message {string} should be displayed")
    public void verifyTextIsPresent(String text){
        getWebDriver().getPageSource().contains(text);
        closeWebDriver();
    }
}
