import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(monochrome = true, format = { "pretty", "html:target/cucumber", "json:target/cucumber.json" },
        tags = {"@hmp"},features = "src/test/resources/feature")
public class RunCukesTest extends AbstractTestNGCucumberTests {

}

//@RunWith(Cucumber.class)
//@CucumberOptions(format={"pretty","json:target/"} , features="/src/test/java/cucumber/features")
//public class Launcher {
//
//}