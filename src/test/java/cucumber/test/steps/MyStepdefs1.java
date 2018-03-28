package cucumber.test.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class MyStepdefs1 {

    public static WebDriver getChromeDriver() throws Exception {
        if ( System.getProperty("os.name").toLowerCase().contains("mac")) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/MacChromedriver");
        }

        else if ( System.getProperty("os.name").toLowerCase().contains("linux")) {
            System.setProperty("webdriver.chrome.driver","src/test/resources/linuxchromedriver");
        }

        else { System.setProperty("webdriver.chrome.driver",  "src/test/resources/Chromedriver.exe"); }
        WebDriver driver = new ChromeDriver();

return driver;
    }

    @Given("^As end user i want to opne browser$")
    public void dvlsWebsite( ) throws Throwable {

        WebDriver   driver = getChromeDriver();

            driver.get("https://www.gov.uk/get-vehicle-information-from-dvla");
            driver.findElement(By.cssSelector("#get-started > a")).click();

            driver.findElement(By.cssSelector("#Vrm")).sendKeys("tokka");


            driver.findElement(By.cssSelector("#content > form > div > div > div.form-group.no-bottom > fieldset > button")).submit();
            try {
                Assert.assertFalse(driver.findElement(By.cssSelector(" #Vrm-error")).isDisplayed());
            }
            catch(Exception e){

                driver.quit();}


            driver.quit();



        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }



}
