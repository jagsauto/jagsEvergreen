package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebDriverSimple {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Volumes/D Drive/Gdrive/jagsEvergreenPractice/src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.quit();

    }


}
