package org.example;

import Utils.BrowserManipulation;
import Utils.DriverManager;
import Utils.Frames;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FramesExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverManager.getCurrentDriver();
        BrowserManipulation browser = new BrowserManipulation();
        browser.navigateTo("https://demoqa.com/frames");
        Frames frame = new Frames();
        frame.switchToFrame(driver.findElement(By.id("frame1")));
        String heading = driver.findElement(By.id("sampleHeading")).getText();
        System.out.println("Header name is : "+ heading);
        frame.switchToDefault();
        driver.findElement(By.xpath("//*[text()='Elements']")).click();
        Thread.sleep(5000);
        driver.quit();
    }

}
