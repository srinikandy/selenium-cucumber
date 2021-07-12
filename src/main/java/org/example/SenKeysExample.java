package org.example;

import Utils.CaptureScreenshots;
import Utils.DriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.io.IOException;
import java.time.Duration;

public class SenKeysExample {
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver = DriverManager.getCurrentDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/travel/");
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(NoSuchElementException.class);

        //WebDriverWait wait = new WebDriverWait(driver,20);
        WebElement flight = wait.until(
                ExpectedConditions
                        .visibilityOfElementLocated(
                                By.xpath("//*[@placeholder='Search for flights, hotels, and more']")
                        ));
        flight.sendKeys("Chicago");
        flight.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
    }

}
