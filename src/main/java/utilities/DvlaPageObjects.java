package utilities;

import org.openqa.selenium.By;

public class DvlaPageObjects {

 public String home_url = "https://www.gov.uk/get-vehicle-information-from-dvla";
 public By startnow_button =  By.cssSelector("#get-started > a");
 public By enter_venicle_number = By.cssSelector("#Vrm");
 public By continue_button = By.cssSelector("#content > form > div > div > div.form-group.no-bottom > fieldset > button");
 public By You_must_enter_your_registration_number_in_a_valid_format = By.cssSelector(" #Vrm-error");
}
