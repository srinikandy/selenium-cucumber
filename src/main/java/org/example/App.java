package org.example;

import Utils.BrowserManipulation;
import Utils.DriverManager;
//import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WebDriver driver =DriverManager.getCurrentDriver();
        //driver.get("https://demoqa.com/automation-practice-form");
        String currentUrl = driver.getCurrentUrl();
        if(currentUrl.equalsIgnoreCase("https://demoqa.com/automation-practice-form")){
            System.out.println("url matched");
        }else{
            throw new IllegalArgumentException("url does not match");
        }
        String title = driver.getTitle();
        System.out.println(title);
        driver.quit();
    }
}


