package org.example;

import Utils.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsRightClick {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverManager.getCurrentDriver();
        driver.manage().window().maximize();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(
                ExpectedConditions
                        .visibilityOfElementLocated(
                                By.xpath("(//*[text()='right click me'])[1]")
                        ));
        var action = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("(//*[text()='right click me'])[1]"));
        action.contextClick(element).perform();
        Thread.sleep(3000);
        action.click(driver.findElement(By.xpath("(//*[text()='Edit'])[1]"))).perform();
        Thread.sleep(3000);
        driver.quit();
    }
}
