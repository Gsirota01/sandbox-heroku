package actions;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.*;

public class HerokuHomeActions {

    @BeforeAll
    public static void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments( "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors","--disable-extensions","--no-sandbox","--disable-dev-shm-usage","--headless");
        Configuration.browserCapabilities.setCapability(ChromeOptions.CAPABILITY, options);
    }
    @Given("that the Heroku App site is open")
    public void visitHerokuSite() {
        open("https://the-internet.herokuapp.com/");
    }

    @And("access the {string} test")
    public void navigateToTest(String nameTest){
        $x("//a[text()='"+nameTest+"']").click();
    }

    @Then("I drag square A and drop it onto square B")
    public void dragAndDrop(){
        SelenideElement headerColumnA = $x("//div[@id='column-a']/header");
        SelenideElement headerColumnB = $x("//div[@id='column-b']/header");
        SelenideElement squareColumnA = $x("(//div[@id='columns']/div)[1]");
        SelenideElement squareColumnB = $x("(//div[@id='columns']/div)[2]");


        Assert.assertEquals(headerColumnA.getText(),"A");
        Assert.assertEquals(headerColumnB.getText(),"B");
        squareColumnA.dragAndDropTo(squareColumnB);
        Assert.assertEquals(headerColumnA.getText(),"B");
        Assert.assertEquals(headerColumnB.getText(),"A");

    }

}
