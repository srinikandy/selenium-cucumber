package org.example;

import Utils.BrowserManipulation;
import Utils.DriverManager;
import Utils.ExecuteScript;
import Utils.WindowManagement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaExecutorExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverManager.getCurrentDriver();
        BrowserManipulation browser = new BrowserManipulation();
        WindowManagement window = new WindowManagement();
        window.maximizeWindow();
        browser.navigateTo("https://demoqa.com/");
        Thread.sleep(5000);
        ExecuteScript script = new ExecuteScript();
        script.scrollToEnd();
        Thread.sleep(5000);
        script.scrollToTop();
        Thread.sleep(5000);
        WebElement element =driver.findElement(By.xpath("(//*[@class='card mt-4 top-card'])[6]"));
        script.scrollToElement(element);
        Thread.sleep(5000);
        script.click(element);
        Thread.sleep(5000);
        driver.quit();
    }
}
