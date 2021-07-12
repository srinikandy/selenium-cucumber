package org.example;

import Utils.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsDragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverManager.getCurrentDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(
                ExpectedConditions
                        .visibilityOfElementLocated(
                                By.xpath("//*[text()='Create targets for draggable elements.']")
                        ));
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        var action = new Actions(driver);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        action.dragAndDrop(source,target).perform();
        Thread.sleep(4000);
        driver.switchTo().defaultContent();
        driver.quit();
    }
}
