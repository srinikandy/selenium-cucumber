package org.example;

import Utils.BrowserManipulation;
import Utils.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static junit.framework.Assert.*;

public class BrowserNavigationExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverManager.getCurrentDriver();
        BrowserManipulation browser = new BrowserManipulation();
        browser.navigateTo("https://demoqa.com/forms");
        String title = driver.getTitle();
        //JUNIT assertion
        assertEquals("passed","ToolsQA",title);
        driver.findElement(By.xpath("//span[text()='Practice Form']")).click();
        Thread.sleep(3000);
        browser.navigateBack();
        Thread.sleep(3000);
        browser.navigateForward();
        Thread.sleep(3000);
        browser.refresh();
        Thread.sleep(3000);
        driver.quit();
    }
}
