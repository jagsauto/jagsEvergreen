package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChooseBrowser {

    public WebDriver getChromeDriver() throws Exception {
        if ( System.getProperty("os.name").toLowerCase().contains("mac")) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromewebdrivers/MacChromedriver");
        }

        else if ( System.getProperty("os.name").toLowerCase().contains("linux")) {
            System.setProperty("webdriver.chrome.driver","src/test/resources/chromewebdrivers/linuxchromedriver");
        }

        else { System.setProperty("webdriver.chrome.driver",  "src/test/resources/chromewebdrivers/Chromedriver.exe"); }
        WebDriver driver = new ChromeDriver();

        return driver;
    }
}
