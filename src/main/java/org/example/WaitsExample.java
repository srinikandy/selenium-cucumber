package org.example;

import Utils.CaptureScreenshots;
import Utils.DriverManager;
import Utils.DriverWaits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class WaitsExample {
    public static void main(String[] args) throws IOException {
        WebDriver driver = DriverManager.getCurrentDriver();
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.google.com/travel/");

        WebDriverWait wait = new WebDriverWait(driver,20);

        wait.until(
                ExpectedConditions
                        .visibilityOfElementLocated(
                                By.xpath("//*[@placeholder='Search for flights, hotels, and more']")
                        ));

        driver.findElement(By.xpath("(//span[text()='Flights'])[1]")).click();

        wait.until(
                ExpectedConditions
                        .visibilityOfElementLocated(
                                By.xpath("(//span[text()='Round trip'])[1]")
                        ));
        CaptureScreenshots screenshot = new CaptureScreenshots();
                screenshot.captureScreenshotAsFile("flights");

    }

}
