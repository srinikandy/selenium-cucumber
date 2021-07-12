package org.example;

import Utils.BrowserManipulation;
import Utils.DriverManager;
import Utils.WindowManagement;
import org.openqa.selenium.WebDriver;

public class WindowManagementExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverManager.getCurrentDriver();
        BrowserManipulation browser = new BrowserManipulation();
        WindowManagement window = new WindowManagement();
        browser.navigateTo("https://demoqa.com/forms");
        window.setWindowSize((short)1000,(short)1000);
        Thread.sleep(5000);
        window.maximizeWindow();
        Thread.sleep(5000);
        window.setFullScreenWindow();
        Thread.sleep(5000);
        driver.quit();
    }
}
