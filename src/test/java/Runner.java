
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(glue = {"actions"},
                 plugin = {"pretty","io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm" },
                 features = {"src/test/resources/features"})
public class Runner extends AbstractTestNGCucumberTests {
}



