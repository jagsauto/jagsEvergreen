

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(monochrome = true, plugin = { "pretty", "html:target/cucumber", "json:target/cucumber.json" },
        tags = {"@hmp"},features = "src/test/resources/feature")
public class RunCukesTest extends AbstractTestNGCucumberTests {

}


/*@RunWith(Cucumber.class)
@CucumberOptions(
        format = {
                "json:target/cucumber/wikipedia.json",
                "html:target/cucumber/wikipedia.html",
                "pretty"
        },
        tags = {"hmp"}
)

public class RunCukesTest {
}*/
