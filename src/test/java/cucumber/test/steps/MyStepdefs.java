package cucumber.test.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import utilities.ChooseBrowser;
import utilities.DvlaPageObjects;

import java.io.File;
import java.lang.reflect.Array;
import java.util.List;

import static Dvla.filesInFolder.findFilesInfo;

public class MyStepdefs extends DvlaPageObjects {

    ChooseBrowser browser = new ChooseBrowser();
    WebDriver   driver = browser.getChromeDriver();
    static File folder = new File(System.getProperty("user.dir") + "/src/main/resources/filesinfolder/");


    @Given("^As end user i want to open browser and enter home url$")
    public void as_end_user_i_want_to_open_browser_and_enter_home_url() throws Throwable {
        driver.get(home_url);
        //throw new PendingException();
    }

    @And("^click on start  button$")
    public void click_on_start_button() throws Throwable {
        driver.findElement(startnow_button).click();
        //throw new PendingException();
    }

    @Then("^read registration number from inputfolder and enter$")
    public void read_registration_number_from_inputfolder_and_enter() throws Throwable {


        List reg_number = findFilesInfo(folder);

        driver.findElement(enter_venicle_number).sendKeys("");
        driver.findElement(continue_button).submit();
       // throw new PendingException();
    }





    @Given("^As end user i want to opne browser$")
    public void dvlsWebsite() throws Throwable {

        try {
                Assert.assertFalse(driver.findElement(You_must_enter_your_registration_number_in_a_valid_format).isDisplayed());
            }
            catch(Exception e){

              driver.quit();
            }
            driver.quit();
       // throw new PendingException();
    }



    public MyStepdefs() throws Exception {
    }

}
