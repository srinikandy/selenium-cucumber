package org.example;

import Utils.CaptureScreenshots;
import Utils.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

public class FluentWaitsExample {
    public static void main(String[] args) throws IOException {
        WebDriver driver = DriverManager.getCurrentDriver();
        driver.get("https://www.google.com/travel/");

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(NoSuchElementException.class);

        //WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(
                ExpectedConditions
                        .visibilityOfElementLocated(
                                By.xpath("//*[@placeholder=' for flights, hotels, and more']")
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
