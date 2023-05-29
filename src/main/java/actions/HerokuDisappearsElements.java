package actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.*;

public class HerokuDisappearsElements {

    Integer initialElementsPresent ;

    @Then("count all the present elements")
    public void countPresentElements(){
        initialElementsPresent = $$x("//li/a").size();
        System.out.println("INITIAL ELEMENTS: "+ initialElementsPresent);
    }
    @And("refresh the page")
    public void refreshPage(){
        refresh();
    }
    @And("verify if any element disappears")
    public void verifyElementDisappearance(){
        Integer actualElementsPresent = $$x("//li/a").size();
        System.out.println("ACTUAL ELEMENTS: "+ actualElementsPresent);
        Assert.assertEquals(initialElementsPresent, actualElementsPresent,"Error - Not found all the elements in the site");
    }


}
