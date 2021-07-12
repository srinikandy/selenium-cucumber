package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;

public class DriverManager {
    private static WebDriver driver;
    private static String browser ="firefox";

    public static WebDriver getCurrentDriver(){
        if(driver == null)
            getDriver();
        return driver;
    }

    private static WebDriver getDriver(){
        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty(
                    "webdriver.chrome.driver",
                    System.getProperty("user.dir") + File.separator
                            + "Drivers" + File.separator + "chromedriver.exe"
            );
            driver = new ChromeDriver();
        }else if(browser.equalsIgnoreCase("firefox")){
            System.setProperty(
                    "webdriver.gecko.driver",
                    System.getProperty("user.dir") + File.separator
                            + "Drivers" + File.separator + "geckodriver.exe"
            );
            driver = new FirefoxDriver();
        }else if(browser.equalsIgnoreCase("edge")){
            System.setProperty(
                    "webdriver.edge.driver",
                    System.getProperty("user.dir") + File.separator
                            + "Drivers" + File.separator + "msedgedriver.exe"
            );
            driver = new ChromeDriver();
        }else if(browser.equalsIgnoreCase("safari")){
            driver = new SafariDriver();
        }else{
            throw new IllegalArgumentException("Please pass valid browser");
        }
        return driver;
    }
}
