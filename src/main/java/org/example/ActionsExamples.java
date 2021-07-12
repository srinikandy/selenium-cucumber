package org.example;

import Utils.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsExamples {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverManager.getCurrentDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(
                ExpectedConditions
                        .visibilityOfElementLocated(
                                By.xpath("//*[@data-testid='open-registration-form-button']")
                        ));
        var action = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']"));
        //Click
        action.click(element).perform();
        Thread.sleep(5000);
        //Enter data
        action.sendKeys(driver.findElement(By.name("firstname")),"john").perform();
        Thread.sleep(2000);
        driver.quit();
    }
}
