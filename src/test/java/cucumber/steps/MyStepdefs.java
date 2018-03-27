package cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyStepdefs {
    @Given("^opne browser$")
   // @Test
    public void opneBrowser() throws Throwable {




            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/chromedriver");
            WebDriver driver = new ChromeDriver();

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
