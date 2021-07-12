package org.example;

import Utils.BrowserManipulation;
import Utils.CaptureScreenshots;
import Utils.DriverManager;
import Utils.WindowManagement;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class TakeScreenshotExample {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver = DriverManager.getCurrentDriver();
        BrowserManipulation browser = new BrowserManipulation();
        WindowManagement window = new WindowManagement();
        window.maximizeWindow();
        browser.navigateTo("https://demoqa.com/forms");
        Thread.sleep(5000);
        CaptureScreenshots screenshots = new CaptureScreenshots();
        screenshots.captureScreenshotAsFile("ExampleScreenshot");
    }
}
