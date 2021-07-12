package org.example;

import Utils.BrowserManipulation;
import Utils.DriverManager;
import Utils.WindowsTabsManipulation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WindowsTabsManipulationExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverManager.getCurrentDriver();
        BrowserManipulation browser = new BrowserManipulation();
        WindowsTabsManipulation window = new WindowsTabsManipulation();
        browser.navigateTo("https://demoqa.com/browser-windows");
        Thread.sleep(3000);
        WebElement newWindow = driver.findElement(By.id("windowButton"));
        newWindow.click();
        Thread.sleep(3000);
        window.switchToNewWindow();
        String header = driver.findElement(By.id("sampleHeading")).getText();
        System.out.println(header);
        Thread.sleep(3000);
        window.closeTab();
        System.out.println(driver.findElement(By.className("main-header")).getText());
        Thread.sleep(3000);
        driver.quit();

    }
}
