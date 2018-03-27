

import cucumber.api.CucumberOptions;
import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

//@CucumberOptions(monochrome = true, format = { "pretty", "html:target/cucumber", "json:target/cucumber.json" },
//        tags = {"@hmp"},features = "/Volumes/D Drive/Gdrive/GIThubProjects/jagsEvergreen/src/test/resources/feature")
//public class RunCukesTest extends AbstractTestNGCucumberTests {
//
//}


@RunWith(Cucumber.class)
@CucumberOptions(
        format = {
                "json:target/cucumber/wikipedia.json",
                "html:target/cucumber/wikipedia.html",
                "pretty"
        },
        tags = {"hmp"}
)

public class RunCukesTest {
}
